/**
 * 
 */
package source;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Rover {

	private int id;
	
	private Coordinate coordinate;
	
	private String orientation;

	public Rover(int id, Coordinate coordinate, String orientation) {
		this.id = id;
		this.coordinate = coordinate;
		this.orientation = orientation;
	}
	
	public Rover(int id, int coordX, int coordY, String orientation){
		this.id = id;
		this.coordinate = new Coordinate(coordX, coordY);
		this.orientation = orientation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	public void move(int x, int y){
		coordinate.moveX(x);
		coordinate.moveY(y);
	}
	
	public String toString(){
		String aux = "RoverId: " + id + "\n";
		
		aux += coordinate.toString() + " : " + orientation;
		
		return aux;
	}
}