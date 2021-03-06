## 
Требуется создать БД со следующими таблицами:<br>

- пользователи (id, email, пароль, дата создания);<br>
- клиенты (id, имя, дата создания);<br>
- заказы (id, id клиента, стоимость, дата создания);<br>

Написать API, которое под /data/ выдает данные из таблицы заказов и клиентов (в формате JSON), а под /update/ обновляет данные в таблицах (например обновление имени клиента или смена id клиента, указанного в заказе).  Данные операции должны допускаться только авторизованным пользователям. Пользователь считается авторизированным, если он делает HTTP запрос:<br>

- с Bearer токеном (указан на сервере)<br>
- с JWT токеном (назначается клиенту сервером на основе логина+пароля)<br>

Способы авторизации зависят от пути: возможна как и Bearer авторизация, так  JWT авторизация для запросов под /update/, /data/.<br>

Ограничения:<br>
- Для авторизации использовать модуль spring security.<br>
- Использовать либо JDBC, либо JPA для запросов (оба содержатся в зависимостях проекта)<br>
- Выход из системы (logout) необходим<br>
- Версия 8 Джавы<br>

Допускается:<br>
- Менять архитектуру проекта любым способом<br>
- Добавлять зависимости в проект<br>
- Создавать дополнительные поля в таблицы БД<br>

Приветствуется:<br>
- Логирование через logback<br>
- Аргументированный подход по созданию архитектуры проекта<br>
- Дополнительные запросы и функционал<br>
- Графический интерфейс (VUE.JS, JFX)<br>

_Solution_<br>
- **auth-service** - сервис на котором проходит генерация токена логином и паролем<br>
- **gateway** - шлюз через который соединяемся с сервисами<br>
- **eureka** - сервер на котором происходит регистрация сервисов<br>
- **manipulation**-service - сервис на котором происходит работа с апи через проверку токена<br>

Получаем токен с помощью шлюза на auth-service<br>
![](img/token.png)
Добавляем клиента<br>
![](img/1.png)<br>
Добавляем заказ<br>
![](img/2.png)<br>
Получаем всех клиентов<br>
![](img/3.png)<br>
Получаем все заказы<br>
![](img/4.png)<br>
Измсеняем заказ по id<br>
![](img/5.png)<br>
Изменяем имя клиента по id<br>
![](img/6.png)

### Контакты для связи<br>
<img src="https://img.icons8.com/clouds/100/000000/gmail-new.png" width="10"/> arvikvan@gmail.com<br>

[@ArvikV](https://t.me/ArvikV)

###Используемые технологии:
- Gradle
- Spring Cloud, Security, Data

