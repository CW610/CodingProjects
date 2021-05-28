package fixtures;

/*
 * Abstract class for Fixture, sets the basis for each fixture. Could make an item class to utilize this as well
 */
public abstract class Fixture {
	public String name;
	
	public String shortDescription;
	
	public String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	


}
