package subidaDeNotaExamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubidaDeNotaTest {

	@Test
	public void test1() {
		int x = 0, y = 0, num = 0, c = 0;
		
		if (x > 0 && y > 0) {
			if (num >= x && num <= y) {
				c = 1;
			}
		}
	}

	@Test
	public void test2() {
		int x = 0, y = 0, num = 0, c = 0;
		
		if (x > 0 && y > 0) {
			if (num >= x && num <= y) {
				c = 1;
			} 
			else {
				c = -1;
			}
		} 
	}
	
	@Test
	public void test3() {
		int x = 0, y = 0, num = 0, c = 0;
		
		if (x > 0 && y > 0) {
			if (num >= x && num <= y) {
				c = 1;
			} 
			else {
				c = -1;
			}
		} 
		else {
			c = -1;
		}
	}
	
}
