package test;

import org.junit.Assert;
import org.junit.Test;

import try2.Compass;
import try2.Orientation;

public class CompassTest {

	@Test
	public void testGetNorthRight() {
		Assert.assertEquals(Orientation.EAST, Compass.getRight(Orientation.NORTH));
	}
	
	@Test
	public void testGetNorthLeft() {
		Assert.assertEquals(Orientation.EAST, Compass.getRight(Orientation.NORTH));
	}
	
	@Test
	public void testGetEastRight() {
		Assert.assertEquals(Orientation.SOUTH, Compass.getRight(Orientation.EAST));
	}
	
	@Test
	public void testGetEastLeft() {
		Assert.assertEquals(Orientation.SOUTH, Compass.getRight(Orientation.EAST));
	}
	
	@Test
	public void testGetSouthRight() {
		Assert.assertEquals(Orientation.WEST, Compass.getRight(Orientation.SOUTH));
	}
	
	@Test
	public void testGetSouthLeft() {
		Assert.assertEquals(Orientation.WEST, Compass.getRight(Orientation.SOUTH));
	}
	
	@Test
	public void testGetWestRight() {
		Assert.assertEquals(Orientation.NORTH, Compass.getRight(Orientation.WEST));
	}
	
	@Test
	public void testGetWestLeft() {
		Assert.assertEquals(Orientation.NORTH, Compass.getRight(Orientation.WEST));
	}
}