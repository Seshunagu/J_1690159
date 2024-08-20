	class String8 {
    public static void main(String[] a) {
        if (a.length == 0) {
            System.out.println("Please provide an input string.");
            return;
        }

        String input = a[0];
        StringBuilder result = new StringBuilder();
          
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                i += 1;
            } else if (i > 0 && input.charAt(i - 1) == '*') {
                continue;
            } else if (i < input.length() - 1 && input.charAt(i + 1) == '*') {
                i += 1;
            } else { 
                result.append(input.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}
