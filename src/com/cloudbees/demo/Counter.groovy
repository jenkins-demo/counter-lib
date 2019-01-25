package com.cloudbees.demo

class Counter {
    def steps
    static count = 0

    static void increment() {
        count++;
    }
    
    // dummy constructor for tests
    Counter(def steps) {
        this.steps = steps
    }
}
