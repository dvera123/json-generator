package com.projectx.json.generator.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.projectx.json.generator.domain.Game;

public class JsonWriter {
	
	private Session session = null;
	
	private void jsonStringGenerator(){
		
		Query qr = session.getNamedQuery("Game.findAll");
        List l = qr.list();
        String jsonArrayStr = "{";
        for(Object item: l){
        	jsonArrayStr=jsonArrayStr+" \"name\" "+":"+" \" " +((Game) item).getName() + " \" "+",";
        	
        }
        jsonArrayStr=jsonArrayStr+"}";
        
        System.out.println(jsonArrayStr);
		
        try{
			File file = new File("WebContent/json/gamesPS3.json");
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hello");
			bw.close();
	
			System.out.println("Done");
		}catch(IOException ioe){
			System.out.println("error");
		}
	}
	
	


}
