package characters;

public class Hero {
    private String name;
    private int life, maxLife, stamina, maxStamina;

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
        return ("[ characters.Hero ]\t" + name +"\t"+ "LIFE: " + life +"\t"+ "STAMINA: " + stamina + ((this.isAlive())? "\t(ALIVE)" :"\t(DEAD)"));
    }

    //equals
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    //constructeurs
    public Hero(){
        name = "Gregooninator";
        life = 100;
        maxLife = 100;
        stamina = 50;
        maxStamina = 50;
    }

    public Hero(String name){
        this.name = name;
        life = 100;
        maxLife = 100;
        stamina = 50;
        maxStamina = 50;
    }

    //methodes
    public void printStats(){
        System.out.println(this.toString());
    }

    public boolean isAlive(){
        return(this.getLife()>0);
    }
}
