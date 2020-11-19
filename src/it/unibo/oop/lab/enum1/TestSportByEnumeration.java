package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;
import static it.unibo.oop.lab.enum1.Sport.*;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	/*
         * TODO: create 3 sport social network users (SportSocialNetworkUser):
         * 
         * Davide Cassani , dcassani, 53
         * 
         * Bernie Ecclestone, becclestone, 83
         * 
         * Fernando Alonso, falonso, 34
         */
        final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<>("Davide","Cassani","dcassani",53);
        final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<>("Bernie","Ecclestone","becclestone",83);
        final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<>("Fernando","Alonso","falonso",34);

        /*
         * TODO: alonso is a fan of soccer and bike and practices F1: 
         * add these sports to Alonso
         * 
         * falonso.addSport(SportSocialNetworkUserImpl.F1);
         * 
         * ...
         */
        falonso.addSport(F1);
        falonso.addSport(SOCCER);
        falonso.addSport(BIKE);
        System.out.println("Alonso practices F1: " + falonso.hasSport(F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(VOLLEY));
        /*
         * Cassani practiced bike and loves F1 and MotoGP
         */
        dcassani.addSport(BIKE);
        dcassani.addSport(F1);
        dcassani.addSport(MOTOGP);
        System.out.println("Cassani has been a professional biker: "
                + dcassani.hasSport(BIKE));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(SOCCER));
        /**
         * Ecclestone is the de-facto owner of F1 but also a fan of basket.
         */
        becclestone.addSport(F1);
        becclestone.addSport(BASKET);
        System.out.println("Bernie's the boss when it comes to F1: "
                + becclestone.hasSport(F1));
        System.out.println("Bernie does love playing also basket: "
                + becclestone.hasSport(BASKET));
    }
}
