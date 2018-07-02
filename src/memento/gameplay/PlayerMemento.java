package memento.gameplay;

/**
 * @author tianshiming
 * @date 2018/7/2 22:52
 * @description
 */
public class PlayerMemento {
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

    public PlayerMemento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }
}
