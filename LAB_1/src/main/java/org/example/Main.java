package org.example;

public class Main {
    public static void main(String[] args) {
        Kont<String>text=new Kont<>();
        text.addToList("dog");
        text.addToList("cat");
        text.addToList("bird");
        text.addToList("wolf");
        text.addToList("mouse");
        System.out.println("Наш список: ");
        text.Output();
        System.out.println();
        System.out.println("Удалим wolf: ");
        text.delELem("wolf");
        text.Output();
        System.out.println();
        System.out.println("Возьмем элемент из головы: ");
        String e;
        e = text.getFromHead();
        System.out.println(e);
        System.out.println();
        System.out.println("Возьмем элемент из хвоста: ");
        String s;
        s = text.getData();
        System.out.println(s);
    }
}