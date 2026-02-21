/*package com.viom.iocdi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EngineService {


	EngineDao engineDao = new EngineDao();
	ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
	
	public Engine registerEngine (int id, double cc) {
		
		if(id< 0) {
			throw new IllegalArgumentException("id must be greater than 0");
		}
		
		Engine engine = ac.getBean("engine",Engine.class);
		return engineDao.saveEngine(engine);
		
	}
	
	public void updateEngineCc(int id, double cc) {
		
		engineDao.updateEngineCc(id, cc);
	}
	
	public void findEngineById(int id) {
		engineDao.findEngineById(id);
	}
	public void findAll() {
		engineDao.findAll();
	}
	
	public void deleteEngine(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("Invalid id");
		}
		engineDao.removeEngineById(id);
	}

}
*/