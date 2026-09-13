public class Builder {
    String name;
    Racee racee;
    Faction faction;
    Clas clas;
    int age;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setracee(Racee racee) {
        this.racee = racee;
        return this;
    }

    public Builder setFaction(Faction faction) {
        this.faction = faction;
        return this;
    }

    public Builder setClass(Clas clas) {
        this.clas = clas;
        return this;
    }

    public Pleyer build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Имя персонажа обязательно!");
        }
        if (age < 18) {
            throw new IllegalStateException("Персонаж должен быть строго 18 лет или старше!");
        }
        return new Pleyer(this);
    }
}