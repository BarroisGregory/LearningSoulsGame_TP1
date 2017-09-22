package characters;

public class Monster {
    private String name;
    private int life, maxLife, stamina, maxStamina;
    private static int INSTANCES_COUNT=0;
    //accesseurs

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    //toString
    @Override
    public String toString() {
        return ("[ characters.Monster ]\t" + name +"\t"+ "LIFE: " + life +"\t"+ "STAMINA: " + stamina + ((this.isAlive())? "\t(ALIVE)" :"\t(DEAD)"));
    }

    //equals
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    //constructeurs
    public Monster(){
        INSTANCES_COUNT ++;
        name = "Monster_"+ INSTANCES_COUNT;
        life = 10;
        maxLife = 10;
        stamina = 10;
        maxStamina = 10;
    }

    public Monster(String name){
        this.name = name;
        life = 10;
        maxLife = 10;
        stamina = 10;
        maxStamina = 10;
        INSTANCES_COUNT ++;
    }

    //methodes
    public void printStats(){
        System.out.println(this.toString());
    }

    public boolean isAlive(){
        return(this.getLife()>0);
    }
}
