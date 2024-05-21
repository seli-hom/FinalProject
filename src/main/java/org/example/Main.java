package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Address adress = new Address(1,"hello","montreal",
                "qc","h5p 3e6","canada");
        Department department = new Department("d12345", "CSop");

        System.out.print(department);
    }
}