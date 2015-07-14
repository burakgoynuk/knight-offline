# knight-offline
Basic knight offline simulation game designed in UML, implemented in Java. Implementation of strategy, factory, and decorator patterns can be seen. 

For Compiling & Running Knight Offline:

	cd source
	javac *.java
	java Simulation
		
Strategies:
	AttackClosest
	AttackWeakest
	RandomMove
	AttackSlowest
	
Decorators:
				 Score Range		Point Color
	Noob  			0-75				Magenta	
	Grade3			76-149				Pink
	Grade2			150-299				Cyan	
	Grade1	 		300-				Yellow
	
	
Extras:

	- Buttons:
		Speed Up, Speed Down and Normal Buttons are implemented.	
	- Keyboard:
		For exiting, "E" character is used.
		For pausing, "P" character is used.
		For continueing, "C" character is used.
		
	- For Special Attacks:
		Circle is drawn from center of the object.
		Color of the cirle is the same as object's team.
		Only Priest's circle is green since it heals.
	
	- For Normal Attacks:
		Line is drawn to other team's corner.
		Color of the line is the same as object's team.
