package com.cloudbees.demo

class Counter implements Serializable {
    def steps
    static count = 0

    static void increment() {
        count++;
    }

    // dummy constructor for tests
    Counter(Map m = [:]) {
        this.steps = m.steps
    }
}
