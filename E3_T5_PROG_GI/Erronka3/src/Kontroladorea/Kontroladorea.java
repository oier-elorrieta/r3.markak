package Kontroladorea;

import DAO.BezeroaDAO;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;
import Modelo.Bezeroa;
import Modelo.Saioa;
import Modelo.Zinema;
import Vista.OngiEtorri;

public class Kontroladorea {

    public static void main(String[] args) {
        ZinemakDAO zinemakDAO = new ZinemakDAO();
        Zinema[] zinemakList = zinemakDAO.getAllZinemak();
        BezeroaDAO bezeroaDAO = new BezeroaDAO();
        Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();
        try {
            OngiEtorri frame = new OngiEtorri(zinemakList,bezeroak);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}