(ns clojureslop.quad-test
  (:require [midje.sweet :refer :all]
            [clojureslop.quad :refer :all]))

(facts "myFunc2 Test"
       (fact "test"
             (myFunc2 2 3)
             (:c z) => 5))
