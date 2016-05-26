package com.assignment.approval.service;

public class ApproverHandlerUtil {
	public static ApproverHandler setUpChain() {
		ApproverHandler levelOne = new LevelOneApprover();
		ApproverHandler levelTwo = new LevelOneApprover();
		ApproverHandler levelThree = new LevelOneApprover();

		levelOne.setSupervisor(levelTwo);
		levelTwo.setSupervisor(levelThree);

		return levelOne;
	}
}
