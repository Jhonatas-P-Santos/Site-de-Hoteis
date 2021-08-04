package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.model.ConnectionFactory;
import br.com.model.HotelModel;
import br.com.model.NorteModel;
import br.com.model.OesteModel;
import br.com.model.SudesteModel;
import br.com.model.SulModel;




public class HotelDAO {

	
	private Connection connection;
	private PreparedStatement ps;
	private Statement st;
	private ArrayList<HotelModel> nordeste = new ArrayList<HotelModel>();
	private ArrayList<NorteModel> norte = new ArrayList<NorteModel>();
	private ArrayList<OesteModel> oeste = new ArrayList<OesteModel>();
	private ArrayList<SulModel> sul = new ArrayList<SulModel>();
	private ArrayList<SudesteModel> sudeste = new ArrayList<SudesteModel>();
	private ResultSet rs;
	private Connection con;
	
	
	ConnectionFactory conexao = new ConnectionFactory();
	
	public HotelDAO() {
		connection = new ConnectionFactory().getConnection();
		
	}
	
	
	
	public ArrayList<HotelModel> showHotel(){//Método responsável por trazer uma lista de hóteis
		                                                                           //do banco de dados da região nordeste.
		
		String sql = "SELECT * FROM nordeste";
		
try {
			
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				nordeste.add(new HotelModel(rs.getInt("idnordeste"),rs.getInt("telefone"),rs.getString("estado"),rs.getString("site"),rs.getString("nome")));
			
			}
			
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
		}
		return nordeste;				
	}
	
	/*=============================================================================================*/
	
  public ArrayList<NorteModel> norteHotel(){//Método responsável por trazer uma lista de hóteis
                                                                                 //do banco de dados da região norte.
		
		String sql = "SELECT * FROM norte";
		
try {
			
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				norte.add(new NorteModel(rs.getInt("idnorte"),rs.getInt("telefone"),rs.getString("estado"),rs.getString("site"),rs.getString("nome")));
			
			}
			
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
				
	}
      return norte;		
  }
	/*=============================================================================================*/
  
  
  public ArrayList<OesteModel> oesteHotel(){//Método responsável por trazer uma lista de hóteis
                                                                                 //do banco de dados da região oeste.
		
		String sql = "SELECT * FROM oeste";
		
try {
			
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				oeste.add(new OesteModel(rs.getInt("idoeste"),rs.getInt("telefone"),rs.getString("estado"),rs.getString("site"),rs.getString("nome")));
			
			}
			
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
		}
		return oeste;				
	}
	/*=============================================================================================*/
  
  
  public ArrayList<SulModel> sulHotel(){//Método responsável por trazer uma lista de hóteis
                                                                        //do banco de dados da região sul.
		
		String sql = "SELECT * FROM sul";
		
try {
			
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				sul.add(new SulModel(rs.getInt("idsul"),rs.getInt("telefone"),rs.getString("estado"),rs.getString("site"),rs.getString("nome")));
			
			}
			
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
		}
		return sul;				
	}
	/*=============================================================================================*/
  
  
  public ArrayList<SudesteModel> sudesteHotel(){//Método responsável por trazer uma lista de hóteis
                                                                                         //do banco de dados da região sudeste.
		
		String sql = "SELECT * FROM sudeste";
		
try {
			
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				sudeste.add(new SudesteModel(rs.getInt("idsudeste"),rs.getInt("telefone"),rs.getString("estado"),rs.getString("site"),rs.getString("nome")));
			
			}
			
		}catch(Exception erro) {
			System.out.println(erro.getMessage());
		}
		return sudeste;				
	}
}
