package com.debuggeandoideas;

import com.debuggeandoideas.excerices.StreamExercises;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        StreamExercises countUSAArtists = new StreamExercises();

        //countUSAArtists.getArtistsWithMoreThanOneAlbum().forEach(IO::println);

        IO.println(countUSAArtists.findAnyJazzArtist());



    }
}