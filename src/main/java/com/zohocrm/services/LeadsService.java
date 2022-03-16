package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Leads;

public interface LeadsService {
	public void saveLeads(Leads lead);

	public List<Leads> getAllLeads();

	public Leads getLeadById(Long id);

}
