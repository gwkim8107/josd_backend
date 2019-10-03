package josd.main.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import josd.main.entity.Chant;
import josd.main.entity.Reading;

@Mapper
public interface MainActivityService {
	//********************************************
	// Data strore process for chanting
	//********************************************
	public void saveChant(Chant chant);
	
	public void updtChant(Chant chant);
	
	public int checkChantData(String user_id, String rec_dt);
	
	//********************************************
	// Data strore process for reading
	//********************************************
	public void saveReading(Reading reading);
	
	public void updtReading(Reading reading);
	
	public int checkReadData(String user_id, String rec_dt);
	
}
