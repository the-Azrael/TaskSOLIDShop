# TaskSOLIDShop
Magics, DRY, SOLID. Задание 1


Магические числа, пример. Замена 
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/MenuItemsWithTree.java#L5
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/MenuItemsWithTree.java#L9
В данном случае номером отсчета дочерних объектов (пунктов меню) является 1
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/MenuItemsWithTree.java#L39
А каждый номер пункта меню увеличивается инкрементно на один. Таким образом каждый пункт меню имеет уникальный номер, по которому можно вызвать его метод execute()


DRY, примеры:
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/ProductAssortment.java#L3
https://github.com/the-Azrael/TaskSOLIDShop/blob/6dc0256330d88eca114f4014fbb0c875a8cbffc3/src/main/java/Buyers.java#L3
В данном случае классы расширяют класс LoadedFromJSON. Тем самым разные классы могут загружать данные из JSON не повторяя методы загрузки.


S - Single Responsibility Principle (Принцип единственной ответственности)
https://github.com/the-Azrael/TaskSOLIDShop/blob/d2974ba2aa2aceaaeeb224fedabf2f8508068770/src/main/java/Shop.java#L1
Класс Shop служит только для хранения и предоставления данных о магазине.


O - Open Closed Principle (Принцип открытости/закрытости)
Класс MenuItemWithTree


L - Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков)


I - Interface Segregation Principle (Принцип разделения интерфейса)


D - Dependency Inversion Principle (Принцип инверсии зависимостей)
