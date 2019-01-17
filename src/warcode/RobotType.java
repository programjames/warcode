package warcode;

public enum RobotType {
	CASTLE(0, 0, 81, 0), PEASANT(1, 5, 81, 0), ARCHER(2, 5, 64, 144), MAGE(3, 2, 20, 20), KNIGHT(4, 9, 36, 5);
	
	public int TYPE, SPEED, VISION, ATTACK;
	
	RobotType(int type, int moveSpeed, int visionRadius, int attackRadius) {
		TYPE = type;
		SPEED = moveSpeed;
		VISION = visionRadius;
		ATTACK = attackRadius;
	}
}
