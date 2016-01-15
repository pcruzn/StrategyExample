package cl.utfsm.inf.adsw.metric;

import cl.utfsm.inf.adsw.issuetrackerelements.Issue;
import cl.utfsm.inf.adsw.strategy.ElapsedTimeStrategy;

public class IssueMetric {
	private Issue issue;
	private ElapsedTimeStrategy elapsedTimeStrategy;
	
	// here, the constructor sets the strategy (or the algorithm)
	public IssueMetric (Issue issue, ElapsedTimeStrategy elapsedTimeStrategy) {
		this.issue = issue;
		this.elapsedTimeStrategy = elapsedTimeStrategy;
	}
	
	// once the strategy is set, we get the metric
	public int getElapsedTime() {
		return elapsedTimeStrategy.determineElapsedTime(issue);
	}
}
