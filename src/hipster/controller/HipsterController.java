package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * 
 * @author zeas9357
 * @version 1.1 11/19/13
 */
public class HipsterController
{
	/**
	 * Declaration Section
	 */
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster[] classHipsters;
	private int hipsterCount;

	/**
	 * Array that initializes the new Hipsters
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 5;
	}
	
	/**
	 * 
	 * @return selfHipster
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	public void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * 
	 * @param position
	 *            The location in the array. It must be between 0 and
	 *            classHipster.length.
	 * @return The hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}

		return currentHipster;
	}

	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];

		return currentHipster;
	}

	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame,
					"The class is full you are too mainstream to be added");
		}
	}

	public Hipster[] getClassHipsters()
	{
	
		return classHipsters;
	}

}
