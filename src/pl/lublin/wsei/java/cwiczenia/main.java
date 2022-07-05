package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    // write your code here

    System.out.println("Hello Java world\n");

    //A print
    System.out.print("Olaf");
    System.out.print("ma");
    System.out.print("marchewka");

    System.out.println("\n__________________________________________________________\n");

    //B println
    System.out.println("Olaf");
    System.out.println("ma");
    System.out.println("marchewka");

    System.out.println("\n__________________________________________________________\n");

    //C print \n
    System.out.print("Olaf\n");
    System.out.print("ma\n");
    System.out.print("marchewka\n");

    //D i E zmienne i printf                                                                                                              // println stawia enter po zakończonej lini a print nie
    System.out.println("\n__________________________________________________________\n");
    int a = 3;
    double b = 4.21;
    String s = "abecadło";
    System.out.printf("a =%d, b= %f, s= %20s %n", a, b, s);

    //G
    System.out.println("\n__________________________________________________________\n");
    System.out.println("Nazywaliśmy to „witaminą B3”");
    System.out.print("\n//z prefiksowaniem\n");
    System.out.print("Nazywaliśmy\n");
    System.out.print("to\n");
    System.out.print("„witaminą”\n");
    System.out.print("B3\n");

    //G
    System.out.println("\n__________________________________________________________\n");
    System.out.printf("alfa\tsin(alfa)\n");
    for (int i = 0; i < 370; i += 10)
        System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));

    //H
    System.out.println("\n__________________________________________________________\n");

    System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
    for (int i = 1; i < 30; i *= 2)

        System.out.printf("%d\t\t%.0f\t\t\t%.0f\t\n", i, Math.log(i) / Math.log(2), i + Math.log(i) / Math.log(2));


    Scanner input = new Scanner(System.in);
    int num1, num2;
    System.out.print("Podaj piwerwszą liczbę: ");
    num1 = input.nextInt();
    System.out.print("Podaj drugą liczbę: ");
    num2 = input.nextInt();
    System.out.printf("SUMA: %d + %d = %d%n", num1, num2, num1 + num2);

    System.out.println("\n__________________________________________________________\n");
    //Pkt 9
    System.out.print("Podanie '0' zakończy proces\n");
    Scanner input2 = new Scanner(System.in);
    int num1_2 = 0, num2_2 = 0;
    do {
        System.out.print("Podaj piwerwszą liczbę: ");
        num1_2 = input2.nextInt();
        if (num1_2 == 0) break;

        System.out.print("Podaj drugą liczbę: ");
        num2_2 = input2.nextInt();
        if (num2_2 == 0) break;

        System.out.printf("SUMA: %d + %d = %d%n", num1_2, num2_2, num1_2 + num2_2);
    }
    while (true);

}

}
