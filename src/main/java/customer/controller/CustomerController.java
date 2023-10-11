package customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import customer.service.CustomerService;
import customer.vo.CustomerVO;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService cusotmerService;
	
	public CustomerController() {
		System.out.println(this.getClass().getName() + "생성자 호출했어영!");
	}
	
	@RequestMapping("/customerList.do")
	public ModelAndView customerList() {
		List<CustomerVO> customerVOs = cusotmerService.getCustomerList();
		return new ModelAndView("customerList", "customerList", customerVOs);
	}
	
	@RequestMapping("/getCustomer.do")
	public String getCustomer(@RequestParam String name, Model model) {
		CustomerVO customerVO = cusotmerService.getCustomer(name);
		model.addAttribute("customer", customerVO);
		return "customerInfo";
	}
}
