/**
 * 
 */
package try2;

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

	public static List<String> readFile(String fileName) throws IOException{
		List<String> lines = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {			
			lines = stream.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return lines;
	}
}