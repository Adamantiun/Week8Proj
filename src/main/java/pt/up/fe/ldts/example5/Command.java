package pt.up.fe.ldts.example5;

public class Command {
    private char command;
    public Command(char command){
        this.command = command;
    }
    public void execute(Turtle turtle){
        if (command == 'L') { // ROTATE LEFT
            if (turtle.getDirection() == 'N') turtle.setDirection('W');
            else if (turtle.getDirection() == 'W') turtle.setDirection('S');
            else if (turtle.getDirection() == 'S') turtle.setDirection('E');
            else if (turtle.getDirection() == 'E') turtle.setDirection('N');
        } else if (command == 'R') { // ROTATE RIGHT
            if (turtle.getDirection() == 'N') turtle.setDirection('E');
            else if (turtle.getDirection() == 'E') turtle.setDirection('S');
            else if (turtle.getDirection() == 'S') turtle.setDirection('W');
            else if (turtle.getDirection() == 'W') turtle.setDirection('N');
        } else if (command == 'F'){ // MOVE FORWARD
            if (turtle.getDirection() == 'N') turtle.setRow(turtle.getRow()-1);
            if (turtle.getDirection() == 'S') turtle.setRow(turtle.getRow()+1);
            if (turtle.getDirection() == 'W') turtle.setColumn(turtle.getColumn()-1);
            if (turtle.getDirection() == 'E') turtle.setColumn(turtle.getColumn()+1);
        }
    }
}
