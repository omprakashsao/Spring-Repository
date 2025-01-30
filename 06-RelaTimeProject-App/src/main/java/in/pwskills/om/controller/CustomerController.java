package in.pwskills.om.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.om.bean.CustomerBO;
import in.pwskills.om.bean.CustomerDTO;
import in.pwskills.om.bean.CustomerVO;
import in.pwskills.om.service.CustomerService;

@Component("controller")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	public String customerProcess(CustomerVO vo) {
		
		CustomerDTO dto = new CustomerDTO();
		
		//converting vo to dto
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		
		
		return service.calculateSimpleInterest(dto);
	
	}

}
