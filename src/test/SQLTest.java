package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Section;
import com.service.ISectionService;

public class SQLTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testSection(){
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		ISectionService sectionS = (ISectionService)context.getBean("sectionService");
		List<Section> list = sectionS.findSections();
		for (Section section : list) {
			System.out.println(section.getName());
		}
	}
}
