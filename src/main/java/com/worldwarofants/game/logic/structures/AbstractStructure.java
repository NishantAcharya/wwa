package com.worldwarofants.game.logic.structures;

public class AbstractStructure{
	protected float hp;
	protected boolean isUpgradable; //if current structure is upgradable
	protected String resourceType; //what resource will the structure be used for
	protected int id; //unique strucutre id
	protected AbstractStrcuture node1;//Reference one to the next node
	protected AbstractStructure node2;//Reference two to the bext node

	public AbstractStructure(float hp, boolean isUpgradable, String resourceType,int id,AbstractStructure node1,AbstractStructure node2){
		this.hp = hp;
		this.isUpgradable = isUpgradable;
		this.resourceType = resourceType;
		this.id = id;
		this.node1 = node1;
		this.node2 = node2;
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

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public void setNode1(AbstractStructure node1){
		this.node1  = node1;
	}
	
	public void setNode2(AbstractStructure node2){
		this.node2 = node2;
	}
	
	public AbstractStructure getNode1(){
		return this.node1;
	}
	
	public AbstractStructure getNode2(){
		return this.node2;
	}
}
