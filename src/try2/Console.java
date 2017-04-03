package try2;

import java.util.ArrayList;
import java.util.List;

public class Console {

	public static void main(String[] args) {
		String filename = "";
		if(args[0] != null){
			filename = args[0];
		} else{
			filename = "input.txt";
		}
		List<String> lines = FileReader.readFile(filename);
		
		Mission mission = null;
		Environment env = null;		
		ArrayList<Rover> rovers = new ArrayList<>();
		ArrayList<Task> tasks = new ArrayList<>();
		
		int lineCount = 0;
		int idSeq = 1;
		Rover roverAux = null;
		Task taskAux = null;
		for(String line : lines){
			if(lineCount == 0){
				String aux[] = line.split(" ");
				env = new Environment("Mars Plateau", Integer.parseInt(aux[0]), Integer.parseInt(aux[1]));
			} else if(!isEven(lineCount)){
				String aux[] = line.split(" ");
				roverAux = new Rover(idSeq, Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Compass.parseOrientation(aux[2]));
				rovers.add(roverAux);
			} else{
				String aux[] = line.split("");
				taskAux = new Task();
				taskAux.setTargetId(idSeq);
				for(int i = 0; i < aux.length; i++){
					taskAux.addInstruction(aux[i]);
				}
				tasks.add(taskAux);
				idSeq++;
			}
			lineCount++;
		}
		
		mission = new Mission(rovers, tasks, env);
		
		//System.out.println(mission.printEnvironment());
		
		mission.runMission();
		
		System.out.println(mission.returnOutput());
		
		//System.out.println(mission.printEnvironment());
	}
	
	private static boolean isEven(int x){
		return x % 2 != 0 ? false : true;
	}
}