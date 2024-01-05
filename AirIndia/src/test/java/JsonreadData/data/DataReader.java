package JsonreadData.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	@Test
	public List<HashMap<String, String>> getjsondataToMap() throws IOException {
		
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//JsonreadData//data//EnterData.json"),
				StandardCharsets.UTF_8);
		
		System.out.println(jsonContent);
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){
			
		});
		 return data;
		 
	}
	
	public Object [][]getData() throws IOException{
	
		
		List<HashMap<String,String>>data=getjsondataToMap();
		return new Object [][] {{data.get(0)},{data.get(1)},{data.get(2)},{data.get(3)},{data.get(4)} };
		
	
	
	}
	
	
	

}
