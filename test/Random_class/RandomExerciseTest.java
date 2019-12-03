package Random_class;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomExerciseTest {
RandomExercise test=new RandomExercise();



	@Test
	void calculateInterestTest()  {
		assertEquals(1333.0992,test.calculateInterest(1200,2,5.4), "Calculate interest");
	}
	@Test
	void discriminantValueTest() {
		assertEquals(-432,test.discriminantValue(12,12,12), "Display discriminant value of given number");
	}

}
