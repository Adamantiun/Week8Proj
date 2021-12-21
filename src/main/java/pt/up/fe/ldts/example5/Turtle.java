package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private char direction;

    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getDirection() {
        return direction;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean setDirection(char direction) {
        if(direction == 'N' || direction == 'W' || direction == 'S' || direction == 'E') {
            this.direction = direction;
            return true;
        }
        return false;
    }

    public void execute(char command) {
        Command executable = new Command(command);
        executable.execute(this);
    }
}
