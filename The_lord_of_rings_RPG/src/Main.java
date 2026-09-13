public class Main {
    public static void main(String[] args) {
        // 1. Кастомная сборка героя (Эомер) вручную через Fluent API
        Pleyer eomer = new Builder()
                .setName("Eomer")
                .setAge(26)
                .setracee(Racee.Men)
                .setFaction(Faction.Rohan)
                .setClass(Clas.swordman)
                .build();

        // 2. Создание стандартных героев через Director
        PlayerDirector director = new PlayerDirector();
        Pleyer aragorn = director.buildHerooflight(new Builder());
        Pleyer witchKing = director.buildHeroofEvil(new Builder());

        // 3. Вывод всех результатов в консоль
        System.out.println("--- Кастомный герой (Собран вручную) ---");
        System.out.println(eomer);

        System.out.println("\n--- Герои из Director (Готовые пресеты) ---");
        System.out.println(aragorn);
        System.out.println(witchKing);
    }
}