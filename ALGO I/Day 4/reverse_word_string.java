class Solution {
    public String reverseWords(String str) {
        String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
            return result;
        
    }
}
