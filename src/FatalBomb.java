public class FatalBomb extends Bombs {
	private boolean bomb = false;

	public int changes(int lives) {
		return isSliced() ? 0 : lives;
	}

	@Override
	public boolean isSliced() {
		return bomb; // if true lives == 0 else nothing
	}

	@Override
	public void slice() {
		bomb = true;
	}

}
