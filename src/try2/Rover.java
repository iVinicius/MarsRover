/**
 * 
 */
package try2;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Rover {
	
	private int id;
	
	private int x;
	
	private int y;
	
	private Orientation orientation;

	public Rover(int id, int x, int y, Orientation ori) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.orientation = ori;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public void executeAction(Instruction instr){
		switch(instr){
		case TURN_LEFT:
			this.turnLeft();
			break;
		case TURN_RIGHT:
			this.turnRight();
			break;
		case MOVE:
			this.move();
			break;
		}
	}
	
	public void turnLeft(){
		orientation = Compass.getLeft(orientation);
	}
	
	public void turnRight(){
		orientation = Compass.getRight(orientation);
	}
	
	public void move(){
		switch(orientation){
		case NORTH:
			y++;
			break;
		case SOUTH:
			y--;
			break;
		case EAST:
			x++;
			break;
		case WEST:
			x--;
			break;
		}
	}
	
	@Override
	public String toString(){
		return "RoverId: " + id + " (" + x + ", " + y + ") " + orientation;
	}
	
	public String printCoordenation(){
		return this.toString();
	}
}