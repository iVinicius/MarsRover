package source;

import java.util.ArrayList;

public class NASACommandCenter implements INASACommandCenter{
	
	private ArrayList<Rover> rovers;
	
	private Environment environment;
	
	private ArrayList<Coordinate> roversCoordenations;
	
	private ArrayList<Task> tasks;

	@Override
	public void deployRovers(ArrayList<Rover> roverList, Environment env) {
		this.rovers = roverList;
		this.environment = env;
	}

	@Override
	public boolean runMission() {
		return this.executeTasks();
	}
	
	@Override
	public void setMission(ArrayList<Task> tasks) {
		this.setTasks(tasks);
		
	}

	public ArrayList<Rover> getRovers() {
		return rovers;
	}

	public void setRovers(ArrayList<Rover> rovers) {
		this.rovers = rovers;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public ArrayList<Coordinate> getRoversCoordenations() {
		return roversCoordenations;
	}

	public void setRoversCoordenations(ArrayList<Coordinate> roversCoordenations) {
		this.roversCoordenations = roversCoordenations;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public String printEnvironmentMap(){
		String aux = "";
		
		updateMap();
		
		int[][] env = environment.getEnvironment();
		for(int i = 0; i < env.length; i++){
			for(int j = 0; j < env[i].length; j++){
				aux += "[" + env[i][j] + "]";
			}
			aux += "\n";
		}
		
		return aux;
	}
	
	private void updateMap(){
		for(Coordinate coor : roversCoordenations){
			environment.getEnvironment()[coor.getX()][coor.getY()] = 1;
		}
	}
	
	private boolean executeTasks(){
		for(Task task : tasks){
			int roverId = task.getTarget();
			Rover rover = findRover(roverId);
			
			String[] commands = task.getCommands().split("");
			for(int i = 0; i < commands.length; i++){
				this.runCommand(commands[i], rover);
				System.out.println(rover.toString());
			}
			String x = "";
		}
		System.out.println(this.printEnvironmentMap());
		
		return false;
	}
	
	private Rover findRover(int roverId){
		for(Rover rover : rovers){
			if(rover.getId() == roverId){
				return rover;
			}
		}
		return null;
	}
	
	private void runCommand(String command, Rover rover){
		switch(command){
		case "L":
			rover.setOrientation(changeOrientation(rover.getOrientation(), command));
			break;
		case "R":
			rover.setOrientation(changeOrientation(rover.getOrientation(), command));
			break;
		case "M":
			this.move(rover);
			break;
		}
	}
	
	private void move(Rover rover){
		String ori = rover.getOrientation();
		switch(ori){
		case "N":
			rover.move(1, 0);
			break;
		case "E":
			rover.move(0, 1);
			break;
		case "S":
			rover.move(-1, 0);
			break;
		case "W":
			rover.move(0, -1);
			break;
		}
	}
	
	private String[] sides = {"N", "E", "S", "W"};
	
	private String changeOrientation(String actual, String side){
		String response = "";
		int i;
		switch(actual){
		case "N":
			i = 0;
			if(side.equalsIgnoreCase("L")){
				i = 3;
			} else{
				i++;
			}
			response = sides[i];
			break;
		case "E":
			i = 1;
			if(side.equalsIgnoreCase("L")){
				i--;
			} else{
				i++;
			}
			response = sides[i];
			break;
		case "S":
			i = 2;
			if(side.equalsIgnoreCase("L")){
				i--;
			} else{
				i++;
			}
			response = sides[i];
			break;
		case "W":
			i = 3;
			if(side.equalsIgnoreCase("L")){
				i--;
			} else{
				i = 0;
			}
			response = sides[i];
			break;
		}
		return response;
	}
}