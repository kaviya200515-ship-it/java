class Gra {
    public static void main(String[] args) {
        int mark = 85;
        
        if (mark >= 90) {
            System.out.println("A grade");
        } else if (mark >= 60) {
            System.out.println("B grade");
        } else if (mark >= 35) {
            System.out.println("C grade");
        } else {
            System.out.println("No grade");
        }
    }
}