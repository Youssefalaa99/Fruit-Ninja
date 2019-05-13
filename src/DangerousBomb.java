public class DangerousBomb extends Bombs {

	private boolean bomb = false; // true if sliced
									// false if not

	public int changes(int lives) {
		return isSliced() ? --lives : lives;
	}

	@Override
	public boolean isSliced() {
		return bomb;
	}

	@Override
	public void slice() {
		bomb = true;
	}
}
