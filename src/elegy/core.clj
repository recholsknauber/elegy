(ns elegy.core
  (:gen-class))

(defn elegy-chosen-string
  [chosen-string reps]
  (repeat reps chosen-string))

(defn print-that-ish
  [chosen]
  (for [x chosen]
    (print x))
  )

(def loogout "Listen up World, here it comes. Loogout ya bish. \n")

(print-that-ish (elegy-chosen-string loogout 10))

(defn -main
  "I don't do a whole lot ... yet."
  [reps]
  (for [x ]
    (print x)))
