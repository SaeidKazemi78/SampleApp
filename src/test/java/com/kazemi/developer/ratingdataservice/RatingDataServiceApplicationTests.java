package com.kazemi.developer.ratingdataservice;

import com.kazemi.developer.ratingdataservice.dto.EmployeeDTO;
import com.kazemi.developer.ratingdataservice.dto.SimpleSource;
import com.kazemi.developer.ratingdataservice.mappers.EmployeeMapper;
import com.kazemi.developer.ratingdataservice.mappers.SimpleSourceDestinationManager;
import com.kazemi.developer.ratingdataservice.model.Employee;
import com.kazemi.developer.ratingdataservice.model.SimpleDestination;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
//import static org.junit
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@RunWith(JUnitPlatform.class)
class RatingDataServiceApplicationTests {

	@Autowired
	SimpleSourceDestinationManager mapper ;

	@Autowired
	EmployeeMapper employeeMapper;

	@Test
	void contextLoads() throws ParseException {

		String dateFormat="HH:mm:ss";
		Employee entity= new Employee();

		entity.setStartDt(new Date());

		EmployeeDTO dto = employeeMapper.employeeToEmployeeDTO(entity);
		System.out.println( " **************** Converted date : " +dto.getEmployeeStartDt());
		SimpleDateFormat dateFormat1 = new SimpleDateFormat(dateFormat);
		assertEquals(dateFormat1.parse(dto.getEmployeeStartDt()).toString(), entity.getStartDt().toString());





	}

}
