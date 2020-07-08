package org.openmrs.module.emracore.page.controller;

import java.util.Collections;
import java.util.List;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.Patient;
import org.openmrs.Obs;
import org.apache.commons.lang.StringUtils;
import org.openmrs.Concept;
import org.openmrs.api.context.Context;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

public class VaccinationsPageController {
	
	public void controller(PageModel model, @RequestParam(required=false, value="patientId") Patient patient, 
			@RequestParam(value = "returnUrl", required = false) String returnUrl, UiUtils ui) {
		
		if (StringUtils.isBlank(returnUrl)) {
			returnUrl = ui.pageLink("coreapps", "clinicianfacing/patient",
			    Collections.singletonMap("patientId", (Object) patient.getId()));
		}
		Concept c = Context.getConceptService().getConcept( 165865);
		List <Obs> ob = Context.getObsService().getObservationsByPersonAndConcept(patient, c);
		model.addAttribute("obs", ob);
		model.addAttribute("returnUrl", returnUrl);
		
	}




}
