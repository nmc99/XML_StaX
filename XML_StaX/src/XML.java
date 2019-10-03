import java.util.List;

public class XML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaxParser read = new StaxParser();
        List<Cliente> readConfig = read.readConfig("C:/Clientes.xml");
        for (Cliente item : readConfig) {
            System.out.println(item.getNombre());
        }

	}

}
