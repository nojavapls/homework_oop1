public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(1988, "Максим",  "Минск", "бренд-менеджер");
        Human human2 = new Human(1993, "Аня",  "Москва", "методист образовательных программ");
        Human human3 = new Human(1992, "Катя",  "Калининград", "продакт-менеджер");
        Human human4 = new Human(1995,  null, "Москва", "директор по развитию бизнеса");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());



    }
}
