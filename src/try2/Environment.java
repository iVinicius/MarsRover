/**
 * 
 */
package try2;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Environment {
	
	private Map map;
	
	private String name;
	
	private ArrayList<Marking> markings;

	public Environment(String name, int dimensionX, int dimensionY){
		map = new Map(dimensionX, dimensionY);
		this.name = name;
		markings = new ArrayList<>();
	}

	public Map getMap() {
		return map;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Marking> getMarkings() {
		return markings;
	}
	
	public void addMarking(Marking mark){
		markings.add(mark);
		map.mark(mark.getX(), mark.getY(), mark.getSymbol());
	}
	
	public void updateMarking(int id, int newX, int newY){
		Marking aux = this.findMarking(id);		
		if(aux == null){
			// new mark
			map.mark(newX, newY);
		} else{
			// remove old mark and re-create id
			map.eraseMarking(aux.getX(), aux.getY());
			map.mark(newX, newY, aux.getSymbol());
		}
	}
	
	private Marking findMarking(int id){
		Marking aux = null;		
		for(Marking m : markings){
			if(m.getId() == id){
				aux = m;
			}
			break;
		}		
		return aux;
	}
}