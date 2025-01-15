package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CsvGenerator {

    // Function to generate a random string of length between 5 and 8
    private static String generateRandomString(int minLength, int maxLength) {
        int length = new Random().nextInt(maxLength - minLength + 1) + minLength; // Random length between minLength and maxLength
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            // Append a random letter (A-Z or a-z)
            sb.append((char) ('a' + new Random().nextInt(26)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("/Users/kavinash/Downloads/output.csv")) {
            // Write the header row
            writer.append("sourcepkey,businessid,firstname,lastname\n");

            // Generate 100,000 rows
            for (int i = 1; i <= 100000; i++) {
                // Generate unique sourcepkey
                String sourcepkey = "sspkey" + i;

                String businessid;

                // For the first 50,000 rows, businessid repeats every 50 rows
                if (i <= 50000) {
                    businessid = "bbid" + ((i - 1) / 50 + 1); // Repeats business ids bid1 to bid1000
                } else {
                    // For rows after 50,000, businessid is unique and incremental
                    businessid = "bbid" + (i - 4999); // Unique business IDs starting from bid1001
                }

                // Generate random firstname and lastname with length between 5 and 8 characters
                String firstname = generateRandomString(9, 10);
                String lastname = generateRandomString(9, 10);

                // Write the current row to the file
                writer.append(sourcepkey)
                        .append(",")
                        .append(businessid)
                        .append(",")
                        .append(firstname)
                        .append(",")
                        .append(lastname)
                        .append("\n");
            }

            System.out.println("CSV file 'output.csv' has been generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
