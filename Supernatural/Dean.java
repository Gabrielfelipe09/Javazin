public class Dean extends Supernatural {

    private String MarcadeCaim;
    private String Colt;
    private String Jaqueta;

    public Dean(){
        super();
    }

    public Dean(String personagem, String armas, int temporadas, String MarcadeCaim, String Colt, String Jaqueta) {
        super(personagem, armas, temporadas);

        this.MarcadeCaim = MarcadeCaim;
        this.Colt = Colt;
        this.Jaqueta = Jaqueta;
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
    
    
    public String getMarcadecaim() {
        return MarcadeCaim;
    }
    
    
    public String getColt() {
        return Colt;
    }

    public String getJaqueta() {
        return Jaqueta;
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

    public void  setMarcadeCaim(String MarcadeCaim){
    this.MarcadeCaim = MarcadeCaim;
    }
    
    public void setColt(String Colt){
        this.Colt = Colt;
    }

    public void setJaqueta(String Jaqueta){
        this.Jaqueta = Jaqueta;
    }
}
