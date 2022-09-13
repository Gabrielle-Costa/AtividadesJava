package devices;

public class Impressora extends Dispositivos{

	public Impressora(String numSerial) {
		super(numSerial);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processo de impressão: " + doc);		
	}
	
	public void print(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
