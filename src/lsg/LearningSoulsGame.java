package lsg;

import characters.Hero;
import characters.Monster;

public class LearningSoulsGame {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.printStats();
        Monster monster1 = new Monster("Studentatort");
        monster1.printStats();
        Monster monster2 = new Monster();
        monster2.printStats();
        Monster monster3 = new Monster();
        monster3.printStats();
        //6.2 : friendly car ils sont dans le même package
        //7.3 : public car il ne sont pas dans le même package
    }
}
