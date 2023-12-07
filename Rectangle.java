package ss1.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); //khai bao doi tuong Scanner
        System.out.println("Enter wifth: ");
        width = scanner.nextFloat(); //nhap chieu rong
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
