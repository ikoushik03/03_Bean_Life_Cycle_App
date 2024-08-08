package in.koushik.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.koushik.bean.Motor;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Motor bean = context.getBean(Motor.class);
		bean.doWork();
		
		
		//For calling destroy() method
		ConfigurableApplicationContext cfgctxt = (ConfigurableApplicationContext) context;
		cfgctxt.registerShutdownHook();
		
		

	}

}
