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
	
	private int[][] environment;

	public Environment(String name, int sizeX, int sizeY) {
		this.name = name;
		this.environment = new int[sizeX][sizeY];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[][] getEnvironment() {
		return environment;
	}

	public void setEnvironment(int[][] size) {
		this.environment = size;
	}
}