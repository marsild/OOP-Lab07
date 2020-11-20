/**
 * 
 */
package it.unibo.oop.lab.nesting1;

import java.util.HashSet;
import java.util.Set;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * Represents a social network user along with the sports he/she likes to do or
 * to follow.
 * 
 * 1) Complete the definition of the nested static class Sport, featuring just a
 * field representing the sport name.
 * 
 * 2) Add the unimplemented methods.
 * 
 * @param <U>
 *            specific {@link User} type
 */
public class SportSocialNetworkUserImpl<U extends User> extends SocialNetworkUserImpl<U> {

    /**
     * Static {@link Sport} constant.
     */
    public static final Sport SOCCER;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport F1;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport MOTOGP;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport VOLLEY;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BASKET;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BIKE;

    /*
     * TODO: initialize properly these sports
     */
    /**
	 * Static initialization of sports
	 */
    static {
        SOCCER = new Sport("Calcio");
        F1 = new Sport("Formula uno");
        MOTOGP = new Sport("Moto GP");
        VOLLEY = new Sport("Pallavolo");
        BASKET = new Sport("Pallacanestro");
        BIKE = new Sport("Ciclismo");
    }

    /**
     * Field meant to keep track of the set of sports followed/done by a user.
     */
    private final Set<Sport> sports;

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.sports = new HashSet<>();
    }

    /*
     * [METHODS]
     * 
     * Implements all the methods below
     */

    /**
     * Add a new sport followed by this user: if the user already likes or does
     * the sport, nothing happens.
     * 
     * @param sport
     *            a sport followed/done by the user
     */
    // TODO
    public void addSport(final Sport sport) {
    	if(!sports.contains(sport)) {
    		sports.add(sport);
    	}
    }

    /**
     * Returns true if a user likes/does a given sport.
     * 
     * @param s
     *            sport to use as an input
     * @return true if a user likes sport s
     */
    // TODO
    public boolean hasSport(final Sport s) {
        return sports.contains(s);
    }

    /*
     * TODO
     * 
     * Complete the definition of this static inner class defining a Sport along
     * with its bare name.
     */
    /**
     * Static inner class defining a Sport along with its bare name;
     */
    public static final class Sport {
    	/**
    	 * Field holding the string representation of the full name of this sport
    	 */
    	private final String name;
    	
    	/**
         * Builds a new {@link Sport}.
         *
         * @param name
         *            String representation of the full name of this sport
         */
    	public Sport(String name) {
    		this.name = name;
    	}
    	
    	/**
    	 * Method that returns the full name of the sport
    	 * @return String representing full name of the sport
    	 */
        public String getName() {
			return this.name;
		}

		/*
         * TODO
         * 
         * Redefine equals so that two sports are equal only if they feature the
         * very same name. Remember that you must also redefine hashCode()!
         */
        /**
         * {@inheritDoc} 
         */
        public boolean equals(final Object o) {
        	if(o instanceof Sport) {
        		return this.name==((Sport)o).getName();
        	}
            return false;
        }
        /**
         * {@inheritDoc} 
         */
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
			return result;
		}
        
    }
}
