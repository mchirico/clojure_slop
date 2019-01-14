(ns clojureslop.slop-test
  (:require [midje.sweet :refer :all]
            [clojureslop.slop :refer :all])
  ;(use 'clojure.data)
  (:require [clojure.data :refer :all])

  ; (require '[clojure.string :as st])
  (:require [clojure.string :as st]))

(println "Slop-test...")

(facts "d Test"
       (fact "test"
             (d 3 4) => 19
             (:a z) => 3))

(facts "thread Test"
       (fact "test"
             (->> [1 2 3] (filter odd?) count) => 2)
       ; Above and below are the same...
       (->> [1 2 3] (filter odd?) count) => (count (filter odd? [1 2 3])))

(facts "difference"
       (fact "test"
             (diff #{1 2} #{2 3}) => [#{1} #{3} #{2}]
             (diff [1 2] [3 2 5]) => [[1] [3 nil 5] [nil 2]]
        ; (true true) is a function, so need quote.
             (filter identity (map nil? [1 nil 3 nil])) => '(true true)
        ; Count nils
             (count  (filter identity (map nil? [1 nil 3 nil]))) => 2
        ; Index of nil
             (.indexOf (map nil? [0 nil 3 2]) true) => 1

        ; Careful .. Don't forget the arrow...
        ; otherwise, will always be true
             (.indexOf (map nil? [0 nil 3 2]) true) = 7

             (filter #(nil? (second %))
                     (map-indexed vector [1 nil 3 nil])) => '([1 nil] [3 nil])))

(facts "difference"
       (fact "test"
             (empty? [nil]) => false
             (empty? nil) => true
             (drop-while empty? ["" [] "foobar" nil]) => '("foobar" nil)
             (drop-while empty? ["" [] nil "foobar"]) => '("foobar")))

(facts "strings"
       (fact "test"

             (-> "  detacilPmoc TaHt t'nsI   SihT  "
                 st/reverse
                 st/trim
                 st/lower-case
                 (st/replace #"\s+" " ")
                 st/capitalize) => "This isn't that complicated"

             (vec (sort (set [1 2 2 3]))) => [1 2 3]

             (distinct [1 2 2 3]) =>  [1 2 3]))