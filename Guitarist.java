
public abstract class Guitarist {
	private Guitar guitar;
	private SoloAction solo;
	
	public Guitarist () {
		this.guitar = new GuitarAir();
		this.solo = new SoloActionNone();
	}
	
	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}
	
	public void setSoloAction(SoloAction solo) {
		this.solo = solo;
	}
	
	public abstract String getName();
	
	public void playGuitar() {
		this.guitar.play();
	}
	
	public void playSolo() {
		this.solo.perform();
	}
}
