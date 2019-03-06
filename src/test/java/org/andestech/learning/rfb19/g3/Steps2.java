package org.andestech.learning.rfb19.g3;

import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;

public class Steps2 {

    private String site, login, password;

    @Если("успешно открыта страница {string}")
    public void успешно_открыта_страница(String site) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Вы зашли на сайт " + site);
        this.login = login;
    }

    @Если("введены логин {string} и пароль {string} в поля ...")
    public void введены_логин_и_пароль_в_поля(String login, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.printf("Login: %s, Pass: %s\n", login, password);
        this.login = login;
        this.password = password;

    }

    @То("пользователь успешно входит в свой профиль")
    public void пользователь_успешно_входит_в_свой_профиль() {
        // Write code here that turns the phrase above into concrete actions
        // use login and password
        System.out.println("Пользователь " + login + " выполнил вход!");
    }



}
