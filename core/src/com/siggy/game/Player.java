package com.siggy.game;

/**
 * @author Siggy
 *         $
 */
public class Player
{
    private int money, health, level;
    private String name;

    public Player(String name)
    {
        this.name = name;
        money = 500;
        health = 50;
        level = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}
