(ns clojureslop.slop-test
  (:require [midje.sweet :refer :all]
            [clojureslop.slop :refer :all])
  )

(println "Slop-test...")

(facts "d Test"
       (fact "test"
             (d 3 4) => 19
             (:a z) => 3)
       )

