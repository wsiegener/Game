package com.siggy.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.*;
import java.util.ArrayList;

public class Game extends ApplicationAdapter
{
    SpriteBatch x;
	ArrayList<Enemy> enemyArray;
	int indexOfDraw;
	int count = 0;

	@Override
	public void create()
	{
		Player player = new Player(JOptionPane.showInputDialog(null, "Please enter your name: ", "Welcome", JOptionPane.PLAIN_MESSAGE));
		enemyArray = new ArrayList<>();

		resetIndex();

        x = new SpriteBatch();

		setRound(1);
    }

	private void setRound(int round)
	{
		Round r = new Round(round);
		enemyArray = r.setValuesToFile();
	}

	@Override
	public void render()
	{
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		for (Enemy enemy : enemyArray)
		{
			if(count % 10 == 0)
			{
				while (indexOfDraw <= enemyArray.size())
				{
					calcMovement(enemyArray, indexOfDraw);
					enemy.draw(enemy.getPosX(), enemy.getPosY(), enemyArray.get(indexOfDraw));
					indexOfDraw++;
					if (indexOfDraw == enemyArray.size())
					{
						resetIndex();
						break;
					}
				}
				count = 0;
			}
			else
			{
				count++;
			}
		}
    }

	public void calcMovement(ArrayList<Enemy> array, int indexOfDraw)
	{
		if(array.get(indexOfDraw).getLeg() == 0)
		{
			array.get(indexOfDraw).setPosX(0);
			array.get(indexOfDraw).setPosY(50);
			array.get(indexOfDraw).setLeg(1);
		}
		else if(array.get(indexOfDraw).getLeg() == 1)
		{
			System.out.println("Loo");
			if(array.get(indexOfDraw).getPosX() <= 100)
			{
				array.get(indexOfDraw).setPosX(array.get(indexOfDraw).getPosX()+1);
			}
			else
			{
				array.get(indexOfDraw).setLeg(2);
			}
		}
		else if(array.get(indexOfDraw).getLeg() == 2)
		{
			System.out.println("Loo");
			if(array.get(indexOfDraw).getPosY() <= 450)
			{
				array.get(indexOfDraw).setPosY(array.get(indexOfDraw).getPosY()+1);
			}
			else
			{
				array.get(indexOfDraw).setLeg(3);
			}
		}
	}

	public void resetIndex()
	{
		indexOfDraw = 0;
	}

}
