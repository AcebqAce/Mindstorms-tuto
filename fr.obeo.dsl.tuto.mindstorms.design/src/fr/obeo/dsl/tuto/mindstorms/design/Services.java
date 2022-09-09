package fr.obeo.dsl.tuto.mindstorms.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.tuto.mindstorms.Choreography;
import fr.obeo.dsl.tuto.mindstorms.GoForward;
import fr.obeo.dsl.tuto.mindstorms.Instructions;
import fr.obeo.dsl.tuto.mindstorms.Rotate;

/**
 * The services class used by VSM.
 */
public class Services {
    
	public Instructions getNextInstruction(Instructions instruction) {
		Choreography parentChoreography=(Choreography)instruction.eContainer();
		List<Instructions> actions=parentChoreography.getInstructions();
		int position=actions.indexOf(instruction);
		if (position==actions.size()-1) {
			return null;
		}
		else {
			return actions.get(position+1);
		}
	}
	
	public String getLabel(Instructions instruction) {		
		if (instruction instanceof GoForward) {
			return ((GoForward)instruction).getCm()+" cm";
		}
		else if (instruction instanceof Rotate) {
			if (((Rotate)instruction).isRandom())
				return "?";
			else
				return ((Rotate)instruction).getDegrees()+"°";
		}
		else if (instruction instanceof Choreography) {
			return ((Choreography)instruction).getName();
		}
		else
			return "";
	}
}
