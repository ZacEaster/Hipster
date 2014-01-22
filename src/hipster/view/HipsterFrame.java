package hipster.view;

import javax.swing.JFrame;

import hipster.controller.HipsterController;

public class HipsterFrame extends JFrame
{
	/**
	 * Declaration Section
	 */
	private HipsterController badController;
	private HipsterPanel basePanel;

	/**
	 * 
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.badController = baseController;
		basePanel = new HipsterPanel(baseController);

		setupFrame();
	}
	
	/**
	 * Sets dimensions of the pop up window
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
}
