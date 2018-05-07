import gpdraw.*;       
public class DrawMan
{
    // instance variables - replace the example below with your own
    private DrawingTool myPen;
    private SketchPad myPaper;
    /**
     * DrawMan Constructor intializes myPaper and myPen
     */
    public DrawMan()
    {
        // initialise instance variables
        myPaper = new SketchPad(500,500);
        myPen = new DrawingTool(myPaper);
    }//Ends DrawMan constructor
    /**
     * Draws hanger/stand for hangman using myPen
     */
    public void drawGallow()
    {
        myPen.up();
        myPen.move(-470,-300); //Preps Draws stand for hang
        myPen.down();
        myPen.move(430,-300); //Draws stand for hang
        myPen.up();
        myPen.move(0,-300); //Preps stand for hang
        myPen.down();
        myPen.move(0,100); //Draws stand for hang
        myPen.move(170,100); //Draws left claw
        myPen.move(280,100); //Draws right claw
        myPen.move(280,20); //Draws final hook for right claw
    }//Ends draw method
    /**
     * Draws man's head using myPen
     */
    public void drawHead()
    {
        myPen.move(260,20);     //Draws man's head
        myPen.move(260,-20);
        myPen.move(300,-20);
        myPen.move(300,20);
        myPen.move(280,20);
    }//Ends drawOne method
    /**
     * Draws man's body using myPen
     */
    public void drawBody()
    {
        myPen.up();
        myPen.move(280,-20);
        myPen.down();
        myPen.move(280,-100); //Body
    }//Ends drawTwo method
    /**
     * Draws man's left arm using myPen
     */
    public void drawLeftArm()
    {
        myPen.up();
        myPen.move(280,-30);
        myPen.down();
        myPen.move(240,-60); //Left arm
    }//Ends drawThree method
    /**
     * Draws man's right arm
     */
    public void drawRightArm()
    {
        myPen.up();
        myPen.move(280,-30);
        myPen.down();
        myPen.move(320,-60);//Right arm
    }//Ends drawFour method
    /**
     * Draws man's left leg 
     */
    public void drawLeftLeg()
    {
        myPen.up();
        myPen.move(280,-100);
        myPen.down();
        myPen.move(240,-130);//Left leg
    }//Ends drawFive method
    /**
     * Draw man's right leg
     */
    public void drawRightLeg()
    {
        myPen.up();
        myPen.move(280,-100);
        myPen.down();
        myPen.move(320,-130);//Right leg
    }//Ends drawSix method
}
