package homeWork;

public class Main {
    public static void main(String[] args) {
        Printable[] technic  = {createObject("Cooler"), createObject("VacuumClear"), createObject("WashingMachine")};
        for (int i = 0; i < technic.length; i++) {
            technic[i].print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Cooler":
                return new Cooler(5, 8, 980, 12);
            case "VacuumClear":
                return new VacuumClear(6, 5, 600, 850);
            case "WashingMachine":
                return new WashingMachine(8, 12, 1250, 8);
        }
        return new Cooler(4, 6, 950, 12);
    }
}

//Дедлайн до следующего урока
//
//a) Доделать все пункты практического задания из презентации.
//b) Создать 2х уровневую иерархию из 4х классов (1й - родитель -->
// 2й, 3й, 4й - дочерние, с отличающимися полями).
//c) Создать Интерфейс Printable с методом void print();
//d) Реализовать интерфейс Printable классами 2й, 3й и 4й,
// переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
//e) В классе Main создать возвращаемый метод createObject(String className),
// который умеет создавать объекты класса 2й, 3й и 4й и после создания
// и задания свойств объекту метод возвращает ссылку на объект (пульт).
// Можно использовать switch для того чтоб определить какого типа
// нужно создать экземпляр объекта. Например если в параметре передается
// “2й” метод должен создать объект именно этого типа.
//f) В главном классе Main создать 3 различных объекта классов
// 2й, 3й и 4й с помощью метода
// createOcject, и распечатать по ним информацию методом print();








