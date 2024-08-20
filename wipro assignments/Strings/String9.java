class String9 {
    public static void main(String[] a) {
        if (a.length < 2) {
            System.out.println("Please provide two input strings.");
            return;
        }

        String b = a[0];
        String c = a[1];
        StringBuilder e = new StringBuilder();
        
        int minLength = Math.min(b.length(), c.length());
        for (int i = 0; i < minLength; i++) {
            e.append(b.charAt(i)).append(c.charAt(i));
        }
        
        if (b.length() > c.length()) {
            e.append(b.substring(minLength));
        } else if (c.length() > b.length()) {
            e.append(c.substring(minLength));
        }

        System.out.println(e.toString());
    }
}
