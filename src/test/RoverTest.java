package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import try2.Orientation;
import try2.Rover;

public class RoverTest {
	
	private Rover entity;
	
	@Before
	public void setup(){
		entity = new Rover(1, 4, 5, Orientation.NORTH);
	}

	@Test
	public void testTurnLeft() {
		entity.turnLeft();
		Assert.assertEquals(Orientation.WEST, entity.getOrientation());
	}

	@Test
	public void testTurnRight() {
		entity.turnRight();
		Assert.assertEquals(Orientation.EAST, entity.getOrientation());
	}
	
	@Test
	public void testMove() {
		entity.move();
		Assert.assertEquals(6, entity.getY());
		Assert.assertEquals(Orientation.NORTH, entity.getOrientation());
	}
	
	@Test
	public void testTurnLeftTwice() {
		entity.turnLeft();
		entity.turnLeft();
		Assert.assertEquals(Orientation.SOUTH, entity.getOrientation());
	}
	
	@Test
	public void testTurnRightTwice() {
		entity.turnRight();
		entity.turnRight();
		Assert.assertEquals(Orientation.SOUTH, entity.getOrientation());
	}
	
	@Test
	public void testLocation() {		
		Assert.assertEquals("RoverId: 1 (4, 5) " + entity.getOrientation(), entity.toString());
	}
}
