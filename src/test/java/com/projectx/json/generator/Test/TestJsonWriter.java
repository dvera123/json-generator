package com.projectx.json.generator.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import com.projectx.json.generator.domain.Game;
import com.projectx.json.generator.util.HibernateUtil;

public class TestJsonWriter {
	
private Session session = null;
	
	@Before
	public void setup(){
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	@Test
	public void updateJson() {
		Query qr = session.getNamedQuery("Game.findAll");
        List l = qr.list();
        String jsonArrayStr = "{";
        for(Object item: l){
        	jsonArrayStr=jsonArrayStr+"\"id-"+((Game) item).getId()+" \""+":"+"\""+((Game) item).getName() +"\"";
        	if(l.lastIndexOf(item) != l.size()-1){
        		jsonArrayStr+=",";
        	}
        	
        }
        jsonArrayStr=jsonArrayStr+"}";
        
        System.out.println(jsonArrayStr);
		
        try{
			File file = new File("WebContent/json/gamesPS3.json");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(jsonArrayStr);
			bw.close();
	
			System.out.println("Done");
		}catch(IOException ioe){
			System.out.println("error");
		}
	}

}
