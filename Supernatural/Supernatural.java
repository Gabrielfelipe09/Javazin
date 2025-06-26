//Minha série favorita: Supernatural

public class Supernatural {
    String personagem;
    String armas;
    int temporadas;

    public Supernatural(){}

    public Supernatural (String personagem, String armas, int temporadas){
        this.personagem = personagem;
        this.armas = armas;
        this.temporadas = temporadas;
    }

    public String getpersonagem() {
        return personagem;
    }

    public String getarmas() {
        return armas;
    }

    public int gettemporadas() {
        return temporadas;
    }

    public void setPersonagem(String personagem){
        this.personagem = personagem;
    }

    public void setArmas(String armas){
        this.armas = armas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
}
