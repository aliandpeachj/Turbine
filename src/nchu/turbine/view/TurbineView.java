package nchu.turbine.view;

import org.apache.log4j.chainsaw.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Turbine������
 * @author Saulxk
 * </br>EditDate: 2017-05-23
 */
public class TurbineView {
	final private static ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bean.xml");
	public static ClassPathXmlApplicationContext getContext(){
		return applicationContext;
	}
}
