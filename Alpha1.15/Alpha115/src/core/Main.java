package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {

    public static final String GAMENAME = "Legendary Adventure - Alpha 1.1";
    
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    public static final int MENU = 0;
    public static final int PLAY = 1;
    public static final int OPTIONS = 2;
    public static final int CHARACTER = 3;
    public static final int BAG = 4;
    public static final int QUESTS = 5;
    public static final int SKILLS = 6;
    public static final int MAP = 7;
    public static final int LOAD = 10;
    public static final int SAVE = 11;
    public static final int CREDITS = 12;
    public static final int PAUSE = 13;

    public Main() {
        super(GAMENAME);
        this.addState(new states.MenuState(MENU));
        this.addState(new states.PlayState(PLAY));
        this.addState(new states.OptionsState(OPTIONS));
        this.addState(new states.CharacterState(CHARACTER));
        this.addState(new states.BagState(BAG));
        this.addState(new states.QuestsState(QUESTS));
        this.addState(new states.SkillsState(SKILLS));
        this.addState(new states.MapState(MAP));
        this.addState(new states.LoadGameState(LOAD));
        this.addState(new states.SaveGameState(SAVE));
        this.addState(new states.CreditsState(CREDITS));
        this.addState(new states.PauseState(PAUSE));
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        enterState(MENU);
        this.getState(MENU).init(gc, this);
        this.getState(PLAY).init(gc, this);
        this.getState(OPTIONS).init(gc, this);
        this.getState(CHARACTER).init(gc, this);
        this.getState(BAG).init(gc, this);
        this.getState(QUESTS).init(gc, this);
        this.getState(SKILLS).init(gc, this);
        this.getState(MAP).init(gc, this);
        this.getState(LOAD).init(gc, this);
        this.getState(SAVE).init(gc, this);
        this.getState(CREDITS).init(gc, this);
        this.getState(PAUSE).init(gc, this);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer window = new AppGameContainer(new Main());
            window.setDisplayMode(WIDTH, HEIGHT, false);
            window.setTargetFrameRate(100);
            window.setShowFPS(false);
            window.setVSync(true);
            window.setMaximumLogicUpdateInterval(10);
            window.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
