package cl.utfsm.inf.adsw.strategy;

import cl.utfsm.inf.adsw.issuetrackerelements.Issue;

public class TotalElapsedTimeStrategy implements ElapsedTimeStrategy {

	@Override
	public int determineElapsedTime(Issue issue) {
		// return close date - open date (attributes from issue)
		// just for example, let's suppose it is 10 days
		return 10;
	}

}
