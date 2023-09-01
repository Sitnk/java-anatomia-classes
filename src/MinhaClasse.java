public class MinhaClasse {
    
      
    public static void main (String [] args) {

       String primeiroNome = "Gleyson";
       String segundoNome = "Sampaio";

       String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
       System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (string primeiroNome, string segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
