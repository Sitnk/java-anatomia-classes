public class MinhaClasse {
    
      
    public static void main (string [] args) {

       string primeiroNome = "Gleyson";
       string segundoNome = "Sampaio";

       string nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
       system.out.println(nomeCompleto);

    }

    public static String nomeCompleto (string primeiroNome, string segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
