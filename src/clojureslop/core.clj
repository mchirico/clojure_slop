(ns clojureslop.core)



(defn quad [a b c]
  (let [disc (-
               (* b b)
               (* 4 a c))]
    [(/
       (+ (- b) (Math/sqrt disc))
       (* 2 a))
     (/
       (- (- b) (Math/sqrt disc))
       (* 2 a))]))


(defn myFun [a b c]
  (+ (+ a b c) 3)
  )

(defn myFunc2 [a b]
  (+ 3 4)
  )

