package be.intecbrussel.hoofdstuk7.opdracht2;

import java.util.Scanner;

public class ArrayInput
{
    public static void main(String[] args)
    {
        System.out.println("Ecrit une phrase.");
        Scanner clavier = new Scanner(System.in);
        String phrase = clavier.nextLine();
        System.out.println("La phrase est : " + phrase);
        String[] mots = phrase.split(" ");
        for (String i: mots)
        {
            System.out.println(i);
        }
    }
}
