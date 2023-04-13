package desafios;

public class Testes {
    
	    public static String msgTemp(int temp) {
	        String msg;
	        if (temp > 27) {
	            msg = "Está calor!";
	        } else {
	            msg = "Temperatura agradável!";
	        }
	        return (msg);
	    }    
	    public static void main(String[] args) {
	        int temperatura = 27;
	        System.out.println(msgTemp(temperatura));
	    }
	
}

