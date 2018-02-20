package cloneDetection;

import java.util.List;

import datastructures.result.Results;
import ecst.ECSTree;

public interface CloneDetective {
	 
	Results detectClones(List<ECSTree> compilationUnits);

}
