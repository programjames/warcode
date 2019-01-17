package warcode;

public class GameEngineException extends Exception {

	private static final long serialVersionUID = -4309489418536948607L;

	public GameEngineException() {

	}

	public GameEngineException(String message) {
		super(message);
	}

	public GameEngineException(Throwable cause) {
		super(cause);
	}

	public GameEngineException(String message, Throwable cause) {
		super(message, cause);
	}

}
