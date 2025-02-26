public class Pessoa {

 private String nome ;
 private String Telefone ;

    public Pessoa(String Telefone, String nome) {
        this.Telefone = Telefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", Telefone=").append(Telefone);
        sb.append('}');
        return sb.toString();
    }



 

}