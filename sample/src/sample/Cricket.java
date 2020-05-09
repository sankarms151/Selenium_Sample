package sample;

public class Cricket {
	
	private String teamName;
	private int teamSize;
	
	public Cricket(String team, int teamSize) {
		teamName = team;
		this.teamSize = teamSize;
	}
	
	/**
	 * Getting the team name.
	 * @return String
	 */
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}	
	
	public static String getICCName() {
		return "ICC";
	}

}