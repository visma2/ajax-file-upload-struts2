/**
 * 17 Oct 2007 13:53:50
 */
package com.davidjc.ajaxfileupload.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractClosingTag;

import com.davidjc.ajaxfileupload.components.ProgressBar;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
 * @author davidc
 * @since  17 Oct 2007 13:53:50
 */
public class ProgressBarTag extends AbstractClosingTag {

    private final Logger logger = Logger.getLogger("org.apache.struts2test");

    
    private String action;
    private String dobefore;
    private String doafter;
    
    public ProgressBarTag() {
    }

    /* (non-Javadoc)
     * @see org.apache.struts2.views.jsp.ComponentTagSupport#getBean(com.opensymphony.xwork2.util.ValueStack, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
	logger.info("");
	return new ProgressBar(stack, req, res);
    }

    @Override
    protected void populateParams() {
	super.populateParams();
	logger.info("");
	ProgressBar prg = (ProgressBar) component;
	prg.setAction(action);
	prg.setDoafter(doafter);
	prg.setDobefore(dobefore);
    }

    public void setDoafter(String doafter) {
	this.doafter = doafter;
    }

    public void setDobefore(String dobefore) {
	this.dobefore = dobefore;
    }

    public void setAction(String action) {
	this.action = action;
    }


}
