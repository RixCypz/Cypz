import java.io.*;
import java.util.Scanner;

public class Bag{
    private Item item = new Item();

    public int checkPotion(){
        return item.yourPotion();
    }

    public void dp() {
        if(item.yourPotion() > 0)
            item.decreasePotion();
        else if (item.yourPotion() <= 0)
            System.out.println("CAN'T USE POTION");
    }
    public void ip() {
        item.increasePotion();
    }
}