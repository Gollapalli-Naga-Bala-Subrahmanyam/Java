package com.epam.rd.autotasks.sprintplanning.tickets;

public class UserStory extends Ticket {
    private final UserStory[] dependsOn;

    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn.clone();

    }

    @Override
    public void complete() {
        boolean allCompleted = true;
        for (UserStory us: dependsOn) {
            if (!us.isCompleted()) {
                allCompleted = false;
                break;
            }
        }
        if (allCompleted) {
            this.isCompleted = true;
        }
    }

    public UserStory[] getDependencies() {
        //return this.dependsOn;
        return this.dependsOn.clone();
    }

    @Override
    public String toString() {
        return "[US " + id + "] " + name;
    }
}