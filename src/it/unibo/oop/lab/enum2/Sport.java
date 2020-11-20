/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 */
public enum Sport {

	/*
	 * TODO
	 * 
	 * Declare the following sports:
	 * 
	 * - basket
	 * 
	 * - volley
	 * 
	 * - tennis
	 * 
	 * - bike
	 * 
	 * - F1
	 * 
	 * - motogp
	 * 
	 * - soccer
	 * 
	 */
	BASKET(Place.INDOOR, 5, "Pallacanestro"), VOLLEY(Place.INDOOR, 6, "Pallavolo"), TENNIS(Place.OUTDOOR, 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Ciclismo"), F1(Place.OUTDOOR, 1, "Formula uno"), MOTOGP(Place.OUTDOOR, 1, "Moto GP"),
	SOCCER(Place.OUTDOOR, 11, "Calcio");

	/*
	 * TODO
	 * 
	 * [FIELDS]
	 * 
	 * Declare required fields
	 */
	/**
	 * Team Members of this sport. 1 if it is individual
	 */
	private final int teamMembers;
	/**
	 * Actual name of this sport.
	 */
	private final String name;
	/**
	 * Field representing if it is an OUTDOOR or INDOOR sport.
	 */
	private final Place p;

	/*
	 * TODO
	 * 
	 * [CONSTRUCTOR]
	 * 
	 * Define a constructor like this:
	 * 
	 * - Sport(final Place place, final int noTeamMembers, final String actualName)
	 */
	/**
     * Builds a new {@link Sport}.
     * 
     * @param place
     *            Outdoor or Indoor
     * @param noTeamMembers
     *            Team members of this sport
     * @param actualName
     *            String representation of the full name of this sport
     */
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.teamMembers = noTeamMembers;
		this.name = actualName;
		this.p = place;
	}

	/*
	 * TODO
	 * 
	 * [METHODS] To be defined
	 * 
	 * 
	 * 1) public boolean isIndividualSport()
	 * 
	 * Must return true only if called on individual sports
	 * 
	 * 
	 * 2) public boolean isIndoorSport()
	 * 
	 * Must return true in case the sport is practices indoor
	 * 
	 * 
	 * 3) public Place getPlace()
	 * 
	 * Must return the place where this sport is practiced
	 * 
	 * 
	 * 4) public String toString()
	 * 
	 * Returns the string representation of a sport
	 */
	 /**
     * Returns true if called on individual sports.
     * 
     * @return true if called on individual sports.
     */
	public boolean isIndividualSport() {
		return this.teamMembers == 1;
	}
	
	/**
     * Returns true if called on INDOOR sports.
     * 
     * @return true if called on INDOOR sports.
     */
	public boolean isIndoorSport() {
		return this.p == Place.INDOOR;
	}
	
	/**
     * Returns the place where the sport is played.
     * 
     * @return true enum INDOOR or OUTDOOR.
     */
	public Place getPlace() {
		return this.p;
	}
	
	/**
     * Returns String representation of this sport.
     * 
     * @return String representation containing name, team Members and place.
     */
	public String toString() {
		String s = this.name + ": Is individual? ";
		if (this.isIndividualSport()) {
			s = s + "YES. ";
		} else {
			s = s + "NO. Team Members: " + this.teamMembers + ". ";
		}
		s = s + "It is an " + this.getPlace() + "SPORT.";
		return s;
	}
}
