(ns clojureslop.helpfulhints-test
  (:require [midje.sweet :refer :all]
            [clojureslop.helpfulhints :refer :all]
            [midje.experimental :refer [for-all]]))


(facts "d Test"
       (fact "test"
             (d 3 4) => 19
             (:a z) => 3
             ; Not working... why?
             ; (f0 odd? 1 2 3 4) => (1 2)
             ; Ref:
             ; https://github.com/marick/Midje/wiki/Prerequisites-and-protocols
             ))


