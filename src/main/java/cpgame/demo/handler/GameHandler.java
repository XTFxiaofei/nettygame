package cpgame.demo.handler;

import cpgame.demo.domain.GameRequest;
import cpgame.demo.domain.GameResponse;


public abstract interface GameHandler
{
  public abstract void execute(GameRequest paramGameRequest, GameResponse paramGameResponse);
}
