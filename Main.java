import java.io.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Novice mynovice = new Novice();
        String newname;
        int action=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        newname = scan.next();
        mynovice.insertName(newname);
        mynovice.status();

        while(mynovice.yourHP() >= 0){
            System.out.println("What do you want to do ?");
            System.out.println("1.Dungeon");
            System.out.println("2.Sleep");
            System.out.println("3.Buy potion");
            System.out.println("4.Use potion");
            System.out.println("5.Exit");
            action = scan.nextInt();
            if(action == 1){
                mynovice.dungeon();
                mynovice.levelUp();
            }
            else if(action == 2){
                mynovice.sleep();
                mynovice.levelUp();
            }
            else if(action == 3){
                if(mynovice.yourMoney() - 200 < 0){
                    System.out.println("Can not buy!");
                }
                else{
                    mynovice.getPotion();
                }
            }
            else if(action == 4){
                mynovice.usePotion();
            }
            else if(action == 5){
                break;
            }
            else{
                System.out.println("TRY AGIAN");
                mynovice.status();
            }
            mynovice.status();
        }
        System.out.println("YOU DIED!");
    }
}