package com.kevin51jiang.rtsengine.entities.units;

import com.kevin51jiang.rtsengine.Coord;
import com.kevin51jiang.rtsengine.entities.Entity;
import com.kevin51jiang.rtsengine.entities.Killable;
import com.kevin51jiang.rtsengine.entities.Movable;

public abstract class Unit extends Entity
        implements Killable, Movable {

    private int attack;
    private int speed;//tiles/tick
    private String name;
    private int kills;
    private Coord pos;
    private Coord dest;
    private int nextMove;

    public Unit(int attack, int speed, String name, int kills, Coord pos, Coord dest, int nextMove, Coord position, int health, int armor, float radius) {
        super(position, health, armor, radius);
        this.attack = attack;
        this.speed = speed;
        this.name = name;
        this.kills = kills;
        this.pos = pos;
        this.dest = dest;
        this.nextMove = nextMove;
    }
    
    
    
    public static void move(int direction){
        
    }
    
    public boolean isDead(){
        return (super.getHealth() == 0);
    }
    
    public void changeAttack(int deltaAttack){
        this.attack += deltaAttack;
    }
    
    public int getMovementRange() {
        return speed;
    }

    public void setMovementRange(int movementRange) {
        this.speed = movementRange;
    }

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return The amount of kills the current unit has
     */
    public int getKills() {
        return kills;
    }
    
    /**
     * Adds one kill to the current unit
     */
    public void addKill() {
        kills++;
    }
    
    /**
     * 
     * @param kills 
     */
    public void setKills(int kills) {
        this.kills = kills;
    }
    
    /**
     * Get the value of offensiveAttack
     *
     * @return the value of offensiveAttack
     */
    public int getOffensiveAttack() {
        return attack;
    }

    /**
     * Set the value of offensiveAttack
     *
     * @param offensiveAttack new value of offensiveAttack
     */
    public void setOffensiveAttack(int offensiveAttack) {
        this.attack = offensiveAttack;
    }
    
    

}
