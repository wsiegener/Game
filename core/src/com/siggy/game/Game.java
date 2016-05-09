package com.siggy.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.*;

public class Game extends ApplicationAdapter
{
    SpriteBatch x;

	@Override
	public void create()
	{
        Player player = new Player(JOptionPane.showInputDialog(null, "Please enter your name: ", "Welcome", JOptionPane.PLAIN_MESSAGE));

        x = new SpriteBatch();
    }

	@Override
	public void render()
	{
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
