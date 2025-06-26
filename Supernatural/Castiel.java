public class Castiel extends Supernatural {

    String Graça;
    String Trueform;
    String Sobretudo;

    public Castiel(){
        super();
    }
    
        public Castiel(String personagem, String armas, int temporadas, String Graça, String Trueform, String Sobretudo){
        super(personagem, armas, temporadas);

        this.Graça = Graça;
        this.Trueform = Trueform;
        this.Sobretudo = Sobretudo;
    }

        @Override
    public String getarmas() {
        return super.armas;
    }

    @Override
    public int gettemporadas() {
        return super.temporadas;
    }
    
    @Override
    public String getpersonagem() {
        return super.personagem;
    }

    public String getGraça() {
        return Graça;
    }

    public String getTrueform() {
        return Trueform;
    }

    public String getSobretudo() {
        return Sobretudo;
    }

    public void setPersonagem(String personagem){
    this.personagem = personagem;
    }

    public void  setArmas(String armas){
    this.armas = armas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setGraça(String Graça){
        this.Graça = Graça;
    }

    public void setTrueform(String Trueform){
        this.Trueform = Trueform;
    }

    public void setCasaco(String Sobretudo){
        this.Sobretudo = Sobretudo;
    }


    
}
