package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Choose your branch: ");
        System.out.println("1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:");
        Scanner in1 = new Scanner(System.in);
        int b = in1.nextInt();
        if (b == 1) {
            System.out.println("1 - Math, 2 - Physics:");
            Scanner in2 = new Scanner(System.in);
            int c = in2.nextInt();
            if (c == 1) {
                System.out.println("You are Financier");
            } else if (c == 2) {
                System.out.println("You are Engineer");
            }
        } else if (b == 2) {
            System.out.println("1 - History, 2 - Foreign Languages:");
            Scanner in2 = new Scanner(System.in);
            int d = in2.nextInt();
            if (d == 1) {
                System.out.println("You are Historic or Diplomat ");
            } else if (d == 2) {
                System.out.println("You are Translator");
            }
        } else if (b == 3) {
            System.out.println("1 - Drawing, 2 - Singing:");
            Scanner in2 = new Scanner(System.in);
            int f = in2.nextInt();
            if (f == 1) {
                System.out.println("You are Painter or Architect");
            } else if (f == 2) {
                System.out.println("You are Singer or Tamada");
            } else if (b == 4) {
                System.out.println("1 - Team, 2 - Individual:");
                Scanner in4 = new Scanner(System.in);
                int l = in4.nextInt();
                if (l == 1) {
                    System.out.println("You are footballer or Basketball player");
                } else if (l == 2) {
                    System.out.println("You are boxer or tennis player");
                }
            }
        }
    }
}
