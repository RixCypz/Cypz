import java.io.*;
import java.util.Scanner;

public class Novice{
    private String name;
    private int hp=1000;
    private int maxhp = 1000;
    private int mp=150;
    private int maxmp = 150;
    private int exp = 0;
    private int level = 1;
    private int money=100;
    private Bag bag = new Bag();

    public void status(){
        System.out.println("----------------------");
        System.out.println("        STATUS        ");
        System.out.println("----------------------");
        System.out.println("Your name :"+name);
        System.out.println("HP: " + hp);
        System.out.println("Max HP: " + maxhp);
        System.out.println("MP: " + mp);
        System.out.println("Level: " + level);
        System.out.println("Max MP: " + maxmp);
        System.out.println("Cash: " + money);
        System.out.println("EXP: " + exp);
        System.out.println("----------------------");
    }
    public void insertName(String yourname){
        name = yourname;
    }
    public int yourHP(){
        return hp;
    }    
    public int yourMaxHP(){
        return maxhp;
    }    
    public int yourMaxMP(){
        return maxmp;
    }    
    public int yourMP(){
        return mp;
    } 
    public int yourEXP(){
        return exp;
    }    
    public int yourLevel(){
        return level;
    } 
    public int yourMoney(){
        return money;
    } 
    public void sleep(){
        if (hp + 10 <= maxhp)
            hp = hp + 10;
        else
            hp = maxhp;
    }
    public void dungeon(){
        hp = hp - 35;
        money = money + 100;
        exp = exp + 20;
    }
    public void getPotion(){
        money = money - 200;
        bag.ip();
        System.out.println("Your potion is: " + bag.checkPotion());
    }
    public void levelUp(){
        if(exp >= 50){
            level = level + 1;
            exp = 0;
        }
    }
    public void usePotion(){
        System.out.println("Your potion is: " + bag.checkPotion());
        bag.dp();
        if (hp + 200 <= maxhp)
            hp = hp + 200;
        else
            hp = maxhp;
        System.out.println("Your potion is: " + bag.checkPotion());
    }

}