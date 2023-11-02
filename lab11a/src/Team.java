public class Team {
    private int nextOpenPos;
    private Player[] members;
    public Team(Player[] players){
        this.members = players;
    }

    // array of teams players no more than 3 players!
    // next open position
    // add player method
    // method to return a player array
    // average height method
            // handle instance when no players are on team

    public void setNextOpenPos(Team[] team){
        int c = 0;
        for(int i = 0; i < team.length; i++ ){
            if(team[i] != null){
                c++;
            }
        }
        nextOpenPos = 3 - c;
    }
    public int getNextOpenPos(){
        return nextOpenPos;
    }

    public Player[] getMembers(){
        return members;
    }

    public void addPlayer(Player player){
        if(nextOpenPos > 0){
            members[3 - nextOpenPos] = player;
            nextOpenPos--;
        } else if (nextOpenPos <= 0) {
            System.out.println("Error adding player: Team is full");
        } else {
            System.out.println("Error adding player");
        }

    }

}
