package com.lj.logic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleServlet
 */
@WebServlet("/HandleServlet")
public class HandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String area;
		String cabinType;
		double Totalprice=0;
		request.setCharacterEncoding("UTF-8");
		area=request.getParameter("area");
		cabinType=request.getParameter("cabinType");
		System.out.println(area);
		System.out.println(cabinType);
		if(area.equals("国内航班")) {
			String weightDomestic=request.getParameter("weightDomestic");
			String currentPrice=request.getParameter("currentPrice");
			double weight=Math.ceil(Double.parseDouble(weightDomestic));
			double price=Double.parseDouble(currentPrice);
			System.out.println(weight);
			System.out.println(price);
			
			if(cabinType.equals("头等舱")) {
				if(weight<=40) {
					Totalprice=0;
				}
				else {
					Totalprice=(weight-40)*price*(1.5/100);
				}
			}
			else if(cabinType.equals("公务舱")) {
				if(weight<=30) {
					Totalprice=0;
				}
				else {
					Totalprice=(weight-30)*price*(1.5/100);
				}
				
			}
			else if(cabinType.equals("经济舱")) {
				if(weight<=20) {
					Totalprice=0;
				}
				else {
					Totalprice=(weight-20)*price*(1.5/100);
				}
			}
			else if(cabinType.equals("婴儿")) {
				if(weight<=10) {
					Totalprice=0;
				}
				else {
					Totalprice=(weight-10)*price*(1.5/100);
				}
			}
			
		}
		else if(area.equals("区域一")) {
			request.setCharacterEncoding("UTF-8");
			String totalNum=request.getParameter("totalNum");
			System.out.println(totalNum);
			System.out.println(cabinType);
			double num=Double.parseDouble(totalNum);
			if(cabinType.equals("头等舱、公务舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=32 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<159) {
							qualified++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+3000*overweight;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*2000+1000+1000*Oversize+3000*overweight;
					}
				}
			
			}
			else if(cabinType.equals("明珠经济舱、经济舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							Totalprice+=1000;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight1=0;
					int overweight2=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=23 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<=158) {
							qualified++;
						}
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							overweight1++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight2++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+1000*overweight1+3000*overweight2;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*2000+1000+1000*Oversize+1000*overweight1+3000*overweight2;
					}
				}
			
			}
		}
		else if(area.equals("区域二")) {
			request.setCharacterEncoding("UTF-8");
			String totalNum=request.getParameter("totalNum");
			double num=Double.parseDouble(totalNum);
			if(num<=3) {
				for(int i=1;i<=num;i++) {
					String baggageweight="baggage"+i+"weight";
					String baggagesize="baggage"+i+"size";
					baggageweight=request.getParameter(baggageweight);
					baggagesize=request.getParameter(baggagesize);
					if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
						Totalprice+=3000;
					}
					if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
						Totalprice+=1000;
					}
				}
				
			}
			else {
				int qualified=0;
				int overweight=0;
				int Oversize=0;
				for(int i=1;i<=num;i++) {
					String baggageweight="baggage"+i+"weight";
					String baggagesize="baggage"+i+"size";
					baggageweight=request.getParameter(baggageweight);
					baggagesize=request.getParameter(baggagesize);
					if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=32 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<159) {
						qualified++;
					}
					if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
						overweight++;
					}
					if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
						Oversize++;
					}
				}
				if(qualified<=3) {
					Totalprice=1000*Oversize+3000*overweight;
				}
				if(qualified>=4) {
					Totalprice=(qualified-4)*1300+450+1000*Oversize+3000*overweight;
				}
			}
		}
		else if(area.equals("区域三")) {
			request.setCharacterEncoding("UTF-8");
			String totalNum=request.getParameter("totalNum");
			System.out.println(totalNum);
			System.out.println(cabinType);
			double num=Double.parseDouble(totalNum);
			if(cabinType.equals("头等舱、公务舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=32 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<159) {
							qualified++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+3000*overweight;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*2000+1000+1000*Oversize+3000*overweight;
					}
				}
			
			}
			else if(cabinType.equals("明珠经济舱、经济舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							Totalprice+=2000;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight1=0;
					int overweight2=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=23 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<=158) {
							qualified++;
						}
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							overweight1++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight2++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+2000*overweight1+3000*overweight2;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*2000+1000+1000*Oversize+2000*overweight1+3000*overweight2;
					}
				}
			
			}
		}
		else if(area.equals("区域四")) {
			request.setCharacterEncoding("UTF-8");
			String totalNum=request.getParameter("totalNum");
			System.out.println(totalNum);
			System.out.println(cabinType);
			double num=Double.parseDouble(totalNum);
			if(cabinType.equals("头等舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=32 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<159) {
							qualified++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+3000*overweight;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*1300+450+1000*Oversize+3000*overweight;
					}
				}
			
			}
			else if(cabinType.equals("公务舱、明珠经济舱、经济舱")) {
				if(num<=3) {
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						System.out.println(baggageweight);
						System.out.println(baggagesize);
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							Totalprice+=1000;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							Totalprice+=3000;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Totalprice+=1000;
						}
					}
					
				}
				else {
					int qualified=0;
					int overweight1=0;
					int overweight2=0;
					int Oversize=0;
					for(int i=1;i<=num;i++) {
						String baggageweight="baggage"+i+"weight";
						String baggagesize="baggage"+i+"size";
						baggageweight=request.getParameter(baggageweight);
						baggagesize=request.getParameter(baggagesize);
						if(0<Double.parseDouble(baggageweight) && Double.parseDouble(baggageweight)<=23 && 0<Double.parseDouble(baggagesize) && Double.parseDouble(baggagesize)<=158) {
							qualified++;
						}
						if(23<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=32) {
							overweight1++;
						}
						if(32<Double.parseDouble(baggageweight)&&Double.parseDouble(baggageweight)<=45) {
							overweight2++;
						}
						if(159<=Double.parseDouble(baggagesize)&&Double.parseDouble(baggagesize)<=300) {
							Oversize++;
						}
					}
					if(qualified<=3) {
						Totalprice=1000*Oversize+1000*overweight1+3000*overweight2;
					}
					if(qualified>=4) {
						Totalprice=(qualified-4)*1300+450+1000*Oversize+1000*overweight1+3000*overweight2;
					}
				}
			
			}
		}
		
		System.out.println(Totalprice);
		request.getSession().setAttribute("totalprice", ""+Totalprice);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
