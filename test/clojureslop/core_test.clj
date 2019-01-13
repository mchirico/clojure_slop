(ns clojureslop.core-test
  (:require [midje.sweet :refer :all]
            [clojureslop.core :refer :all]))


(println "You should expect something...")

(facts "about quad"
       (fact "simple"
             (quad 1 0 -1) => [1.0 -1.0])
       )






(facts "myFunc Test"
       (fact "test"
             (myFun 0 0 0) => (+ 0 3) )
       )

(facts "myFunc2 Test"
       (fact "test"
             (myFunc2 0 1) => (+ 0 7) )
       )

