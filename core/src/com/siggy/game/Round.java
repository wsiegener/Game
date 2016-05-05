package com.siggy.game;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamescipolletti on 5/5/16.
 */
public class Round extends Game
{
    private int number;

    public Round(int number)
    {
        this.number = number;
    }

    public ArrayList<Enemy> setValuesToFile()
    {
        File file = new File ("Rounds.txt");
        Scanner readFile = new Scanner(file);
    }

}
