# language: ru

@logintest
Функция: тестирование сайта

  Структура сценария: тест входа
    Если успешно открыта страница "http://site/login.html"
    И введены логин <login> и пароль <password> в поля ...
    То пользователь успешно входит в свой профиль
   Примеры:
    |login| password|
    |"ppetrov" | "asdasd@@hh1!" |
    |"ddmitriev"| "!1kjdhGG" |
    |"jk"| "askjdh"  |

