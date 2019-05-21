public interface GameActions {
	/**
	 * it is used to slice fruits located in your swiping region This method can
	 * take your swiping region as parameters (they depend on how you calculate it).
	 */
	public void sliceObjects();

	/**
	 * saves the current state of the game
	 */
	public void saveGame();

	/**
	 * loads the last saved state of the game
	 */
	public void loadGame();

	public void removeLife();

	public void decreaseScore();


}
