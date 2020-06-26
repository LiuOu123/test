package LiuOu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LiuOu.entity.Person;
import LiuOu.service.impl.PersonServiceImpl;


@WebServlet("/GetAll")
public class GetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetAll() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PersonServiceImpl psi=new PersonServiceImpl();
		String cao=request.getParameter("cao");
		PrintWriter out=response.getWriter();
		if(cao==null) {
			List<Person> list=psi.chaPerson();
			request.setAttribute("list", list);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if(cao.equals("add")) {
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			int age=Integer.parseInt(request.getParameter("age"));
			String dengji=request.getParameter("dengji");
			String bumen=request.getParameter("bumen");
            Person p=new Person(name,sex,age,dengji,bumen);
            if(psi.add(p)>0) {
            	out.print("<script>alert('添加数据成功');location.href='GetAll'</script>");
            }
		}else if(cao.equals("del")) {
			/*
			 * int id=Integer.parseInt(request.getParameter("id")); if(psi.del(id)>0) {
			 * out.print("<script>alert('删除数据成功');location.href='GetAll'</script>"); }
			 */
			int id=Integer.parseInt(request.getParameter("id"));
			int count=psi.del(id);
			boolean flag=false;
			if(count!=0) {
				flag=true;
			}
			System.out.println("flag:"+flag);
			out.print(flag);
			out.flush();
			out.close();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
