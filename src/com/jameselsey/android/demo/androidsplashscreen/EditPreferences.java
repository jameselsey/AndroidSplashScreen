package com.jameselsey.android.demo.androidsplashscreen;


import android.os.Bundle;
import android.preference.PreferenceActivity;



/**
 * This class takes care of the preferences
 */
public class EditPreferences extends PreferenceActivity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		addPreferencesFromResource(R.xml.preferences);
	}
}
