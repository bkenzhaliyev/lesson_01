package сom.gb.lesson_03.task_01;

import java.util.Objects;

public class ActionPingPong {
    private String action;

    public ActionPingPong(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void actionSetPing() {
        action = "ping";
    }

    public void actionSetPong() {
        action = "pong";
    }

    public void printAction() {
        if (action.equals("ping")) {
            System.out.printf(action + " - ");
        }else{
            System.out.printf(action + "\n");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionPingPong that = (ActionPingPong) o;
        return action.equals(that.action);
    }
}
