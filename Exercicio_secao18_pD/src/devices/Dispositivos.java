package devices;

public abstract class Dispositivos {

	private String numSerial;

	public Dispositivos(String numSerial) {
		this.numSerial = numSerial;
	}

	public String getNumSerial() {
		return numSerial;
	}

	public void setNumSerial(String numSerial) {
		this.numSerial = numSerial;
	}

	public abstract void processDoc(String doc) ;

	

}
