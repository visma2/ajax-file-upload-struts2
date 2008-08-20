/**
 * 24 Oct 2007 12:08:17
 */
package com.davidjc.ajaxfileupload.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * This will just output some javascript and css includes
 * 
 * @author davidc
 * @since  24 Oct 2007 12:08:17
 */
public class Head extends UIBean {
    
    public static final String TEMPLATE = "head";

    public Head(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

}