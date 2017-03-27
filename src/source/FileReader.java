/**
 * 
 */
package source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class FileReader {

	public static Environment readFile(String fileName, ArrayList<Rover> rovers, ArrayList<Task> tasks){
		Environment env = null;	
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			List<String> lines = new ArrayList<>();
			lines = stream.collect(Collectors.toList());

			int i = 0;
			int idSeq = 1;
			for(String line : lines){
				if(i == 0) {
					String[] sizes = line.split(" ");
					int sizeX = Integer.parseInt(sizes[0]);
					int sizeY = Integer.parseInt(sizes[1]);
				
					env = new Environment("Mars Plateau", sizeX, sizeY);					
				} else if(!isEven(i)){
					String[] coordinates = line.split(" ");
					int coordX = Integer.parseInt(coordinates[0]);
					int coordY = Integer.parseInt(coordinates[1]);
					String orientation = coordinates[2];
					
					rovers.add(new Rover(idSeq++, coordX, coordY, orientation));
				} else{
					tasks.add(new Task(idSeq - 1, line));
				}
				i++;
			}						
		} catch (IOException e) {
			e.printStackTrace();
		}
		return env;
	}
	
	private static boolean isEven(int i){
		return i % 2 != 0 ? false : true;
	}
}