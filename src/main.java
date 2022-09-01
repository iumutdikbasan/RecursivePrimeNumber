import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Plase enter the number : ");
        int number = input.nextInt();
        prime(number,2);
    }
    static void prime(int number,int i ){
        if(i==number){
            System.out.println(number+" is prime number. ");
            return;
        }else if (number % i == 0){
            System.out.println(number+ "is not prime number. ");
            return;
        }
        prime(number,i+1);
    }
}
