package cl.utfsm.inf.adsw.strategy;

import cl.utfsm.inf.adsw.issuetrackerelements.Issue;

public class ResolvedElapsedTimeStrategy implements ElapsedTimeStrategy {

	@Override
	public int determineElapsedTime(Issue issue) {
		// return resolved date - open date (attributes from issue)
		// just for example, let's suppose it is 5 days
		return 5;
	}
}
