package memento.gameplay;

/**
 * @author tianshiming
 * @date 2018/7/2 22:49
 * @description
 */
public class Player {
    private int vitality;
    private int attack;
    private int defense;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void initPlayerState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public PlayerMemento saveState() {
        return new PlayerMemento(this.vitality,this.attack,this.defense);
    }

    public void recoveryState(PlayerMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void show() {
        System.out.println("vitality:" + this.vitality);
        System.out.println("attack:" + this.attack);
        System.out.println("defense:" + this.defense);
    }

    public void fight() {
        this.vitality = -10;
        this.attack = 1;
        this.defense = 0;
    }
}
