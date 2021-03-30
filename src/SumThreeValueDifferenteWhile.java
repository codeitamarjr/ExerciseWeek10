import java.util.Scanner;

public class SumThreeValueDifferenteWhile {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Can you input the first number");
        num1 = keyboard.nextInt();

        System.out.println("Can you input the second number");
        num2 = keyboard.nextInt();

        while (num1==num2){
            System.out.println("Sorry, both numbers are the same, try again");
            num2 = keyboard.nextInt();
        }

        System.out.println("Now input the third number");
        num3 = keyboard.nextInt();

        while(num3==num1 | num3==num2){
            System.out.println("Sorry but you already input this number before, try again");
            num3=keyboard.nextInt();
        }

        System.out.println("You input the numbers "+num1+" ,"+num2+" ,"+num3+"" +
                "\nAnd the total is "+(num1+num2+num3));
    }
}
