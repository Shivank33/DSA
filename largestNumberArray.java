//  Largest Number formed from an Array   (GeeksForGeeks)

class Solution {
    String printLargest(int n, String[] arr) {
        Comparator<String> customComparator = (str1, str2) -> {
            String s1 = str1 + str2;
            String s2 = str2 + str1;
            return s2.compareTo(s1);
        };

        Arrays.sort(arr, customComparator);

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}
