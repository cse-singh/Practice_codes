package com.kogent.tags;
import javax.servlet.ServletRequest;
import javax.servlet.jsp.tagext.*;

public class CustomMessage extends BodyTagSupport

{

        String pname;	
	private static final long serialVersionUID = 1L;
	public void setParamName(String s)
	{
		pname=s;
	}
	public String getParamName()
	{ 
		return pname;
	}
	public int doStartTag() 
	{
		ServletRequest req=pageContext.getRequest();

		String pvalue=req.getParameter(pname);
		if ((pvalue.equals("japan")) || (pvalue.equals("Japan"))) 
		{
			return EVAL_BODY_INCLUDE;
		} 
		else 
		{

			return SKIP_BODY;
		}
	} //doStartTag//doStartTag

	public int doAfterBody()
	{
		return SKIP_BODY;
	}//doAfterBody

	public int doEndTag()
	{
		return EVAL_PAGE;
	}//doEndTag

	
}
