package br.com.model;

import java.util.ArrayList;

import br.com.dao.HotelDAO;


public class HotelBO {

	
	HotelDAO hotelDAO = new HotelDAO();
	
	//Recebe o método da DAO e implementa ele na Controller.
	public ArrayList<HotelModel> showHotel(){
		return hotelDAO.showHotel();
		
	}
	//Recebe o método da DAO e implementa ele na Controller.
	////////////////////////////////////////////////////
	public ArrayList<NorteModel> norteHotel(){
		return hotelDAO.norteHotel();
		
	}
	//Recebe o método da DAO e implementa ele na Controller.
	/////////////////////////////////////////////////////
	public ArrayList<SulModel> sulHotel(){
		return hotelDAO.sulHotel();
			
	}
	//Recebe o método da DAO e implementa ele na Controller.
	//////////////////////////////////////////////////////
	public ArrayList<OesteModel> oesteHotel(){
		return hotelDAO.oesteHotel();
	}
	//Recebe o método da DAO e implementa ele na Controller.
	///////////////////////////////////////////////////////
	public ArrayList<SudesteModel> sudesteHotel(){
		return hotelDAO.sudesteHotel();
	}
	
	
}
