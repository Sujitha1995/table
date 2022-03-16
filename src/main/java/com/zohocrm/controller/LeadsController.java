package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Leads;
import com.zohocrm.services.LeadsService;

@Controller
public class LeadsController {

	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/leads")
	public String showLeadsPage() {
		return "createLeads";
	}
	
	@RequestMapping("/saveLead")
	public String saveLeadsInfo(@ModelAttribute("lead") Leads lead,ModelMap modelMap) {
		leadsService.saveLeads(lead);
		modelMap.addAttribute("msg","lead is saved");
//		System.out.println(leads.getId());
//		System.out.println(leads.getFirstName());
//		System.out.println(leads.getLastName());
//		System.out.println(leads.getCompany());
//		System.out.println(leads.getEmail());
//		System.out.println(leads.getMobile());
//		System.out.println(leads.getLeadSource());
		return "createLeads";
		
	}
	@RequestMapping("/getleads")
	public String getLeads(ModelMap modelMap) {
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads",leads);
		return "searchResultsjsp";
		
			}
	@RequestMapping("getLeadInfo")
	public String getLeadsInfo(@RequestParam("id") Long id,ModelMap modelMap) {
		//System.out.println(id);
		Leads lead = leadsService.getLeadById(id);
		modelMap.addAttribute("lead", lead);
		return "leadInfo";
			}
}
