package in.pwskills.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.om.bean.CustomerBO;
import in.pwskills.om.bean.CustomerDTO;
import in.pwskills.om.dao.CustomerDao;
import in.pwskills.om.dao.dao;

@Component("service")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao dao;

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) {
		
		Float si= (dto.getPamt()*dto.getRate()*dto.getTime())/100;
		
		CustomerBO bo = new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setSi(si);
		
		
		return dao.insert(bo);
	}

	

}
