// mika.nokka1@gmail.com to study Role Base User picker setting based on checkbox selection
// Script Runner Behaviours
//


package com.onresolve.jira.groovy.doit6  // this script must be living under this tree starting from /scripts directory (<jira place>/scripts/com/onresolve/jira/groovy/doit6)
import com.atlassian.jira.component.ComponentAccessor
import org.apache.log4j.Logger
import org.apache.log4j.Level
import com.atlassian.jira.issue.Issue
import com.atlassian.jira.issue.MutableIssue
import com.onresolve.jira.groovy.user.FieldBehaviours   // class to be used if script in server
import com.atlassian.jira.issue.IssueManager
import static com.atlassian.jira.issue.IssueFieldConstants.*  // can use things like AFFECTED_VERSIONS see: https://docs.atlassian.com/software/jira/docs/api/7.6.1/constant-values.html#com.atlassian.jira.issue.IssueFieldConstants.FIX_FOR_VERSIONS
import com.atlassian.jira.ComponentManager
import com.onresolve.scriptrunner.runner.util.UserMessageUtil



public class SetRolePicker extends FieldBehaviours {
	
	
		
		
	void doit6() {	// just a method runtime system is calling (used in Behaviours configurations)


		def customFieldManager = ComponentAccessor.getCustomFieldManager()
		def groupManager = ComponentAccessor.getGroupManager()

		// set logging to Jira log
		def log = Logger.getLogger("RoleSetting") // change for customer system
		log.setLevel(Level.DEBUG) // was DEBUG or INFO



		def selectionbox = customFieldManager.getCustomFieldObjectByName("SelectCriteria")
		def selectionvalue = getCustomFieldValue("SelectCriteria")


		log.info ("${issue}: selectionbox-->${selectionvalue} ")


		//def group = groupManager.getGroup("jira-developers")

		//issue.setCustomFieldValue(multiGroupCf, [group])
		//issue.setCustomFieldValue(singleGroupCf, [group])
	}
}	