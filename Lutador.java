package ufc;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private Integer idade;
    private float altura, peso;
    private int vitorias, derrotas, decisao;

    public Lutador(String nome, String nacionalidade, Integer idade, float altura, float peso, int vitorias, int derrotas, int decisao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.decisao = decisao;
    }
    
    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + " m");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Decisão: " + this.getDecisao());   
        System.out.println("---------------------------------------");
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Decisão: " + this.getDecisao()); 
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void decisaoLuta(){
        this.setDecisao(this.getDecisao() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
         return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Peso Médio";
        } else if(this.peso <= 120.0){
            this.categoria = "Peso Pesado";
        } else{
            this.categoria = "Inválido";
        }
                
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDecisao() {
        return decisao;
    }

    public void setDecisao(int decisao) {
        this.decisao = decisao;
    }

    
        
    }

   
    

