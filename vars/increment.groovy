#!/usr/bin/groovy

import com.cloudbees.demo.Counter

def call() {
    Counter.increment()
    println Counter.getCount()
}