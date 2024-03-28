import com.mongodb.ConnectionString;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoOperation {
    public static void main(String[] args) throws InterruptedException {

        List<String> businessids = new ArrayList<>();
        String srvConnectionString = "mongodb+srv://new-qa-test-user:NmOAMV0ZqvK3vfLW@mdmnext-qa-rel1ci5-blue.ple90.mongodb.net/test";


        try (MongoClient mongoClient = MongoClients.create(new ConnectionString(srvConnectionString))) {
            System.out.println("Connected to MongoDB.");

            MongoDatabase database = mongoClient.getDatabase("2GC7VIreXXIivKx2MjINix");

            MongoCollection<Document> collection = database.getCollection("ent_master.sh.ent");


            Document query = new Document();
            query.append("_meta.status", "ACTIVE");
            query.append("_content.firstName", "Avinash");


            FindIterable<Document> documents = collection.find(query);


            for (Document document : documents.limit(48)) {
                String s = extractSubstring(document.get("_meta").toString(), "", "");
                System.out.println(s);
                businessids.add(s);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        merge199Records(businessids);
        System.out.println("finished");
    }

    public static String extractSubstring(String input, String startMarker, String endMarker) {
        startMarker = "businessId=";
        int startIndex = input.indexOf(startMarker);
        if (startIndex == -1) {

            return "";
        }

        startIndex += startMarker.length(); // Move past the start marker

        int endIndex = input.indexOf(",", startIndex);
        if (endIndex == -1) {

            return "";
        }

        return input.substring(startIndex, endIndex);
    }

    static void merge199Records(List<String> businessIds) throws InterruptedException {
        RestAssured.baseURI = "https://qa-pod1-mdm.rel.infaqa.com/business-entity/public/api/v1/entity-group/c360.person";
        String your_access_token = "6UwMiCwVeSveGeFH5EuzaY";
        String contentType = "application/json";

        String bid1 = "MDM00000001ADN";
        System.out.println("Starting merging records");
        for(String bid:businessIds) {
            System.out.println("Merging : "+ bid1+" with "+bid);
            String requestBody = "    [\n" +
                    "        {\n" +
                    "            \"businessId\": \""+bid1+"\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"businessId\": \""+bid+"\"\n" +
                    "        }\n" +
                    "    ]";
            if(!bid.equals(bid1)) {
                Response response = RestAssured.given()
                        .header("IDS-SESSION-ID", your_access_token)
                        .header("Content-Type", contentType)
                        .body(requestBody)
                        .post();


                System.out.println("Response status code: " + response.getStatusCode());
                System.out.println("Response body: " + response.getBody().asString());
//                bid1 = response.getBody().jsonPath().getString("businessId");
                System.out.println("Successfully merged : " + bid1 + " with " + bid);
            }else{
                System.out.println("matched bids");
            }
        }
    }
}
