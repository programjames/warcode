package warcode;

public class WCRobot {
	private int x, y;
	private Engine engine;
	
	public final RobotType robotType;
	
	public WCRobot(Engine engine, RobotType robotType) {
		this.engine = engine;
		this.robotType = robotType;
	}
	
	public final void move(int x, int y) throws MoveException {
		if(!engine.isOnMap(x, y)) {
			throw new MoveException("Robot cannot move off the map.");
		}
		else if (!engine.isPassable(x, y)) {
			throw new MoveException("Robot cannot move onto impassable tile.");
		}
		else if (engine.isOccupied(x,y)) {
			throw new MoveException("Robot cannot move onto other robot.");
		}
		else {
			this.x = x;
			this.y = y;
		}
	}
	
	public final void attack(int x, int y) throws AttackException {
		if(!engine.isOnMap(x, y)) {
			throw new AttackException("Robot cannot attack off the map.");
		}
		else if (!engine.isPassable(x, y)) {
			throw new AttackException("Robot cannot attack impassable tile.");
		}
		else {
			engine.attack(x, y, this.robotType);
		}
		
	}
	
	public final void mine(int x, int y) throws MineException {
		if(!(robotType==RobotType.PEASANT)) {
			throw new MineException("Only peasants can mine");
		}
		else if(!engine.hasGold(x, y)) {
			throw new MineException(String.format("Location (%d, %d) has no gold.", x, y));
		}
	}
	
	public void turn() {
		
	}
	
}
