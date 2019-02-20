import java.io.*;
import java.util.Scanner;

public class Item{
    private int potion = 0;

    public int yourPotion(){
        return potion;
    }
    
    public int increasePotion(){
        return potion = potion + 1;
    }
    public int decreasePotion(){
        return potion = potion - 1;
    }


}