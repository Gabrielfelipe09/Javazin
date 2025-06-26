public class Sam extends Supernatural {

    String Casca;
    String alma;
    String Casaco;

    public Sam(){
        super();
    }

    public Sam(String personagem, String armas, int temporadas, String Casca, String alma, String Casaco){
        super(personagem, armas, temporadas);

        this.Casca = Casca;
        this.alma = alma;
        this.Casaco = Casaco;
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

    public String getCasca() {
        return Casca;
    }

    public String getAlma() {
        return alma;
    }

    public String getCasaco() {
        return Casaco;
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

    public void setCasca(String Casca){
        this.Casca = Casca;
    }

    public void setAlma(String alma){
        this.alma = alma;
    }

    public void setCasaco(String Casaco){
        this.Casaco = Casaco;
    }


    
}
