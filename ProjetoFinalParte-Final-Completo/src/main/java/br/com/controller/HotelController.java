package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.HotelBO;
import br.com.model.HotelModel;
import br.com.model.NorteModel;
import br.com.model.OesteModel;
import br.com.model.SudesteModel;
import br.com.model.SulModel;


@WebServlet("/HotelController")
public class HotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public HotelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException  {
		
		HotelBO hotelBO = new HotelBO();
		
		String acao = request.getParameter("address_state");
		
		//Implementa a BO, faz a conexão com a página JSP e apresenta a lista  de hotéis do Nordeste
	     if (acao != null && acao.equals("Nordeste")) {
		ArrayList<HotelModel> nordeste = new ArrayList<HotelModel>();
		nordeste=hotelBO.showHotel();
		request.setAttribute("arrayLista", nordeste);
		request.getRequestDispatcher("listaNordeste.jsp").forward(request, response);
		
	/*=================================================================================*/  
		//Implementa a BO, faz a conexão com a página JSP e apresenta a lista  de hotéis do Norte
		} else if (acao != null && acao.equals("Norte")) {
			ArrayList<NorteModel> norte = new ArrayList<NorteModel>();
			norte = hotelBO.norteHotel();
		    request.setAttribute("arrayLista", norte);
			request.getRequestDispatcher("listaNorte.jsp").forward(request, response);
			
	/*=================================================================================*/
		//Implementa a BO, faz a conexão com a página JSP e apresenta a lista  de hotéis do Oeste
       } else if (acao != null && acao.equals("CentroOeste")) {
			ArrayList<OesteModel> oeste = new ArrayList<OesteModel>();
			oeste = hotelBO.oesteHotel();
		    request.setAttribute("arrayLista", oeste);
			request.getRequestDispatcher("listaOeste.jsp").forward(request, response);
			
	/*=================================================================================*/
		//Implementa a BO, faz a conexão com a página JSP e apresenta a lista  de hotéis do Sudeste
      } else if (acao != null && acao.equals("Sudeste")) {
			ArrayList<SudesteModel> sudeste = new ArrayList<SudesteModel>();
			sudeste = hotelBO.sudesteHotel();
		    request.setAttribute("arrayLista", sudeste);
			request.getRequestDispatcher("listaSudeste.jsp").forward(request, response);
			
	/*=================================================================================*/	
		//Implementa a BO, faz a conexão com a página JSP e apresenta a lista  de hotéis do Sul
      }else if (acao != null && acao.equals("Sul")) {
			ArrayList<SulModel> sul = new ArrayList<SulModel>();
			sul = hotelBO.sulHotel();
		    request.setAttribute("arrayLista", sul);
			request.getRequestDispatcher("listaSul.jsp").forward(request, response);
    }
   			    
		
	}
           
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Pegar o nome da primeira página
		String nome = request.getParameter("nome");
		
		request.setAttribute("nome", nome);
		
		request.getRequestDispatcher("escolhaHotel.jsp").forward(request, response);
			 
	}

}
