public class Main {

    public static void main(String[] args) {

        byte myByteValue= 120;
        short myShortValue = 100;
        int myInstValue = 1500;

        long totalValue = 5000L + 10L * (myByteValue + myInstValue + myShortValue);
        System.out.println("totalValue = " + totalValue);



    }
}
