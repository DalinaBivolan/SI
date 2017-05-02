package Operatii;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JFrame;

import Clase.SectiePolitie;
import ConexiuneBD.ConexiuneDB;

public class Operatii extends ConexiuneDB
{
	//private JFrame jFrame;
	public void AdaugaAgent(String id, String nume, String prenume, String adresaAgent, String pregatireProfesionala, String conduitaMorala, int nrCazuriRezolvate, String functie, String numeSectieAg)
	{
		try{
			 Connection myConnection = GetConnection();	
		     String query = "insert into AgentPolitie (ID, Nume, Prenume, AndresaAgent, PregatireProfesionala, ConduitaMorala, NrCazuriRezolvate, Functie, NumeSectieAg)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		     PreparedStatement preparedStmt = myConnection.prepareStatement(query);
		     preparedStmt.setString(1, id);
		     preparedStmt.setString(2, nume);
		     preparedStmt.setString(3, prenume);
		     preparedStmt.setString(4, adresaAgent);
		     preparedStmt.setString(5, pregatireProfesionala);
		     preparedStmt.setString(6, conduitaMorala);
		     preparedStmt.setInt(7, nrCazuriRezolvate);
		     preparedStmt.setString(8, functie);
		     preparedStmt.setString(9, numeSectieAg);
		     preparedStmt.execute();
		     myConnection.close();
		}
		catch(Exception e)
		{
			System.out.println("Eroare la adaugare Agent");
		}
	}
	public static ArrayList<SectiePolitie> GetAllSectii()
	{
		ArrayList<SectiePolitie> result = new ArrayList<SectiePolitie>();
		try{
			Connection myConnection = GetConnection();
			if (myConnection != null)
			{
				Statement st = myConnection.createStatement();
				ResultSet rs = st.executeQuery("select * from SectiePolitie");
				while (rs.next())
				{
					SectiePolitie sectie = new SectiePolitie();
					sectie.setNumeSectie(rs.getString("NumeSectie"));
					sectie.setAdresaSectie(rs.getString("AdresaSectie"));
					sectie.setSpecificSectie(rs.getString("SpecificSectie"));
					sectie.setNume_IP(rs.getString("Nume_IP"));
					result.add(sectie);
				}
				st.close();
				myConnection.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("A aparut o eroare in extragerea tuturor sectiilor " + e.getMessage());
		}
		return result;
	}
}
