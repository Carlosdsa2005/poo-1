package com.mycompany.mavenproject1;


class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro() {
    }

    public Livro(String n, double p,String a,int pg) {
        autor = a;
        paginas = pg;
        nome = n;
        preco = p;
    }
    
    public void ehgrande(){
        if(paginas >200){
            System.out.println("o livro "+ nome + " e grande");
        }
    }
    @Override
        public void ehcaro(){
        if (preco >50)
        {
           System.out.println("o livro " + nome + " e caro");
        }
    }
    
}
