package color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransparentColorTest {

	@Test
	void test() {
		TransparentColor color1 = new TransparentColor(1, 2, 3, 4);
		TransparentColor color2 = new TransparentColor(1, 2, 3, 4);
		Color color3 = new Color(1, 2, 3);
		assertTrue(color1.equals(color2));
		assertFalse(color1.equals(color3));
		assertFalse(color3.equals(color1));
		assertTrue(color1.getClass() == TransparentColor.class);
		assertTrue(color3.getClass() == Color.class);
		
		assertEquals("rgba(1, 2, 3, 4)", color1.toString());
	}

}
