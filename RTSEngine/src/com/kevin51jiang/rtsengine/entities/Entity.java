/*
 * The MIT License
 *
 * Copyright 2018 Kevin Jiang <kevin51jiang@email.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.kevin51jiang.rtsengine.entities;

import com.kevin51jiang.rtsengine.Coord;

/**
 * General Entity object
 * @author Kevin Jiang <kevin51jiang@email.com>
 */
public abstract class Entity {

    Coord position;
    private int health;
    private int armor;
    private float radius; 

    /**
     * Usually used to invulnerable units.
     * @param startPos 
     * @param radius 
     */
    public Entity(Coord startPos, float radius) {
        this.position = startPos;
        this.radius = radius;
    }

    /**
     * Usually used for units (in general)
     * @param position
     * @param health
     * @param armor
     * @param radius 
     */
    public Entity(Coord position, int health, int armor, float radius) {
        this.position = position;
        this.health = health;
        this.armor = armor;
        this.radius = radius;
    }

    public Coord getPosition() {
        return position;
    }

    public void setPosition(Coord position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
}
