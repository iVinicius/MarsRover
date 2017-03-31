/**
 * 
 */
package try2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Compass {
	
	private static  Map<Orientation, CardinalPair> hashDirections = new HashMap<>();

	/*
	 * if i know the right and left's side of each direction, i know everything to solve it!
	 */
	static {
		hashDirections.put(Orientation.NORTH, new CardinalPair(Orientation.WEST, Orientation.EAST));
		hashDirections.put(Orientation.WEST, new CardinalPair(Orientation.SOUTH, Orientation.NORTH));
		hashDirections.put(Orientation.SOUTH, new CardinalPair(Orientation.EAST, Orientation.WEST));
		hashDirections.put(Orientation.EAST, new CardinalPair(Orientation.NORTH, Orientation.SOUTH));
	}
	
	public static Orientation getRight(Orientation originalOrientation){
		CardinalPair cp = hashDirections.get(originalOrientation);
		return cp.getRight();
	}
	
	public static Orientation getLeft(Orientation originalOrientation){
		CardinalPair cp = hashDirections.get(originalOrientation);
		return cp.getLeft();
	}
	
	private static class CardinalPair {

		private Orientation leftDirection;
		private Orientation rightDirection;

		public CardinalPair(Orientation leftDirection, Orientation rightDirection) {
			this.leftDirection = leftDirection;
			this.rightDirection = rightDirection;
		}

		public Orientation getRight() {
			return rightDirection;
		}

		public Orientation getLeft() {
			return leftDirection;
		}
	}

	public static Orientation parseOrientation(String ori){
		switch(ori){
		case "N":
			return Orientation.NORTH;
		case "E":
			return Orientation.EAST;
		case "S":
			return Orientation.SOUTH;
		case "W":
			return Orientation.WEST;
		}
		return null;
	}
}