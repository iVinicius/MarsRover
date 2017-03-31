/**
 * 
 */
package try2;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Map {
	
	private final String DEFAULT_MARK = "O";

	private final String EMPTY_MARK = "#";
	
	private String[][] map;
	
	public Map(int x, int y){
		map = new String[y][x];
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				map[i][j] = "#";
			}
		}
	}
	
	@Override
	public String toString(){
		String aux = "";
		
		for(int i = map.length-1; i >= 0; i--){
			for(int j = 0; j < map[i].length; j++){
				aux += map[i][j] + " ";
			}
			aux += "\n";
		}
		
		return aux;
	}
	
	public void mark(int x, int y){
		this.set(x, y, DEFAULT_MARK);
	}
	
	public void mark(int x, int y, String symbol){
		this.set(x, y, symbol);
	}
	
	private void set(int x, int y, String symbol){
		map[y][x] = symbol;
	}
	
	public void eraseMarking(int x, int y){
		if(x < 0) x = 0;
		if(x > map.length-1) x = map.length-1;
		if(y < 0) y = 0;
		if(y > map[x].length-1) y = map[x].length-1;
		this.set(x, y, EMPTY_MARK);
	}
}