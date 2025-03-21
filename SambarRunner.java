class SambarRunner {
    public static void main(String... args) {
        String[] vegref = Sambar.vegie();
        for (String vegie : vegref) {
            System.out.println(vegie);
        }

        String condiRef = Sambar.quantity(); // Fixed method call
        System.out.println("quantity: " + condiRef);

        boolean temp = Sambar.condition(); // Fixed method call
        if (temp) {
            System.out.println("condition hot");
        } else {
            System.out.println("condition cold");
        }

        boolean state = Sambar.about(); // Fixed method call
        if (state) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}