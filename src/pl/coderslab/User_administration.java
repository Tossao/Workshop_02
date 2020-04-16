package pl.coderslab;

import pl.coderslab.Dao.UserDao;
import pl.coderslab.model.User;

import java.util.Scanner;

public class User_administration {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        boolean programLoop = true;
        while (programLoop) {
            for (int i = 0; i < userDao.findAll().length; i++) {
                userDao.printUser(userDao.findAll()[i]);
            }
            System.out.println("Wpisz komende: \n" +
                    "add - dodawanie uzytkownika \n" +
                    "edit - edycja uzytkownika \n" +
                    "delete - kasowanie uzytkownika \n" +
                    "quit - wyjscie z programu");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.equals("add")){
                System.out.println("Podaj nazwę użytkownika:");
                String name = scanner.nextLine();
                System.out.println("Podaj email uzytkownika:");
                String email = scanner.nextLine();
                System.out.println("Podaj haslo uzytkownika:");
                String password = scanner.nextLine();

                boolean groupIdLoop = true;
                int groupIdInt = 0;
                while (groupIdLoop) {
                    System.out.println("Podaj id grupy uzytkownika:");
                    String groupIdString = scanner.nextLine();
                    try {
                        groupIdInt = Integer.parseInt(groupIdString);
                        groupIdLoop = false;
                    } catch (Exception ex) {
                        System.out.println("Podaj liczbę naturalna!");
                    }
                }
                User user = new User(1, name, email, password, groupIdInt);
                userDao.create(user);

            } else if (command.equals("edit")){
                boolean userIdLoop = true;
                int userIdInt = 0;
                while (userIdLoop) {
                    System.out.println("podaj id uzytkownika:");
                    String userIdString = scanner.nextLine();
                    try{
                        userIdInt = Integer.parseInt(userIdString);
                        userIdLoop = false;
                    }catch (Exception ex){
                        System.out.println("Podaj liczbę naturalną!");
                    }
                }

                System.out.println("Podaj nazwe uzytkownika:");
                String name = scanner.nextLine();
                System.out.println("Podaj email uzytkownika:");
                String email = scanner.nextLine();
                System.out.println("Podaj haslo uzytkownika:");
                String password = scanner.nextLine();

                boolean groupIdLoop = true;
                int groupIdInt = 0;
                while (groupIdLoop) {
                    System.out.println("Podaj ID grupy uzytkownika:");
                    String groupIdString = scanner.nextLine();
                    try {
                        groupIdInt = Integer.parseInt(groupIdString);
                        groupIdLoop = false;
                    } catch (Exception ex) {
                        System.out.println("Podaj liczbe naturalna!");
                    }
                }

                User user = new User(userIdInt, name, email, password, groupIdInt);
                userDao.update(user);

            } else if (command.equals("delete")) {
                boolean userIdLoop = true;
                int userIdInt = 0;
                while (userIdLoop) {
                    System.out.println("Podaj ID uzytkownika:");
                    String userIdString = scanner.nextLine();
                    try {
                        userIdInt = Integer.parseInt(userIdString);
                        userIdLoop = false;
                    } catch (Exception ex){
                        System.out.println("Podaj liczbe naturalna!");
                    }
                }
                userDao.delete(userIdInt);

            } else if (command.equals("quit")) {
                programLoop = false;

            } else {
                System.out.println("BLAD! Podaj poprawna komende:");
            }
        }
    }
}
