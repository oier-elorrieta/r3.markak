package Modelo;

public class Kontsultak {
    private Zinema aukeratuZinema;
    public Areto[] aretolist;
    public Saioa[] saioalist;
    public Filma filma;
    public Areto aretoa;

    public void setAukeratuZinema(Zinema aukeratuZinema) {
        this.aukeratuZinema = aukeratuZinema;
    }


 

    public String[] FilmakZinema(String selectedZinema) {
       
            String []filmakZinema = new String[16];

            
   
			Zinema zinema = new Zinema(selectedZinema, selectedZinema,null, saioalist, aretolist);
            
            if (selectedZinema != null) {
           saioalist = zinema.getSaioalistArray() ;
            if (saioalist != null) {
            for (Saioa saioa : saioalist) {
                Filma filma = saioa.getFilma();
                if (filma != null) {
                for ( int i = 0;i < filmakZinema.length; i++ ) {
                	filmakZinema[i] = filma.getIzena();                    
                }
            }
        }
           
            }
}
			return filmakZinema;
    }
}
