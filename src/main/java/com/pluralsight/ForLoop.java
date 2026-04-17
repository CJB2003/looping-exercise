package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        //For loop that counts down from 10 to 1 then prints "Launch!"
        for(int i = 10;  i > 0; i--) {
            System.out.println(i);
            //Slows the count by pausing each second between numbers
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
