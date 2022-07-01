package com.company;


import com.company.model.Gender;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User(1, "Adilet", Gender.Male);
        User user2 = new User(2, "Sofia", Gender.Female);
        User user3 = new User(3, "Rey", Gender.Male);

        UserServiceImpl userService = new UserServiceImpl();
        userService.userAdd(user1);
        userService.userAdd(user2);
        userService.userAdd(user3);

        while (true) {
            System.out.println("" +
                    "\n1 - Найти пользователя по id " +
                    "\n2 - Удалить пользователя по id " +
                    "\n3 - Показать всех пользователей");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("Введите id пользователя");
                int id = sc.nextInt();
                userService.idFind(id);
            }else if (num == 2) {
                System.out.println("Введите id пользователя");
                int id = sc.nextInt();
                userService.idDelete(id);
            }else if (num == 3) {
                System.out.println("Пользователя: ");
                userService.allUsers();
            }
            System.out.println("\n---------------------------");
        }
    }
}