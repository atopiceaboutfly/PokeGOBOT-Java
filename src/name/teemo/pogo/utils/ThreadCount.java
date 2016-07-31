package name.teemo.pogo.utils;

public class ThreadCount {
	private Integer runThreadCount;
	private Integer catchPokemonCount;
	private Integer releasePokemonCount;
	private Integer getPokestopItem;
	private Integer dropPokestopItem;
	private Integer getExperience;
	
	public ThreadCount() {
		runThreadCount = 0;
		catchPokemonCount = 0;
		releasePokemonCount = 0;
		getPokestopItem = 0;
		dropPokestopItem = 0;
		getExperience = 0;
	}

	public Integer getRunThreadCount() {
		return runThreadCount;
	}

	public void setRunThreadCount(Integer runThreadCount) {
		this.runThreadCount = runThreadCount;
	}

	public Integer getCatchPokemonCount() {
		return catchPokemonCount;
	}

	public void setCatchPokemonCount(Integer catchPokemonCount) {
		this.catchPokemonCount = catchPokemonCount;
	}

	public Integer getReleasePokemonCount() {
		return releasePokemonCount;
	}

	public void setReleasePokemonCount(Integer releasePokemonCount) {
		this.releasePokemonCount = releasePokemonCount;
	}

	public Integer getGetPokestopItem() {
		return getPokestopItem;
	}

	public void setGetPokestopItem(Integer getPokestopItem) {
		this.getPokestopItem = getPokestopItem;
	}

	public Integer getDropPokestopItem() {
		return dropPokestopItem;
	}

	public void setDropPokestopItem(Integer dropPokestopItem) {
		this.dropPokestopItem = dropPokestopItem;
	}

	public Integer getGetExperience() {
		return getExperience;
	}

	public void setGetExperience(Integer getExperience) {
		this.getExperience = getExperience;
	}	

	
}