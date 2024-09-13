package satpaingthu.testing.buddycitest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class BuddycitestApplicationTests {



	@Test
	void newTest(){
		System.out.println("New Test");
	}
	@Test
	void newTest2(){
		Assert.hasText("","");
//		System.out.println("New Test2");
	}


}
