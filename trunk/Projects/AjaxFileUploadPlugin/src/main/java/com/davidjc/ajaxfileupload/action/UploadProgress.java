package com.davidjc.ajaxfileupload.action;

import java.util.Map;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONBuilder;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.davidjc.ajaxfileupload.multipart.ProgressMonitor;
import com.opensymphony.xwork2.Action;

/**
 *
 * @author dave
 */
public class UploadProgress implements SessionAware {

    private static Logger logger = Logger.getLogger(UploadProgress.class);

    private static final String SESSION_BYTES_UPLOADED_NOTCHANGED_COUNT = "SESSION_BYTES_UPLOADED_NOTCHANGED_COUNT";
    
    private Map sessionMap;

    private String rnd; //just a random number 
    private String stringResult;

    public String execute() {
	if (logger.isDebugEnabled())
	    logger.debug("Executing the UploadProgress action");

	Object mon_obj = sessionMap.get(ProgressMonitor.SESSION_PROGRESS_MONITOR);

	JSONObject json = new JSONObject();
	if (mon_obj != null) {
	    ProgressMonitor monitor = (ProgressMonitor) mon_obj;
	    json.accumulate("bytesSent", "" + monitor.getBytesRead());
	    json.accumulate("bytesTotal", "" + monitor.getBytesLength());
	    json.accumulate("percentComplete", "" + monitor.percentComplete());
	    
	    if(!monitor.isStillProcessing() || monitor.isAborted()) {
		json.accumulate("aborted", true);
	    }else {
		json.accumulate("aborted", false);
	    }
	       
	    
	} else {
	    json.accumulate("bytesSent", "" + 0);
	    json.accumulate("bytesTotal", "" + 0);
	    json.accumulate("percentComplete", "" + 0);
	    json.accumulate("aborted", false);
	}

	setStringResult(json.toString());
	if (logger.isDebugEnabled())
	    logger.debug("JSON Result is: " + getStringResult());

	return Action.SUCCESS;
    }

    public void setSession(Map sessionMap) {
	this.sessionMap = sessionMap;
    }

    public void setRnd(String rnd) {
	this.rnd = rnd;
    }

    public String getRnd() {
	return rnd;
    }

    public void setStringResult(String stringResult) {
	this.stringResult = stringResult;
    }

    public String getStringResult() {
	return stringResult;
    }

}
