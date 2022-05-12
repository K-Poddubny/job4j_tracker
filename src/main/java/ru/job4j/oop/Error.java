package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 404, "У нас проблемки");
        Error error2 = new Error(false, 400, "Всё просто отлично");
        error.printInfoError();
        error1.printInfoError();
        error2.printInfoError();
    }

    public void printInfoError() {
        System.out.println("Статус: " + active);
        System.out.println("Ошибка: " + status);
        System.out.println("Текст ошибки: " + message);
        System.out.println();
    }

}
