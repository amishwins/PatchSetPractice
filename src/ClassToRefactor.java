
public class ClassToRefactor {
	
	private String _name;
	private Boolean _state;
	
	public ClassToRefactor() {
		_name = "Large Method";
		_state = false; 
	}
	
	public void methodToRefactorBecauseItsTooLong(String newName, Boolean newState ) {
		// this method is large! let's refactor into two separate (private) methods
		if (newName != null && !newName.isEmpty()) {
			_name = newName;
		}
		
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