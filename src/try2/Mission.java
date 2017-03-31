/**
 * 
 */
package try2;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Mission {
	
	private ArrayList<Rover> rovers;
	
	private ArrayList<Task> tasks;
	
	private Environment environment;

	public Mission(ArrayList<Rover> rovers, ArrayList<Task> tasks, Environment environment) {
		this.rovers = rovers;
		this.tasks = tasks;
		this.environment = environment;
		this.setupEnvironment();
	}
	
	public String printEnvironment(){
		return environment.printMap();
	}

	public void runMission(){
		this.runTasks();
	}
	
	private void setupEnvironment(){
		for(Rover r : rovers){
			environment.addMarking(new Marking(r.getX(), r.getY(), r.getId(), Integer.toString(r.getId())));
		}
	}
	
	private void runTasks(){
		Rover target = null;
		for(Task task : tasks){
			target = this.findRover(task.getTargetId());
			for(Instruction instr : task.getCommands()){
				target.executeAction(instr);
				environment.updateMarking(target.getId(), target.getX(), target.getY());
				System.out.println(target.printCoordenation());
			}
		}
	}
	
	private Rover findRover(int id){
		for(Rover r : rovers){
			if(r.getId() == id){
				return r;
			}
		}
		return null;
	}
}