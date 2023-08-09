package strings;

import java.util.*;

public class GroupAnagram {


        public static List<List<String>> solver(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(i);
        }

        return new ArrayList<>(map.values());
    }

    // Drivers Method
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("ogd");
        list.add("god");
        list.add("atc");

        String[] srr={"cat","dog","ogd","god","atc"};

        System.out.println(solver(srr));
//        groupAnagram(list);
    }

}
