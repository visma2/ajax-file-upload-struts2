/**
 * 17 Oct 2007 13:41:07
 */
package com.davidjc.ajaxfileupload.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
 * @author davidc
 * @since  17 Oct 2007 13:41:07
 */
@StrutsTag(name="progressbar", tldBodyContent="empty", tldTagClass="com.davidjc.ajaxfileupload.components.ProgressBar",
	    description="Whatever")
public class ProgressBar extends ClosingUIBean {

    private final Logger logger = Logger.getLogger("org.apache.struts2test");

    
    private String action;
    private String dobefore;
    private String doafter;
    
    private static final String OPEN_TEMPLATE  = "progressbar";
    private static final String CLOSE_TEMPLATE = "progressbar-close";
    
    
    public ProgressBar(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }
    
    @Override
    protected void evaluateExtraParams() {
	super.evaluateExtraParams();
	logger.info("");
	if(action != null)
	    addParameter("action", findString(action));
	if(doafter != null)
	    addParameter("doafter", findString(doafter));
	if(dobefore != null)
	    addParameter("dobefore", findString(dobefore));
    }

    /* (non-Javadoc)
     * @see org.apache.struts2.components.ClosingUIBean#getDefaultOpenTemplate()
     */
    @Override
    public String getDefaultOpenTemplate() {
	logger.info("");
	return OPEN_TEMPLATE;
    }

    /* (non-Javadoc)
     * @see org.apache.struts2.components.UIBean#getDefaultTemplate()
     */
    @Override
    protected String getDefaultTemplate() {
	logger.info("");
	return CLOSE_TEMPLATE;
    }

    public void setAction(String action) {
	this.action = action;
    }

    public String getAction() {
	return action;
    }

    public void setDoafter(String doafter) {
	this.doafter = doafter;
    }

    public String getDoafter() {
	return doafter;
    }

    public void setDobefore(String dobefore) {
	this.dobefore = dobefore;
    }

    public String getDobefore() {
	return dobefore;
    }

}
