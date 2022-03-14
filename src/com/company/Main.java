package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<Tile> boneyard = new ArrayList<>();

    public static void main(String[] args) {
        createBoneyard();
        System.out.println("enter player 1's name");
        Player player1 = new Player(stringInput());
        System.out.println("enter player 2's name");
        Player player2 = new Player(stringInput());
        start(player1,player2);
        printBoneyard();

    }

    public static void createBoneyard(){
        for (int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++){
                Tile myTile = new Tile(i,j,false);
                if (i == j){
                    myTile.setDoub(true);
                }
                boneyard.add(myTile);
            }
        }
        Collections.shuffle(boneyard);
    }

    public static String stringInput(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static void giveTile(Player player){
        ArrayList<Tile> hold = new ArrayList<>();
        try{
            hold = player.getHand();
        }
        catch (Exception e){

        }
        hold.add(boneyard.get(0));
        boneyard.remove(0);
        player.setHand(hold);
    }

    public static void start(Player player1, Player player2){
        for (int i = 0; i < 7; i++){
            giveTile(player1);
            giveTile(player2);
        }
    }
    public static void printBoneyard(){
        for (int i = 0; i < boneyard.size(); i++){
            Tile myTile = boneyard.get(i);
            System.out.println(myTile.toString());
        }
    }
}
