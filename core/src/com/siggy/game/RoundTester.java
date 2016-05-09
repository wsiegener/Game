package com.siggy.game;

/**
 * Created by jamescipolletti on 5/6/16.
 */
public class RoundTester
{
    public static void main(String args[])
    {
        Round round = new Round(3);

        System.out.println(round.setValuesToFile());

        round.start();
        round.end();

    }
}
