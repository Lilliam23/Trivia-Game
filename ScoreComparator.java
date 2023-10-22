package finalproject;

import java.util.*;

public class ScoreComparator implements java.util.Comparator<Player> {

	@Override
	public int compare(Player pl1, Player pl2) {
		return -(pl1.getPoint() - pl2.getPoint()) ;
	}

}
