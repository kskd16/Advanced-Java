package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class EnumQuestion {
	
	private AnalyticsStore analytics;
	private int k;
	
	
	private Queue<ActionEnum> actions;
	private int totalLoggedActions;
	
	public EnumQuestion(AnalyticsStore analytics, int k) {
		this.analytics = analytics;
		this.k = k;
		this.actions = new LinkedList<>();
		this.totalLoggedActions=0;
	}
	
	public void registerAction( ActionEnum action) {
		actions.add(action);
		totalLoggedActions++;
		
		if(actions.size() == k) {
			
			
			System.out.println("Limit Reached...\nLogs in buffer stored in storage memory");
			analytics.storeActions(actions);
			actions.clear();
		}
		
		
	}
	
	public int getNumberOfActionsRegisteredButNotSentToAnalyticsStore() {
		return actions.size();
	}
	
	public int getTotalNumberOfLoggedActions() {
		return totalLoggedActions;
	}
	
	public void  getPermanentLogs() {
		Queue<ActionEnum> logs = analytics.getPermanentLog();
		
		for(ActionEnum action : actions) {
			System.out.println(action);
		}
	}
	
	
	public static void main(String[] args) {
		
		AnalyticsStore analytics = new AnalyticsStore();
		EnumQuestion eq = new EnumQuestion(analytics, 3);
		
		
		eq.registerAction(ActionEnum.LOGIN);
		eq.registerAction(ActionEnum.VIEW_PRODUCT);
		eq.registerAction(ActionEnum.ADD_TO_CART);
		eq.registerAction(ActionEnum.PURCHASE);
		eq.registerAction(ActionEnum.LOGOUT);
		eq.registerAction(ActionEnum.LOGIN);
		eq.registerAction(ActionEnum.VIEW_PRODUCT);
		eq.registerAction(ActionEnum.ADD_TO_CART);
		eq.registerAction(ActionEnum.PURCHASE);
		eq.registerAction(ActionEnum.LOGOUT);
		eq.registerAction(ActionEnum.LOGIN);
		eq.registerAction(ActionEnum.VIEW_PRODUCT);
		eq.registerAction(ActionEnum.ADD_TO_CART);
		eq.registerAction(ActionEnum.PURCHASE);
		eq.registerAction(ActionEnum.LOGOUT);
		eq.registerAction(ActionEnum.LOGIN);
		eq.registerAction(ActionEnum.VIEW_PRODUCT);
		eq.registerAction(ActionEnum.ADD_TO_CART);
		eq.registerAction(ActionEnum.PURCHASE);
		eq.registerAction(ActionEnum.LOGOUT);
		eq.registerAction(ActionEnum.LOGIN);
		eq.registerAction(ActionEnum.VIEW_PRODUCT);
		eq.registerAction(ActionEnum.ADD_TO_CART);
		eq.registerAction(ActionEnum.PURCHASE);
		eq.registerAction(ActionEnum.LOGOUT);
		System.out.println(eq.getNumberOfActionsRegisteredButNotSentToAnalyticsStore());
		System.out.println(eq.getTotalNumberOfLoggedActions());
		eq.getPermanentLogs();
	}

}
