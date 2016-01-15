package cl.utfsm.inf.adsw.strategy;

import cl.utfsm.inf.adsw.issuetrackerelements.Issue;

public interface ElapsedTimeStrategy {
	public int determineElapsedTime(Issue issue);
}
