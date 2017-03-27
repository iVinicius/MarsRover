/**
 * 
 */
package source;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Coordinate {
	
	private int x;
	
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	public String toString(){
		String aux = "";
		
		aux += "(" + x + "," + y + ")";
		
		return aux;
	}
	
	public void moveX(int x){
		this.x += x;
	}
	
	public void moveY(int y){
		this.y += y;
	}
}