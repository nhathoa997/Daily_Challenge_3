package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import com.sun.org.apache.xalan.internal.lib.ExsltSets;

import java.lang.reflect.Array;
import java.util.*;

public class Main{
    private static int i;
//    public static Set<Integer> solution(Integer[] arr1, Integer[] arr2){
//
////        Set<Integer> arr2_set = new HashSet<Integer>(Arrays.asList(arr2));
////        Set<Integer> intersection = new HashSet<Integer>(arr2_set);
////        Set<Integer> arr1_set = new HashSet<Integer>(Arrays.asList(arr1));
////        return
//
//    }
//    public static int test(int x){
//        for(int i =0; i<0; i++) System.out.println("Hello");
//    }
    public static void main(String args[]) throws ArithmeticException, IOException, ClassNotFoundException {
        Scanner t = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name  = t.nextLine();
//        System.out.println("Enter your phone numbers: ");
//        int num = t.nextInt();
//        UsersInfo newUser = new UsersInfo(name, num);
//        UsersDAO dao = new UsersDAO();
//        dao.saveUser(newUser);
//        System.out.println("Output check: y/n");
//        String c = t.next();
//        switch(c){
//            case "y":
//                dao.getAllUsers();
//                break;
//            default: break;
//        }
        System.out.println("Enter a name:");
        String name = t.nextLine();
        UsersDAO dao = new UsersDAO();
        UsersInfo user = dao.returnUser(name);
        System.out.println(user.getName());
        System.out.println(user.getPhoneNumber());
    }

}
