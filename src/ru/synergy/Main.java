package ru.synergy;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//         Arrays

        Cat[] cats = new Cat[4];
        cats[0] = new Cat( "Tomas" );
        cats[1] = new Cat( "Hippo" );
        cats[2] = new Cat( "Franc" );
        cats[3] = new Cat( "Fruct" );

        //cats[1] = null;

        System.out.println( Arrays.toString(cats) );

//           ArrayList

        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats) {
            catsList.add( cat );

            catsList.add( new Cat( "Babun" ) );

            catsList.remove( 1 );

            Cat cat0 = catsList.get( 0 );
            System.out.println( cat );

            System.out.println( catsList.indexOf( cat ) );

            //catsList.add( 2, new Cat( "Меня сюда вставили" ) );

            System.out.println( catsList.toString() );
            System.out.println( catsList.size() );


//            LinkedList
//            String str1 = new String("Hello Worlg");
//            String str2 = new String("Vasya");
//            String str3 = new String("I love Jawa");
//
//            LinkedList<String> vasyaBio = new LinkedList<>();
//            vasyaBio.add( str1 );
//            vasyaBio.add( str2 );
//            vasyaBio.add( str3 );
//
//                    System.out.println(vasyaBio);

            //Linked List on practice
            LinkedList<Car> cars = new LinkedList<>();
            Car ferrari = new Car( "Ferrari Monza" );
            Car maserati = new Car( "Maserati Sliva" );
            Car nissan = new Car( "Nissan Skyline" );

            cars.addAll( Arrays.asList( ferrari, maserati, nissan ) );
            System.out.println( cars );
            cars.addFirst( new Car( "Toyota Corsa" ) );
            System.out.println( cars );
            cars.addLast( new Car( "Lada Guga" ) );
            System.out.println( cars );

            cars.pollFirst();
            System.out.println( cars );

            //  ArrayList vs LinkedList

            List<Integer> List = new LinkedList<>();
            for (int i = 0; i < 5000000; i++) ;
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                //list.add( 2000000, Integer.MAX_VALUE);
            }
            System.out.println( "Time of work for LinkedList on (millisecond)" +
                    (System.currentTimeMillis() - start) );

            List = new ArrayList<>();
            for (int i = 0; i < 5000000; i++) ;
            start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                //list.add( 2000000, Integer.MAX_VALUE);
            }
            System.out.println( "Time of work for ArrayList on (millisecond)" +
                    (System.currentTimeMillis() - start) );


            // Set
            Set<String> states = new HashSet<>();
            states.add( "Germany" );
            states.add( "France" );
            states.add( "Italy" );

            boolean isAdded = states.add( "Italy" );
            System.out.println( "Italy is added: " + isAdded );
            System.out.println( "Set contains: " + states.size() );

            System.out.println( states );

            states.remove( "Germany" );
            System.out.println( states );


            System.out.println( "Set contains: " + states );

            HashSet<Cat> catHashSet = new HashSet<>(catsList);
            System.out.println(catHashSet);

            // Map
            Map<Integer, String> statesMap = new HashMap<>();

            statesMap.clear();
            statesMap.put(1,"Germany");
            statesMap.put( 2,"Spain" );
            statesMap.put( 3,"British" );
            statesMap.put( 4,"Italy" );

            System.out.println(statesMap.keySet());

            statesMap.remove( 2 );

            for (Map.Entry<Integer, String> item : statesMap.entrySet()){
               System.out.printf("Key:  %d  |  value:  %s \n", item.getKey(), item.getValue());

            }

            String first = statesMap.get( 2 );
            System.out.println(first);




        }

    }

    }

