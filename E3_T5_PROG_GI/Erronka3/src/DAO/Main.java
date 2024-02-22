package DAO;

import Modelo.Bezeroa;
import Modelo.Zinema;

import java.util.Arrays;

import Modelo.Areto;
import Modelo.Saioa;

public class Main {
	 private KonexioaBD konexioaBD;
	
	public Main() {
		konexioaBD = new KonexioaBD();
    }

    public static void main(String[] args) {
    	
    	
        ZinemakDAO dao = new ZinemakDAO();
        Zinema[] zinemaList = dao.getAllZinemak();
        AretoDAO dao2 = new AretoDAO();
        Areto[] aretoList = dao2.getAllAretoak();
        SaioaDAO dao3 = new SaioaDAO();
        Saioa[] saioaList = dao3.getAllSaioak();
        
        for (Zinema zinema : zinemaList) {
            System.out.println("zinema_id: " + zinema.getId_zine());
            System.out.println("Izena " + zinema.getIzena());

               
                }
        
        for (Saioa saioa : saioaList) {
            System.out.println("Zinema: " + zinema.getIzena());
            System.out.println("Saioa list array: " + saioa.getFilma().getIzena().equals("handia"));
            System.out.println("Areto list array: " + saioa.getFilma().getIraupena());
            System.out.println(saioa.getFilma().getGeneroa());
            }
            

           // System.out.println("Aretoak:");
//            for (Areto areto : aretoList) {
//                System.out.println("    Areto id: " + areto.getIzena());
//                System.out.println("    Areto izena: " + areto.getIzena());
//                           
//            }
//            System.out.println("Saioak:");
//            for (Saioa saioa : saioaList) {
//                System.out.println("    Saioa id: " + saioa.getOrdua());
//                System.out.println("    Saioa data: " + saioa.getDate());
//                System.out.println("Filmak: " + saioa.getFilma());
//                System.out.println("Aretoak " + saioa.getAretoa());
//                
//            }
//            
//            for (Saioa saioa : saioaList){
//         	   if (saioa.getFilma().getIzena().equals("Odisea 2001")) {
//         	   
//         	System.out.println("Izena " + saioa.getFilma().getIzena());
//         	System.out.println("Iraupena " + saioa.getFilma().getIraupena());
//         	System.out.println("Gneroa " + saioa.getFilma().getGeneroa());
//             break;
//             }
//            }
         
            System.out.println("-----------------------------");
        }
    }
}

