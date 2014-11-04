package com.dianping.cat.report.page.app;

public enum Action implements org.unidal.web.mvc.Action {
	VIEW("view"),
	LINECHART_JSON("linechartJson"),
	PIECHART("piechart"),
	PIECHART_JSON("piechartJson"),
	APP_ADD("appAdd"),
	APP_DELETE("appDelete"),
	APP_CONFIG_FETCH("appConfigFetch"),
	APP_CODE_UPDATE("appCodeUpdate"),
	APP_CODE_UPDATE_SUBMIT("appCodeUpdateSubmit"),
	CRASH_LINECHART("crashLinechart");
	
	private String m_name;

	public static Action getByName(String name, Action defaultAction) {
		for (Action action : Action.values()) {
			if (action.getName().equals(name)) {
				return action;
			}
		}

		return defaultAction;
	}

	private Action(String name) {
		m_name = name;
	}

	@Override
	public String getName() {
		return m_name;
	}
}
