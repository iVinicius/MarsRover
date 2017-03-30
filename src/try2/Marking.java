/**
 * 
 */
package try2;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Marking {
	
	private final String DEFAULT_MARK = "O";

	private int x;
	
	private int y;
	
	private int id;
	
	private String symbol;

	public Marking(int x, int y, int id, String symbol) {
		super();
		this.x = x;
		this.y = y;
		this.id = id;
		this.symbol = symbol;
	}
	
	public Marking(int x, int y, int id) {
		super();
		this.x = x;
		this.y = y;
		this.id = id;
		symbol = DEFAULT_MARK;
	}
	
	public Marking(){
		this.x = 0;
		this.y = 0;
		this.id = 0;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getSymbol(){
		return symbol;
	}
}