(ns elegy.core
  (:gen-class))

;; The type returned by this is "clojure.lang.Repeat"?
(defn string-repeat [chosen-string reps]
  (repeat reps chosen-string))

;; Print a collection
(defn print-coll
  [coll]
  (for [x chosen]
    (print x))
  )

(def loogout "Listen up World, here it comes. Loogout ya bish. \n")

(print-that-ish (elegy-chosen-string loogout 10))


(for [x (concat ["Whales"] ["\n"])]
              (print x))

(defn -main
  "I don't do a whole lot ... yet."
  [reps]
  (for [x ]
    (print x)))
