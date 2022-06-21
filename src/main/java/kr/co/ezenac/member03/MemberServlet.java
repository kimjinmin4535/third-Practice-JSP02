package kr.co.ezenac.member03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
 @WebServlet("/member2") 
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();			//sql문으로 조회할 memberdao 객체를 생성함
		List<MemberVO> list= dao.listMembers();		//listmembers() 메서드로 회원 정보를 조회함
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td></tr>");
		
		for(int i=0; i<list.size(); i++) {
			MemberVO memberVO = list.get(i); 		//조회한 회원 정보를 for문 <tr>태그 이용해 출력함
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name =memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			out.print("<tr><td>" +id+"</td><td>"
								+pwd+"</td><td>"
								+name+"</td><td>"
								+email+"</td><td>"
								+joinDate+"</td><td>");
		}
		
		out.print("</table></body>");
		out.print("</html>");
	}

}
