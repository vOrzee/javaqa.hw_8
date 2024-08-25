package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        // заполните другие поля
        post.birthday = new FormDate();
        post.birthday.day = 13;
        // заполните другие поля даты рождения
    }
}
