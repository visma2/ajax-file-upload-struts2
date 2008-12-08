/**
 * 24 Oct 2007 09:42:27
 */
package com.davidjc.ajaxfileupload.action;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Superclass for the file upload action providing the default fields needed for the 
 * fileupload
 * 
 * @author davidc
 * @since  24 Oct 2007 09:42:27
 */
public abstract class FileUpload {

    private final Logger logger = Logger.getLogger(FileUpload.class);

    private File upload;
    private String contentType;
    private String filename;

    public FileUpload() {
    }

    /**
     * The default execute action for your upload action
     * 
     * @return
     */
    public abstract String execute();

    public File getUpload() {
	return upload;
    }

    public void setUpload(File upload) {
	if (logger.isDebugEnabled())
	    logger.debug("Setting file [" + upload + "]");
	this.upload = upload;
    }

    public String getUploadContentType() {
	return contentType;
    }

    public void setUploadContentType(String contentType) {
	if (logger.isDebugEnabled())
	    logger.debug("Setting contentType [" + contentType + "]");
	this.contentType = contentType;
    }

    public String getUploadFileName() {
	return filename;
    }

    public void setUploadFileName(String filename) {
	if (logger.isDebugEnabled())
	    logger.debug("Setting filename [" + filename + "]");
	this.filename = filename;
    }

}
