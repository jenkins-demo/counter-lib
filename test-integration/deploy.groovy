pipeline {
    agent any
    stages { 
        stage("test") {
            steps { 
                script {
                    def lib = library("test-lib").com.cloudbees.demo
                    lib.Counter.new(steps)
                } 
            } 
        } 
    } 
}
