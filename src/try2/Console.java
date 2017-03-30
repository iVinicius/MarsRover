package try2;

import java.util.ArrayList;
import java.util.List;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new Map(5,5);
		
		map.mark(1, 2);
		
		System.out.println(map.toString());
		
		Marking markRover1 = new Marking(1, 2, 1, "1");
		Marking markRover2 = new Marking(3, 3, 2, "2");
		
		Environment envTest = new Environment("Mars Plateau", 5, 5);
		envTest.addMarking(markRover1);
		envTest.addMarking(markRover2);
		
		System.out.println(envTest.getMap().toString());
		
		List<String> lines = FileReader.readFile("input.txt");
		
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
		
		
	}
	
	private static boolean isEven(int x){
		return x % 2 != 0 ? false : true;
	}
}