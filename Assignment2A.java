import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){
        int people, group, b, c;
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        people = sc.nextInt();
        System.out.print("How many groups do you want: ");
        group = sc.nextInt();
        a = group / people;
        b = group *  Math.round(a);
        c = people - b;
        System.out.print("If we divide " + people + " people in " + group + " groups evenly, " + c + " person/people will be left without a group.");
    }
}
