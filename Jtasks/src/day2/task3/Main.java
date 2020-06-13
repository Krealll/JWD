package com.krealll.day2.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("input NL as second param so as to show each number on new line");
        RandomManager randomManager= new RandomManager();
        if(args.length==1) {
            randomManager.showRand(args[0],"0");
        }
        else if(args.length==2){
            randomManager.showRand(args[0],args[1]);
        }
        else {
            System.out.println("Incorrect arguments");
        }
    }
}
