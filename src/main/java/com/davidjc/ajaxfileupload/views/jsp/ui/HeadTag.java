/**
 * 17 Oct 2007 13:53:50
 */
package com.davidjc.ajaxfileupload.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

import com.davidjc.ajaxfileupload.components.Head;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
 * @author davidc
 * @since  17 Oct 2007 13:53:50
 */
public class HeadTag extends AbstractUITag {

    private final Logger logger = Logger.getLogger("org.apache.struts2test");
    
    public HeadTag() {
    }

    /* (non-Javadoc)
     * @see org.apache.struts2.views.jsp.ComponentTagSupport#getBean(com.opensymphony.xwork2.util.ValueStack, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
	logger.info("");
	return new Head(stack, req, res);
    }

}
