package devices;

public class Scanner extends Dispositivos{

	public Scanner(String numSerial) {
		super(numSerial);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processo de scanner: " + doc);
		
	}
	
	public String scanner() {
		return "Scaneamento completo";
	}

}
