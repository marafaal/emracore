<%
 ui.decorateWith("appui", "standardEmrPage")
      
 %>
 
 <script type="text/javascript">
    var breadcrumbs = [
        { icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' },
        { label: "${ ui.escapeJs(ui.encodeHtmlContent(ui.format(patient.familyName))) }, ${ ui.escapeJs(ui.encodeHtmlContent(ui.format(patient.givenName))) }" , link: '${ui.pageLink("coreapps", "clinicianfacing/patient", [patientId: patient.id])}'},
        { label: "vaccinations" }
    ];
</script>
${ ui.includeFragment("coreapps", "patientHeader", [ patient: patient ]) }
<table>
 <thead>
    <tr>
    
        <th>Vaccination</th>
        
        
        </thead>
    </tr>
    <% if (obs) { %>
        <% obs.each { %>
           <tbody>
            <tr>
                
                
                
                <td>$it.valueCoded.names</td>
               
            </tr>
            </tbody>
        <% } %>
    <% } else { %>
        <tr>
            <td colspan="4">${ ui.message("general.none") }</td>
        </tr>
    <% }  %>

</table>

 <button class ="cancel" onclick="location.href = '${ ui.encodeHtml(returnUrl) }'" >
        Annuler
  </button>   
  
<button class="confirm right" onclick="location.href='${ ui.pageLink("emracore", "addvac",[patientId: patient.id, returnUrl: returnUrl]) }'">
	    Ajouter une vaccination
	</button> 