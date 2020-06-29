class MainEntranceOpener extends AbstractOpener {

@Override 

public boolean open(String pruefung)
{
    if (pruefung == "MainEntrance")
    {
        return true;
    }
    else 
    {
        return false;
    }
}

}
