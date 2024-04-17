public class Main {
    import java.util.ArrayList;
    import java.util.List;
    
    class Aluno {
        private String matricula;
        private String nome;
        private String curso;
    
        public Aluno(String matricula, String nome, String curso) {
            this.matricula = matricula;
            this.nome = nome;
            this.curso = curso;
        }
    
        public String getMatricula() {
            return matricula;
        }
    
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getCurso() {
            return curso;
        }
    
        public void setCurso(String curso) {
            this.curso = curso;
        }
    }
    
    class Professor {
        private String siape;
        private String nome;
        private String titulacao;
    
        public Professor(String siape, String nome, String titulacao) {
            this.siape = siape;
            this.nome = nome;
            this.titulacao = titulacao;
        }
    
        public String getSiape() {
            return siape;
        }
    
        public void setSiape(String siape) {
            this.siape = siape;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getTitulacao() {
            return titulacao;
        }
    
        public void setTitulacao(String titulacao) {
            this.titulacao = titulacao;
        }
    }
    
    class TecnicoAdministrativo {
        private String siape;
        private String nome;
    
        public TecnicoAdministrativo(String siape, String nome) {
            this.siape = siape;
            this.nome = nome;
        }
    
        public String getSiape() {
            return siape;
        }
    
        public void setSiape(String siape) {
            this.siape = siape;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    }
    
    class FilaRefeitorio {
        private List<Object> fila;
    
        public FilaRefeitorio() {
            this.fila = new ArrayList<>();
        }
    
        public void entrarNaFila(Object pessoa) {
            this.fila.add(pessoa);
        }
    
        public Object sairDaFila() {
            if (!this.fila.isEmpty()) {
                return this.fila.remove(0);
            } else {
                return "Fila vazia";
            }
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            FilaRefeitorio filaRefeitorio = new FilaRefeitorio();
    
            Aluno aluno1 = new Aluno("2023001", "João", "Engenharia");
            Professor professor1 = new Professor("123456", "Maria", "Doutorado");
            TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo("987654", "José");
    
            filaRefeitorio.entrarNaFila(aluno1);
            filaRefeitorio.entrarNaFila(professor1);
            filaRefeitorio.entrarNaFila(tecnico1);
    
            System.out.println(filaRefeitorio.sairDaFila());
            System.out.println(filaRefeitorio.sairDaFila());
            System.out.println(filaRefeitorio.sairDaFila());
            System.out.println(filaRefeitorio.sairDaFila());
        }
    }
       
}
