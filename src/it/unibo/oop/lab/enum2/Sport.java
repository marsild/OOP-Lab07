/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
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
	private final int teamMembers;
	private final String name;
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
	public boolean isIndividualSport() {
		return this.teamMembers == 1;
	}

	public boolean isIndoorSport() {
		return this.p == Place.INDOOR;
	}

	public Place getPlace() {
		return this.p;
	}

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
