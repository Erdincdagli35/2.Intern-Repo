
public class PC {

	private Screen screen;
	private ComputerCase computerCase;
	private MotherBoard motherBoard;
		
	public PC(Screen screen, ComputerCase computerCase, MotherBoard motherBoard) {
		this.screen = screen;
		this.computerCase = computerCase;
		this.motherBoard = motherBoard;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public ComputerCase getComputerCase() {
		return computerCase;
	}
	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}
	public MotherBoard getAnacard() {
		return motherBoard;
	}
	public void setAnacard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}
	
}
