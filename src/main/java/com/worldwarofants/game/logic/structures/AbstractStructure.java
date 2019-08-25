package com.worldwarofants.game.logic.structures;

public class AbstractStructure{
	//TODO - need to add the production stats, amount of resources produced, 0 for the non production structures.
	//TODO - need to remove the coordinates and the related setter and getter methods.
	//TODO - need to add references to other structures(two other structures)
	private float hp;
	private boolean isUpgradable; //if current structure is upgradable
	private String resourceType; //what resource will the structure be used for
	private int xCoor, yCoor; //(x,y) coordinates .        //TODO - This needs to be removed
	private int id; //unique strucutre id

	public AbstractStructure(float hp, boolean isUpgradable, String resourceType, int xCoor, int yCoor, int id){
		this.hp = hp;
		this.isUpgradable = isUpgradable;
		this.resourceType = resourceType;
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		this.id = id;
	}

	//getters and setters
	public String getResourceType(){
		return resourceType;
	}

	public void setResourceType(String resourceType){
		this.resourceType = resourceType;
	}

	public void setUpgradable(boolean upgradable){
		this.isUpgradable = upgradable;
	}

	public boolean isUpgradable(){
		return isUpgradable;
	}

	public float getHp(){
		return hp;
	}

	public void setHp(float hp){
		this.hp = hp;
	}

	public int getxCoor(){
		return xCoor;
	}

	public void setxCoor(int xCoor){
		this.xCoor = xCoor;
	}

	public int getyCoor(){
		return yCoor;
	}

	public void setyCoor(int yCoor){
		this.yCoor = yCoor;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}
}
