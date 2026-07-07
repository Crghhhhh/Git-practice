import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        int storedno=14;
        int guessno=0;
        Scanner sc=new Scanner(System.in);
        while(guessno!=storedno){
        System.out.println("enter the number to guess");
         guessno=sc.nextInt();

        if(guessno==storedno){
            System.out.println("you guess it right");

        }
        else if(guessno<storedno){
            System.out.println("you are guess is too low");
        }
        else if(guessno>storedno){
            System.out.println("you are guess is too high");
        }
        
    }
    sc.close();

}
}