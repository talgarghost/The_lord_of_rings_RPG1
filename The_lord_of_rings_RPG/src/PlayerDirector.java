public class PlayerDirector {
    public Pleyer buildHerooflight(Builder builder){
        return builder.setName("Aragorn")
                .setAge(19)
                .setracee(Racee.Men)
                .setFaction(Faction.Gondor)
                .setClass(Clas.swordman)
                .build();
    }
    public Pleyer buildHeroofEvil(Builder builder){
        return builder.setName("Witch-king")
                .setAge(32)
                .setracee(Racee.nazgul)
                .setFaction(Faction.Mordor)
                .setClass(Clas.magic)
                .build();
}
}
