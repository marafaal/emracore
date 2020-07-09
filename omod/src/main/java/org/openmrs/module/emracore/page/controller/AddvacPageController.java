package org.openmrs.module.emracore.page.controller;



import org.openmrs.Patient;
import org.openmrs.Concept;
import org.openmrs.api.context.Context;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;




public class AddvacPageController {

	public void controller(PageModel model,@RequestParam(required=false, value="patientId") Patient patient, @RequestParam(value = "returnUrl", required = false) String returnUrl) {
		/* Concept concept = Context.getConceptService().getConcept(165865);
		
		model.addAttribute("answers", concept.getAnswers());
		model.addAttribute("returnUrl", returnUrl); */
	    
	}
}
