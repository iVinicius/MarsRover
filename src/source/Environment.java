/**
 * 
 */
package source;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Environment {
	
	private String name;
	
	private int[][] size;

	public Environment(String name, int sizeX, int sizeY) {
		this.name = name;
		this.size = new int[sizeX][sizeY];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[][] getSize() {
		return size;
	}

	public void setSize(int[][] size) {
		this.size = size;
	}
}