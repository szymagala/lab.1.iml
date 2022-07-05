package pl.lublin.wsei.java.cwiczenia.lab;

import pl.lublin.wsei.java.cwiczenia.lab.Account.Account;

import java.util.Scanner;

public class account {

    public static void account(String[] args) {
        Account acc = new Account();
        //acc.setName("Olaf Domagała");
        acc.name = "Olaf Domagała"
        System.out.println(acc.getName());
    }
}
