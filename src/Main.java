public class Main {
    public static void main(String[] args) {
      /*  Человек Максим = new Человек();
        Максим.setName("Максим");
        Максим.setTown("Минск");
        Максим.setYearOfBirth(1988);
        Максим.setJobTitle("бренд-менеджер");

        Человек Аня = new Человек();
        Аня.setName("Аня");
        Аня.setTown("Москва");
        Аня.setYearOfBirth(1993);
        Аня.setJobTitle("методист образовательных программ");

        Человек Катя = new Человек();
        Катя.setName("Катя");
        Катя.setTown("Калининград");
        Катя.setYearOfBirth(1992);
        Катя.setJobTitle("продакт-менеджер");

        Человек Артем = new Человек();
        Артем.setName("Артем");
        Артем.setTown("Москва");
        Артем.setYearOfBirth(1995);
        Артем.setJobTitle("директор по развитию бизнеса");*/

        Human Максим = new Human("", "Минск", 1988, "бренд-менеджер");
        Human Аня = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human Катя = new Human("Катя", "Калининград", 1992, null);
        Human Артем = new Human("Артем", "Москва", 1995, "директор по развитию");
        Human Владимир = new Human("Владимир", "Казань", 2001, "нигде не работает");

        System.out.println(Максим.toString());
        System.out.println(Аня.toString());
        System.out.println(Катя.toString());
        System.out.println(Артем.toString());
        System.out.println(Владимир.toString());
        System.out.println("__________________");

        Flower Роза = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower Хризантема = new Flower("Хризантема", 15, 5);
        Flower Пион = new Flower("Пион", "Англия", 69.9, 1);
        Flower Гипсофила = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(Роза.toString());
        System.out.println(Хризантема.toString());
        System.out.println(Пион.toString());
        System.out.println(Гипсофила.toString());
    }
}