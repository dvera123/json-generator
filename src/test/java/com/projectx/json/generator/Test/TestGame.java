package com.projectx.json.generator.Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import com.projectx.json.generator.domain.Game;
import com.projectx.json.generator.util.HibernateUtil;

public class TestGame {
	
	private Session session = null;
	
	@Before
	public void setup(){
		session = HibernateUtil.getSessionFactory().openSession();
	}
	@Test
	public void getStepById(){

		Query qr = session.getNamedQuery("Game.findAll");
        List l = qr.list();
        for(Object item: l){
        	System.out.println(((Game) item).getName());
        }
       
        
	}

}
