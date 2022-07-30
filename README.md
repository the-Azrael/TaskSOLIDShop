# TaskSOLIDShop
Magics, DRY, SOLID. Задание 1


Магические числа, пример. Замена 
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/MenuItemsWithTree.java#L5
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/MenuItemsWithTree.java#L9
В данном случае номером отсчета дочерних объектов (пунктов меню) является 1
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/MenuItemsWithTree.java#L39
А каждый номер пункта меню увеличивается инкрементно на один. 
Таким образом каждый пункт меню имеет уникальный номер, по которому можно вызвать его метод execute()


DRY, примеры:
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/ProductAssortment.java#L3
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/Buyers.java#L3
В данном случае классы Ассортимента продуктов (ProductAssortment) и Покупатели(Buyers) расширяют класс LoadedFromJSON. 
Тем самым разные классы могут загружать данные из JSON не повторяя все методы загрузки в каждом классе.


S - Single Responsibility Principle (Принцип единственной ответственности)
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/Shop.java#L1
Класс Shop служит только для хранения и предоставления данных о магазине. Никаких других функций он не выполняет.
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/EnterData.java#L3
Класс ввода данных предназначен только для ввода данных.


O - Open Closed Principle (Принцип открытости/закрытости)
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/MenuItemsWithTree.java#L4
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/MenuItem.java#L1
Класс MenuItemWithTree (пункты меню в виде дерева, почти) наследуется от MenuItem. Все свойства MenuItem и основные методы инкапуслированы от потомков.
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/MIWTAddToBasket.java#L3
Далее от MenuItemWithTree наследуется, например класс MIWTAddToBasket, который выполняет функцию добавления продуктов в корзину.
Единственным перегружаемым методом является execute()


L - Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков)
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/Main.java#L45
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/Main.java#L46
Так как классы MIWTAuthorizeBuyer(Авторизация пользователя) и MIWTShowAssortment(Отображение ассортимента товара)
являются наследниками класс MenuItemWithTree, они равнозначно заменяют (подставляются вместо) класса предка в методе добавления пунктов меню.

I - Interface Segregation Principle (Принцип разделения интерфейса)
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/Main.java#L49
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/Main.java#L51
https://github.com/the-Azrael/TaskSOLIDShop/blob/b203879d5ce45532a17d8a4f65c5128304fed762/src/main/java/Main.java#L53
По сути каждый из этих объектов реализуют отдельные функции реализации интерфейса программы. 
И по сути изменение реализации данных классов в отдельности не затронет общий функционал программы.


D - Dependency Inversion Principle (Принцип инверсии зависимостей)

