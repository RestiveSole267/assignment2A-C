import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        int usdollar, bisondollar;
        float poundsterling, cpoundbison, usbritish;
        Scanner sc = new Scanner(System.in);
        System.out.println("[Bisonica Currency Exchange] ");
        System.out.println("General Bison welcomes you to Pax Bisonica! ");
        System.out.print("How many US Dollars do you have? ");
        usdollar = sc.nextInt();
        poundsterling = (float) 0.85;
        bisondollar = 5;
        usbritish = (float) (usdollar * poundsterling);
        cpoundbison = usbritish / bisondollar;
        String poundbison = String.format("%.2f", cpoundbison);
        System.out.println(usdollar + " US Dollar(s) is " + usbritish + " British Pound(s), which is worth " + poundbison + " Bison Dollar(s)!");
    }
}
