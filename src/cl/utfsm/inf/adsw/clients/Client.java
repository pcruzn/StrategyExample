/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.clients;

import cl.utfsm.inf.adsw.issuetrackerelements.Issue;
import cl.utfsm.inf.adsw.metric.IssueMetric;
import cl.utfsm.inf.adsw.strategy.TotalElapsedTimeStrategy;

public class Client {
	public static void main(String[] args) {
		// just for testing the pattern, set the elapsed time strategy as
		// total elapsed time strategy (try with resolved elapsed time strategy)
		IssueMetric issueMetric = new IssueMetric(
										new Issue("10-10-2015", "12-12-2015"),
										new TotalElapsedTimeStrategy()
										);
		
		// print the value of the metric
		System.out.println(issueMetric.getElapsedTime());
	}
}
