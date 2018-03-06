package javaExampleSpace;
public class Player{
private String playername;
private Double playerheight;
private TeamName teamname;
private String playerdominanthand;
private Double ppg;

public Player() {
	
}

public Player(String playername) {
	this.playername = playername;
}

public Player(String playername, Double ppg) {
	this.playername = playername;
	this.ppg = ppg;
}
public Player(String playername,TeamName teamname, Double playerheight, String playerdominanthand,Double ppg) {
	this(playername);
	this.playerdominanthand = playerdominanthand;
	this.teamname = teamname;
	this.playerheight = playerheight;
	this.ppg = ppg;
}


public void setPlayerDominantHand(String playerdominanthand) {
	this.playerdominanthand = playerdominanthand;
}
public String getPlayerDominantHand(){
	return playerdominanthand;
}

public void setPlayerHeight(Double playerheight) {
	this.playerheight = playerheight;
}
public Double getPlayerHeight() {
	return playerheight;
}
}