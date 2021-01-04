package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {
	/**
	 * GIVEN WHEN THEN
	 */

	ArrayList path = new ArrayList();
	City A = new City(0,0);
	City B = new City(3,4);
	City C = new City(1, 1);


	@Test
	public void getDistance_emptyTour_0() {
		Tour emptyTour = new Tour();
		int expected = 0;
		int actual = emptyTour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_oneCity_0() {
		path.add(B);
		Tour tour = new Tour(path);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	@Test
	public void getDistance_AB_10() {
		path.add(A);
		path.add(B);
		Tour tour = new Tour(path);
		int expected = 10;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_ABC_9() {
		path.add(A);
		path.add(B);
		path.add(C);
		Tour tour = new Tour(path);
		int expected = 9;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}


}
