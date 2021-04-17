package trafficlight;

import trafficlight.states.State;

public interface Observer {
    void update(State state);
}
