<div id="ajaxfileupload"
	<#if parameters.cssClass?exists>
 		class="${parameters.cssClass?html}"<#rt/>
	</#if>
	<#if parameters.cssStyle?exists>
 		style="${parameters.cssStyle?html}"<#rt/>
	</#if>  
>
	
	<div id="fileuploadForm">
	
		<#-- Check for the javascript params and create a var to be used in the onclick of the form -->
		<#if (parameters.doafter??) & (parameters.doafter?trim?length > 0)>
			<#assign doafter = parameters.doafter />
		<#else />
			<#assign doafter = 'undefined' />
		</#if>
		<#if (parameters.dobefore??) & (parameters.dobefore?trim?length > 0)>
			<#assign dobefore = parameters.dobefore />
		<#else />
			<#assign dobefore = 'undefined' />
		</#if>
		
		<@s.form id="ajaxFileUploadForm" onsubmit="return false" action="${parameters.action?html}" method="post" enctype="multipart/form-data" >
			<@s.file name="upload" id="upload" label="Select file"  accept="*/*" size="40" />
		    <@s.submit value="Upload" onclick="return davidjc.AjaxFileUpload.initialise(${dobefore}, ${doafter});" />
		</@s.form>
	</div>
	<div id="fileuploadProgress">    
		<span id="uploadFilename">Initialising, please wait.....</span>
		<div id="progress-bar">
			<div id="progress-bgrd"></div>
		</div>
		<div id="progress-text"></div>
		<br />
	</div> 

</div>