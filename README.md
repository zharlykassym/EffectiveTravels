Техническое задание от Effective Mobile, выполняемое из интереса к практике.
1. Спроектировал многомодульную архитектуру по принципам Clean Architecture.
2. Настроил Gradle зависимости по принципу централизации зависимостей в buildSrc.
3. Настроил Dependency Injection с помощью Dagger2
4. Настроил работу Retrofit, ApiService, прописал Dto, Mappers, UseCases, Entities.
5. Написал ViewModelFactory. Работаю над ViewModel.
---





ТЗ на разработку приложения для поиска билетов
Содержание

Содержание
Общая информация
Используемые источники
Рекомендуемый стек технологий
1. Меню
2. Главная. Первый вход
2. Поиск
3. Поиск. Выбрана страна
4. Просмотреть все билеты

Общая информация
Названия экранов в техническом задании соответствуют названию экранов в Figma
Данные для экранов, полученные из запросов на сервер и данные, продемонстрированные в Figma могут отличаться
Отрисовка элементов из макета в Figma должна быть идентична
Все шрифты, цвета и иконки можно брать из Figma
На выполнение ТЗ дается 5 дней с момента получения этого файла
Используемые источники
Ссылка на макеты
https://www.figma.com/file/u59qhHjKOpI2GmKuDRZBf8/Effective-Mobile.-%D0%A2%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%B7%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5-%D0%B4%D0%BB%D1%8F-%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D1%87%D0%B8%D0%BA%D0%BE%D0%B2.-%D0%9F%D1%80%D0%BE%D0%B4%D0%B0%D0%B6%D0%B0-%D0%B0%D0%B2%D0%B8%D0%B0%D0%B1%D0%B8%D0%BB%D0%B5%D1%82%D0%BE%D0%B2?type=design&node-id=1-7&mode=design&t=Yd4mLgd2ubiVJ1Hc-0
JSON API мок. Используется для отображения экрана “Главная. Первый вход”.
https://drive.usercontent.google.com/u/0/uc?id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav&export=download




JSON API мок. Используется для отображения экрана “Поиск. Выбрана страна”.
https://drive.usercontent.google.com/u/0/uc?id=13WhZ5ahHBwMiHRXxWPq-bYlRVRwAujta&export=download



JSON API мок. Используется для отображения экранов: “Посмотреть все билеты”.
https://drive.google.com/uc?export=download&id=1HogOsz4hWkRwco4kud3isZHFQLUAwNBA





Рекомендуемый стек технологий
Android:
Kotlin 
Retrofit - библиотека по работе с http. Обязательна к использованию. 
Корутины (но если на RX сможете, тоже отлично)
﻿Flow или LiveData или RX 
﻿﻿Dagger или Koin
﻿﻿MVVM
﻿﻿AdapterDelegates
Верстка обычная на XML
Clean Architecture
Многомодульность (обязательно)
Room (не обязательно, если время будет)

1. Меню

