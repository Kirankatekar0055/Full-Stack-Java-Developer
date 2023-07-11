package mypack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logincontroller 
{
	@RequestMapping("hello")
	public ModelAndView validate(HttpServletRequest req,HttpServletResponse res)
	{
		String u=req.getParameter("uname");
		String p=req.getParameter("pass");
		
		if(u.equals("Kiran0055") && p.equals("Kiran@123"))
		{
			return new ModelAndView("hellopage","msg","welcome"+u);
		}
		else
		{
			return new ModelAndView("errorpage","msg","invalid crediantials.."); 
		}
	}
	
	@RequestMapping("arithmatic")
	public ModelAndView cal(HttpServletRequest req,HttpServletResponse res)
	{
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		String op=req.getParameter("op");
		
		if(op.equals("add"))
		{
			return new ModelAndView("result","r","Addition is:"+(a+b));
		}
		
		else if(op.equals("sub"))
		{
			return new ModelAndView("result","r","Substraction is:"+(a-b)); 
		}
		
		else if(op.equals("mul"))
		{
			return new ModelAndView("result","r","Multiplication is:"+(a*b)); 
		}
		
		else if(op.equals("div"))
		{
			return new ModelAndView("result","r","Division is:"+(a/b)); 
		}
		else
		{
			return new ModelAndView("Welcome");
		}

	}

}

