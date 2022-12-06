public class Main {
    public static void main(String[] args) {
        Человек Максим = new Человек();
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
        Артем.setJobTitle("директор по развитию бизнеса");

        System.out.println(Максим.toString());
        System.out.println(Аня.toString());
        System.out.println(Катя.toString());
        System.out.println(Артем.toString());
    }
}