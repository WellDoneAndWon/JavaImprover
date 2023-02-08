package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("Team " + " have new player, his/her name is " + participant.getName());
    }
    public void playWith(Team team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("Winner is: " + winnerName);
    }
}
