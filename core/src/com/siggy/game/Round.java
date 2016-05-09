package com.siggy.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Round handles which round game is in
 */
public class Round extends Game
{
    private int number;
    private boolean isRunning;

    public Round(int number)
    {
        this.number = number;
    }

    public ArrayList<Enemy> setValuesToFile()
    {
        int num = 0;

        boolean correctRow = false;
        String enemyType;
        File file = new File("Rounds.txt");

        ArrayList<Enemy> enemiesToAdd = new ArrayList<>();
        try
        {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext())
            {
                if (correctRow)
                {
                    enemyType = readFile.next();
                    switch (enemyType)
                    {
                        case "A":
                            enemiesToAdd.add(new Enemy1());
                            num ++;
                            break;
                        default:
                            correctRow = false;
                    }
                }
                else if (readFile.hasNext() && readFile.next().equalsIgnoreCase("" + number))
                {
                    correctRow = true;
                }

            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Round file not found!");
            System.exit(0);
        }

        return enemiesToAdd;
    }

    public void start()
    {
            isRunning = true;
    }

    public void end()
    {
            isRunning = false;
    }

}
