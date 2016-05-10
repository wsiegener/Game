package com.siggy.game;

/**
 * Created by jamescipolletti on 5/5/16.
 */
public abstract class Enemy extends Entity
{
    private int damage, HP, posX, posY, leg;
    private String fileLocation;

    public Enemy(int damage, int HP, String fileLocation)
    {
        this.damage = damage;
        this.HP = HP;
        this.leg = 0;
        this.fileLocation = fileLocation;
    }

    public int getPosX()
    {
        return posX;
    }

    public void setPosX(int posX)
    {
        this.posX = posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void setPosY(int posY)
    {
        this.posY = posY;
    }

    public String getFileLocation()
    {
        return fileLocation;
    }

    public void setLeg(int leg)
    {
        this.leg = leg;
    }

    public int getLeg()
    {
        return leg;
    }
}
