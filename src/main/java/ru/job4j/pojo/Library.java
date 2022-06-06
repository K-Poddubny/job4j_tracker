package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Золотая рыбка", 19);
        Book book2 = new Book("Колобок", 15);
        Book book3 = new Book("Clean code", 105);
        Book book4 = new Book("Алладин", 3);
        Book[] allBook = new Book[4];
        allBook[0] = book1;
        allBook[1] = book2;
        allBook[2] = book3;
        allBook[3] = book4;
        for (int index = 0; index < allBook.length; index++) {
            Book fairyTales = allBook[index];
            System.out.println(fairyTales.getName() + " - " + fairyTales.getPage());
        }
        System.out.println("Меняем местами элементы массива");
        Book temp = allBook[0];
        allBook[0] = allBook[3];
        allBook[3] = temp;
        for (int index = 0; index < allBook.length; index++) {
            Book fairyTales = allBook[index];
            System.out.println(fairyTales.getName() + " - " + fairyTales.getPage());
        }
        System.out.println("Выводим на консоль книгу с именем Clean code");
        for (int index = 0; index < allBook.length; index++) {
            Book fairyTales = allBook[index];
            if ("Clean code".equals(fairyTales.getName())) {
                System.out.println(fairyTales.getName() + " - " + fairyTales.getPage());
            }
        }
    }
}
