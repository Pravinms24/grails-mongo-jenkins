<%@ page import="org.poc.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="book.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${bookInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'experience', 'error')} required">
	<label for="experience">
		<g:message code="book.experience.label" default="Experience" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="experience" required="" value="${bookInstance?.experience}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="book.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${bookInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'position', 'error')} required">
	<label for="position">
		<g:message code="book.position.label" default="Position" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="position" required="" value="${bookInstance?.position}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'salary', 'error')} required">
	<label for="salary">
		<g:message code="book.salary.label" default="Salary" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="salary" value="${fieldValue(bean: bookInstance, field: 'salary')}" required=""/>

</div>

