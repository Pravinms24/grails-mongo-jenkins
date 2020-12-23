import org.poc.Book
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_jenkinspoc_book_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/book/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: bookInstance, field: 'email', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("book.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("email"),'required':(""),'value':(bookInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'experience', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("book.experience.label"),'default':("Experience")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("experience"),'required':(""),'value':(bookInstance?.experience)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'name', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("book.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("name"),'required':(""),'value':(bookInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'position', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("book.position.label"),'default':("Position")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("position"),'required':(""),'value':(bookInstance?.position)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bookInstance, field: 'salary', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("book.salary.label"),'default':("Salary")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("salary"),'value':(fieldValue(bean: bookInstance, field: 'salary')),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1608012580568L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
