<%@ page import="org.poc.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="employee.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="age" required="" value="${employeeInstance?.age}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'experience', 'error')} required">
	<label for="experience">
		<g:message code="employee.experience.label" default="Experience" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="experience" required="" value="${employeeInstance?.experience}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employee.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${employeeInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'salary', 'error')} required">
	<label for="salary">
		<g:message code="employee.salary.label" default="Salary" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="salary" required="" value="${employeeInstance?.salary}"/>

</div>

