import com.company.Book;

import java.util.ArrayList;

//package com.company;
//
////import java.io.BufferedReader;
////import java.io.BufferedWriter;
////import java.io.FileReader;
////import java.io.FileWriter;
////import java.util.ArrayList;
////import java.util.Scanner;
////import javax.swing.*;
////import java.awt.*;
////import java.awt.event.*;
////import java.util.InputMismatchException;
//
public class Main {
    public static void main(String args[]) {
        Book b1 = new Book(1, "n1", "a1");
        Book b2 = new Book(2, "n2", "a2");
        Book b3 = new Book(3, "n3", "a3");
        Book b4 = new Book(4, "n4", "a4");
        Book b5 = new Book(5, "n5", "a5");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        try()

    }
}
//        Scanner in = new Scanner(System.in);
//
//        while (true) {
//
//            System.out.println(" PRESS [1] TO ADD USERS\n" +
//                    "\n" + "PRESS [2] TO LIST USERS\n" +
//                    "\n" + "PRESS [3] TO DELETE USERS\n" +
//                    "\n" + "PRESS [4] TO EXIT");
//
//            String choice = in.next();
//
//            if (choice.equals("1")) {
//
//                System.out.println("Insert id");
//                int id = in.nextInt();
//
//                System.out.println("Insert login");
//                String login = in.next();
//
//                System.out.println("Insert password");
//                String password = in.next();
//
//                User us = new User(id, login, password);
//                ArrayList users = getUsersList();
//                users.add(us);
//                saveUsersList(users);
//
//            } else if (choice.equals("2")) {
//
//                ArrayList players = getUsersList();
//                for (int i = 0; i < players.size(); i++) {
//                    System.out.println((i + 1) + ") " + players.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
//                }
//
//            } else if (choice.equals("3")) {
//
//                ArrayList players = getUsersList();
//                for (int i = 0; i < players.size(); i++) {
//                    System.out.println((i + 1) + ") " + players.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
//                }
//
//                System.out.println("Insert index of user to delete: ");
//                int index = in.nextInt();
//                players.remove(index - 1);
//
//                saveUsersList(players);
//
//            } else if (choice.equals("4")) {
//
//                System.exit(0);
//
//            } else {
//                System.out.println("Wrong command!!!");
//            }
//        }
//    }
//
//            public static void saveUsersList (ArrayList users){
//                try {
//
//                    BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
//                    for (Object u : users) {
//                        bw.write(u.toString());
//
//                    }
//                    bw.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            public static ArrayList getUsersList () {
//                ArrayList<User> users = new ArrayList<>();
//                try {
//                    BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
//                    String line = "";
//                    while ((line = br.readLine()) != null) {
//                        int id = Integer.parseInt(br.readLine());
//                        String login = br.readLine();
//                        String password = br.readLine();
//                        users.add(new User(id, login, password));
//
//                    }
//                } catch (Exception e) {
//
//                }
//                return users;
//            }
//}



//        Scanner in = new Scanner(System.in);
//        User []users =new User[5];
//        String new_name, new_surname;
//        int new_age;
//        int  res =0;
//
//
//        for(int i =0; i< users.length; i++){
//            System.out.println("Insert name");
//            new_name = in.next();
//
//            System.out.println("Insert surname");
//            new_surname = in.next();
//            System.out.println("Insert age");
//            new_age = in.nextInt();
//            try{
//            }catch(InputMismatchException exception){
//                new_age =0;
//            }
//            users[i] = new User(new_name, new_surname,new_age);
//        }
//        for(int i =0; i< users.length;i++){
//            res += users[i].age;
//        }
//        System.out.println(res/5);
//    }
//}










//        Scanner in = new Scanner(System.in);
//
//        Book b1 = new Book(1, "n1", "a1");
//        Book b2 = new Book(2, "n2", "a4");
//        Book b3 = new Book(3, "n3", "a3");
//        Book b4 = new Book(4, "n4", "a4");
//        Book b5 = new Book(5, "n5", "a5");
//        Book books_list[] = {b1,b2,b3,b4,b5};
//
//        Library l1 = new Library();
//        Book b6 = null;
//        l1.addBook(b6);
//        for(int i=0;i<books_list.length;i++){
//            try {
//                l1.addBook(books_list[i]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("The library is full");
//            }
//        }
//        l1.printBooks();
//    }
//}
