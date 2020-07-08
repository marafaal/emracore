package org.openmrs.module.emracore.page.controller;

import java.util.Date;
import org.openmrs.api.context.Context;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.openmrs.Concept;
import org.openmrs.Obs;
import org.openmrs.Person;
import org.openmrs.Encounter;
import org.openmrs.Location;

public class AddingvacPageController {
	
	@RequestMapping(value = "/module/emracore/addingvac", method = RequestMethod.POST)
	
	public void controller(@RequestParam(required=false, value="vaccin") Integer vac) {
		
		Person p = Context.getPersonService().getPerson(3);
	    Concept c = Context.getConceptService().getConcept(165865);
	    Concept value = Context.getConceptService().getConcept(vac);
		Location loc = Context.getLocationService().getLocation(5);
		
		Obs o = new Obs();
	    o.setPerson(p);
		o.setConcept(c);
		o.setValueCoded(value);
		o.setObsDatetime(new Date());
		o.setLocation(loc);
		o.setDateCreated(new Date());

		Context.getObsService().saveObs(o, null);
		
		
	}


}

