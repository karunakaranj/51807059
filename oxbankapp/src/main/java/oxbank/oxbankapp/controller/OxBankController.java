package oxbank.oxbankapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oxbank.oxbankapp.entity.Customers;
import oxbank.oxbankapp.entity.Loans;
import oxbank.oxbankapp.entity.Managers;
import oxbank.oxbankapp.service.CustomerService;

@RestController
@RequestMapping("/oxbank/api")
public class OxBankController {
	@Autowired
	CustomerService customerServiceImpl;
	@PostMapping("/customers/add")
	public String addCustomers(@RequestBody Customers customers) {
		return customerServiceImpl.addCustomers(customers);
		
	}
	
	@GetMapping("/customers/get")
	public List<Customers> getAllCustomersDetails(){
		return null;
		
	}
	
	@PostMapping("/managers/add")
	public String addManagers(@RequestBody Managers managers) {
		return null;
	}

	@PostMapping("/cutomers/{customerId}/loans/add")
	public String addLoanToCustomers(@PathVariable Long customerId,@RequestBody Loans loans) {
		return null;
	}
	
	
}
