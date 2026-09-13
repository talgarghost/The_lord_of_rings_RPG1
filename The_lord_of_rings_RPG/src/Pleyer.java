enum Racee { elf, Men, dwarf, orc,nazgul }
enum Faction { Gondor, Rohan, Rivendel, Dwarfs, Mis_mountain, Mordor, Isengard }
enum Clas { Archer, magic, swordman, assasin }

public class Pleyer {

        private final String name;
        private final int age;
        private final Racee Race;
        private final Faction faction;
        private final Clas player_class;

        public Pleyer(Builder builder) {
                this.name = builder.name;
                this.age = builder.age;
                this.Race = builder.racee;
                this.faction = builder.faction;
                this.player_class = builder.clas;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public Racee getRace() { return Race; }
        public Faction faction() { return faction; }
        public Clas getPlayer_class() { return player_class; }

        @Override
        public String toString() {
                return String.format("Имя: %s | Возраст: %d | Раса: %s | Фракция: %s | Класс: %s",
                        name, age, Race, faction, player_class);
        }
}