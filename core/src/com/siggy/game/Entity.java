package com.siggy.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Siggy
 *         $
 */
public class Entity
{
    private SpriteBatch spr;

    public Entity()
    {
        spr = new SpriteBatch();
    }

    public void draw(int xPos, int yPos, Enemy enemy)
    {
        spr.begin();
        spr.draw(new Texture(enemy.getFileLocation()), xPos, yPos);
        spr.end();
    }
}
