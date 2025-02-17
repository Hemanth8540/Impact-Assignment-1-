class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        return arr[0].equals("0") ? "0" : String.join("", arr);
    }
}