![image](https://github.com/user-attachments/assets/beefd927-b401-469e-a5a7-3fd4bd96e5d2)


Независимо от выбранного экрана в приложении отображается меню. Оно включает фиксированный набор кнопок. В очередности отображения слева направо:
Авиабилеты - переход к основному сценарию. Все сценарии, описанные в данном ТЗ, реализуются на этом пункте меню.
Отели - переход к экрану с заглушкой.
Короче - переход к экрану с заглушкой.
Подписки - переход к экрану с заглушкой.
Профиль - переход к экрану с заглушкой.

2. Главная. Первый вход
При входе в приложение отображается данный экран.

![image](https://github.com/user-attachments/assets/72bda594-a6f1-469b-983a-6149efd41d8b)

![image](https://github.com/user-attachments/assets/dd70528d-c129-4b08-a064-82283410df4e)




1 - хардкод согласно макету.
2 - поле ввода места отправления. В качестве подсказки на поле отображается надпись “Откуда - Москва”. Для ввода доступна только кириллица. Последнее введенное пользователем значение сохраняется в кэше. При следующем входе в приложение должно отображаться последнее введенное пользователем значение. 
3 - поле ввода места прибытия. В качестве подсказки на поле отображается надпись “Куда - Турция”. Для ввода доступна только кириллица. При активации этого отображается модальное окно с дополнительной информацией, см. раздел 2 (Поиск).
4 - хардкод согласно макету.
5 - лента с предложениями. Просмотр ленты осуществляется посредством свайпа. Исходное положение ленты, как на макете. Данные берутся из ответа  сервера. См. JSON.
Данные берутся из массива offers. Каждый отображаемый объект некликабелен. Объекты отображаются в том порядке, в котором приходят в json. Заголовок берется из поля title, название города - из поля town, цена - из поля price.value. Цена должна отображаться согласно макету - с указанными иконками, в цене должно быть разделение между разрядами через пробел.
Изображение хардкодится по id объекта согласно таблице:
id
Изображение
1
![image](https://github.com/user-attachments/assets/205b85e4-2e89-4826-91c2-d4e5dd065b54)

2
![image](https://github.com/user-attachments/assets/32982747-b356-4048-a663-fe0aed630a16)

3
![image](https://github.com/user-attachments/assets/2f7d3a21-e07f-4416-97fb-2acb11a3fc48)




6 - эти данные с макетов не учитывать, не отображать.

2. Поиск
При клике на поле ввода места прибытия отображается модальное окно:
![image](https://github.com/user-attachments/assets/688397e9-8c26-4cd8-b0a3-c22a377f44fd)

![image](https://github.com/user-attachments/assets/7e938c47-f01f-4381-8a0a-ae6ce9a272b3)


Справа от поля ввода отображается иконка крестика. При клике - поле очищается.

7 - подсказки. Элементы - хардкод. 
При выборе “Сложный маршрут” отображается заглушка с возможностью вернуть на предыдущий экран.
При выборе “Куда угодно” в поле ввода места прибытия подставляется соотв. текст.
При выборе “Выходные” отображается заглушка с возможностью вернуть на предыдущий экран.
При выборе “Горящие билеты” отображается заглушка с возможностью вернуть на предыдущий экран.

8 - рекомендации мест прибытия. Хардкод согласно макету. Элементы кликабельны. При выборе в поле ввода места прибытия проставляется название соотв. города.

Когда поле ввода места прибытия заполнено, отображение экрана меняется, см. раздел 3 “Поиск. Выбрана страна”.
3. Поиск. Выбрана страна

![image](https://github.com/user-attachments/assets/059c6eb9-0091-41d3-af82-eb21e0c68a38)

![image](https://github.com/user-attachments/assets/32e36e02-de71-4454-b954-02e6645279aa)



9 - кнопка, которая меняется место отправления и прибытия местами.
10 - дата отправления. По умолчанию проставляется текущая.При клике дается возможность поменять дату через нативный календарь. Поле не может быть незаполненным.
11 - дата обратного билета. При клике отображается нативный календарь. Поле опциональное.
12 - число пассажиров и класс. По умолчанию отображается, как на макете. Поле нефункциональное.
13 - фильтры. Нефункциональный элемент.
14 - рекомендации билетов. Данные берутся из ответа  сервера. См. JSON. Отображаются только первые 3 объекта - в том порядке, как пришли в json. Данные берутся из массива tickets_offers.
Название компании берется из поля title. Цена - из поля price.value. Цена должна отображаться согласно макету с учетом выделения разрядов. Время - перечисляют через пробел значения из массива time_range. Иконки слева от названия компании - хардкод: первый объект с красной иконкой, второй - с синей, третий - с белой.
При клике на объект переход никуда не осуществляется.
Кнопка “Показать все” не отображается. 
15 - Кнопка поиска билетов. Хардкод. При клике на объект осуществляется переход к экрану “Просмотреть все билеты” (раздел 4). 
16 - нефункциональный элемент. Реализация элемента - по желанию.

4. Просмотреть все билеты
Экран билетов

![image](https://github.com/user-attachments/assets/2982cbeb-5079-490b-a654-8e461a44b143)

![image](https://github.com/user-attachments/assets/05b59065-d5b4-45ba-9113-07b14c07f7f9)



1 - иконка возврата назад. Возвращается на экран “Поиск. Выбрана страна”, раздел 3.
2 - данные для поиска. Отображаются ранее введенные пользователем данные.
3 - список билетов. Просмотр билетов осуществляется скроллом. Отображаемые данные берутся из JSON из массива tickets.
4 - кнопка фильтра. Нефункциональный элемент.
5 - хардкодный нефункциональный элемент.

Карточка билета
![image](https://github.com/user-attachments/assets/4369dbc3-22fd-4e6f-9130-bfdc11fbe00b)


1 - Бейдж. Значение берется из поля badge. Элемент опциональный, не пришел - не отображаем.
2 - Цена. Отображается по общей ранее описанной в ТЗ логике. Берется из поля price.value
3 - символ рубля. Хардкод.
4 - время отправления. Высчитывается из поля departure.date
5 - код аэропорта отправления. Берется из поля departure.airport
6 - время прибытия. Высчитывается из поля arrival.date
7 - код аэропорта прибытия. Берется из поля arrival.airport
8 - время полета. Высчитывается, как разница времени прибытия и отправления (обратить внимание, что даты отправления и прибытия могут быть разными).
9 - опциональный текст. Через слэш отображается “Без пересадок”, если has_transfer = false. Иначе текст со слэшем не отображается.
