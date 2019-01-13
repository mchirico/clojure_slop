(ns clojureslop.helpfulhints-test
  (:require [midje.sweet :refer :all]
            [clojureslop.helpfulhints :refer :all])
  )


(facts "d Test"
       (fact "test"
             (d 3 4) => 19
             (:a z) => 3)
       )