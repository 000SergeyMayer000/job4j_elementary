package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
            } else {
                throw new UserNotFoundException("Пользователь не найден");
            }
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() && user.getUsername().length() > 3) {
            rsl = true;
        } else {
            throw new UserInvalidException("Пользователь не прошел валидацию");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        for (User user : users) {
            try {
                if (validate(user)) {
                    user = findUser(users, "Arsentev");
                    System.out.println(user);
                }
            } catch (UserInvalidException e) {
                e.printStackTrace();
                //   System.out.println("Юзер не валидный");
            } catch (UserNotFoundException e) {
                e.printStackTrace();
                //  System.out.println("ЮЗер нен найден");
            }
        }
    }
}