package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import try2.Instruction;
import try2.Mission;
import try2.Orientation;
import try2.Rover;
import try2.Task;
import try2.Environment;

public class MissionTest {
	
	private final String EXPECTED_RESULT = "1 3 N\n5 1 E\n";
	
	private Mission entity;
	
	@Before
	public void setup(){
		ArrayList<Rover> rovers = new ArrayList<>();
		rovers.add(new Rover(1, 1, 2, Orientation.NORTH));
		rovers.add(new Rover(2, 3, 3, Orientation.EAST));
		ArrayList<Task> tasks = new ArrayList<>();
		ArrayList<Instruction> instructions1 = new ArrayList<>();
		instructions1.add(Instruction.TURN_LEFT);
		instructions1.add(Instruction.MOVE);
		instructions1.add(Instruction.TURN_LEFT);
		instructions1.add(Instruction.MOVE);
		instructions1.add(Instruction.TURN_LEFT);
		instructions1.add(Instruction.MOVE);
		instructions1.add(Instruction.TURN_LEFT);
		instructions1.add(Instruction.MOVE);
		instructions1.add(Instruction.MOVE);
		tasks.add(new Task(1, instructions1));
		
		ArrayList<Instruction> instructions2 = new ArrayList<>();
		instructions2.add(Instruction.MOVE);
		instructions2.add(Instruction.MOVE);
		instructions2.add(Instruction.TURN_RIGHT);
		instructions2.add(Instruction.MOVE);
		instructions2.add(Instruction.MOVE);
		instructions2.add(Instruction.TURN_RIGHT);
		instructions2.add(Instruction.MOVE);
		instructions2.add(Instruction.TURN_RIGHT);
		instructions2.add(Instruction.TURN_RIGHT);
		instructions2.add(Instruction.MOVE);
		tasks.add(new Task(2, instructions2));
		
		Environment env = new Environment("Kek Place", 5, 5);
		
		entity = new Mission(rovers, tasks, env);
	}
	
	@Test
	public void testRunMission() {
		entity.runMission();
	}

	@Test
	public void testOutput(){
		entity.runMission();
		Assert.assertEquals(EXPECTED_RESULT, entity.returnOutput());
	}
}