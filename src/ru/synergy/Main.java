package ru.synergy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat[] cats = new Cat[4];
        cats[0] = new Cat( "Tomas" );
        cats[1] = new Cat( "Hippo" );
        cats[2] = new Cat( "Franc" );
        cats[3] = new Cat( "Fruct" );

//        cats[1] = null;

        System.out.println( Arrays.toString(cats) );

        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats){
            catsList.add( cat );

            catsList.add( new Cat( "Babun" ) );

            catsList.remove( 1 );

            Cat cat0 = catsList.get( 0 );
            System.out.println(cat);

//            System.out.println(catsList.indexOf( cat ));
//
//            catsList.add( 2,new Cat( "Меня сюда вставили" ));

            System.out.println(catsList.toString());
            System.out.println(catsList.size());
        }



    }
}
