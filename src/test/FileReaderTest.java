package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import try2.FileReader;

public class FileReaderTest {

	@Test
	public void testReadExistingFile() throws Exception{
		List<String> lines = FileReader.readFile("input.txt");
		if(lines.isEmpty()){
			Assert.fail();
		}
	}

	@Test
	public void testReadNonExistentFile() throws IOException{
		try{
			List<String> lines = FileReader.readFile("kiko.txt");
		}catch(Exception e){
			return;
		}
		Assert.fail();
	}
}