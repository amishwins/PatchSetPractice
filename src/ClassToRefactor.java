public class ClassToRefactor {
	
	private String _name;
	private Boolean _state;
	
	public ClassToRefactor() {
		_name = "Large Method";
		_state = false; 
	}
	
	public String formattedResponse() {
		return getName() + " " + "hello";
	}
	
	public String cheeze() {
		return getName() + " " + "cheeze!";
	}
	
	public void setClassField(String newName, Boolean newState ) {
		setName(newName);
		setState(newState);
	}

	private void setName(String newName) {
		if (newName != null && !newName.isEmpty()) {
			_name = newName;
		}
	}

	private void setState(Boolean newState) {
		if (newState == true) {
			_state = newState;
		}
	}
	
	public String getName() {
		return _name;
	}
	
	public Boolean getState() {
		return _state;
	}
}