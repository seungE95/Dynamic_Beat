package dynamic_beat_6;

public class Track {
	
	private String titleImage;//제목부분 이미지
	private String startImage;//게임 선택 창 표지 이미지
	private String gameImage;//해당 곡을 실행했을 때 표지 이미지
	private String startMusic;//게임 선택 창 음악
	private String gmaeMusic;//해당 곡을 실행했을 때 음악
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGmaeMusic() {
		return gmaeMusic;
	}
	public void setGmaeMusic(String gmaeMusic) {
		this.gmaeMusic = gmaeMusic;
	}
	public Track(String titleImage, String startImage, String gameImage, String starMusic, String gmaeMusic) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = starMusic;
		this.gmaeMusic = gmaeMusic;
	}
	
}
