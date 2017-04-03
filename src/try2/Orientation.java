/**
 * 
 */
package try2;

/**
 * @author Vinicius_B_Rosa
 *
 */
public enum Orientation {
	
	NORTH, EAST, SOUTH, WEST;
	
	public static String getChar(Orientation ori){
		switch(ori){
		case NORTH:
			return "N";
		case SOUTH:
			return "S";
		case EAST:
			return "E";
		case WEST:
			return "W";
		}
		return "";
	}
}