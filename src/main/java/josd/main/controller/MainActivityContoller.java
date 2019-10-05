package josd.main.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import josd.main.entity.Chant;
import josd.main.entity.Reading;
import josd.main.entity.Service;
import josd.main.service.MainActivityService;

@RestController
public class MainActivityContoller {
	public static final Logger logger = org.slf4j.LoggerFactory.getLogger(MainActivityContoller.class);
	
	@Autowired
	private MainActivityService mainService;
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(path = "/chant")
	public ResponseEntity<?> saveChant(@RequestBody Chant chant){
//		Round Example 
//		int a = (int) Math.round(6.14); // 3 
//		int b = (int) Math.round(6.99); // 4 
//		int c = (int) Math.round(6.5); // 4
		
		
//		logger.info("Check Chant data : {}", chant);
		String user_id = chant.getUser_id();
		String rec_dt = chant.getRec_dt();
		
		// 12:00 AM - 8:00 AM
		int bf_8am = chant.getBf_8am();
		int point_bf_8am = (int) Math.round(bf_8am * 4.5);
		chant.setPoint_bf_8am(point_bf_8am);
		
		// 8:00 AM - 6:00 PM
		int btw_8to6pm = chant.getBtw_8to6pm();
		int point_btw_8to6pm = (int) Math.round(btw_8to6pm * 3);
		chant.setPoint_btw_8to6pm(point_btw_8to6pm);
		
		// 6PM - 12AM
		int af_6pm = chant.getAf_6pm();
		int point_af_6pm = (int) Math.round(af_6pm * 1.5);
		chant.setPoint_af_6pm(point_af_6pm);
		
		// Total
		int chant_total = bf_8am + btw_8to6pm + af_6pm;
		int point_chant_total = point_bf_8am + point_btw_8to6pm + point_af_6pm;
		if( point_chant_total > 72 ) {
			point_chant_total = 72;
		}
		chant.setChant_total(chant_total);
		chant.setPoint_total(point_chant_total);
		
		// Check the data existence
		int chant_count = mainService.checkChantData(user_id, rec_dt);
		System.out.println("count = "+chant_count);
		
		if (chant_count > 0) {
			// Update data
			mainService.updtChant(chant);
		}else if(chant_count == 0) {
			// Insert data
			mainService.saveChant(chant);
		}
		
		return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
	}
	
	@CrossOrigin(origins="*", maxAge=3600)
	@RequestMapping(path="/reading")
	public ResponseEntity<?> saveReading(@RequestBody Reading reading){
		String user_id = reading.getUser_id();
		String rec_dt = reading.getRec_dt();
		String sub_area = reading.getSub_area();
		
		int sub_dura = reading.getSub_dura();
		int sub_point = 0;//
		if(sub_dura < 15) {
			sub_point = -20;
		}else if(sub_dura >= 15) {
			sub_point = (int) Math.round( (sub_dura * 18) / 60 );
		}
		if(sub_point > 18) {
			sub_point = 18;
		}
		reading.setSub_point(sub_point);
		
		// Check the data existence
		int reading_count = mainService.checkReadData(user_id, rec_dt, sub_area);
		System.out.println("reading_count = "+reading_count);
		
		if (reading_count > 0) {
			// Update data
			mainService.updtReading(reading);
		}else if(reading_count == 0) {
			// Insert data
			mainService.saveReading(reading);
		}
		
		return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
		
	}
	
	@CrossOrigin(origins="*", maxAge=3600)
	@RequestMapping(path="/service")
	public ResponseEntity<?> saveService(@RequestBody Service service){
		// 
		String user_id = service.getUser_id();
		String rec_dt = service.getRec_dt();
		String sev_kind = service.getSev_kind();
		
		int sev_dura = service.getSev_dura();
		int sev_point = 0;//
		if(sev_dura < 15) {
			sev_point = -20;
		}else if(sev_dura >= 15) {
			sev_point = (int) Math.round( (sev_dura * 18) / 60 );
		}
		if(sev_point > 18) {
			sev_point = 18;
		}
		service.setSev_point(sev_point);
		
		// Check the data existence
		int service_count = mainService.checkServiceData(user_id, rec_dt, sev_kind);
		System.out.println("reading_count = "+service_count);
		
		if (service_count > 0) {
			// Update data
			mainService.updtService(service);
		}else if(service_count == 0) {
			// Insert data
			mainService.saveService(service);
		}
		
		
		return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
	}
}
