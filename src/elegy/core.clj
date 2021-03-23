(ns elegy.core
  (:gen-class))

;; The type returned by this is "clojure.lang.Repeat"?
(defn string-repeat
  "Repeats a given string a specified number of times."
  [chosen-string reps]
  (repeat reps chosen-string))

;; Print a collection, each item on a new line.
(defn print-coll
  "Prints a given collection item-by-item on new lines."
  [coll]
  (for [x coll]
    (print x "\n"))
  )

;; A really cool string.
(def loogout "Listen up World, here it comes. Loogout ya bish.")

;; Print the really cool string many times.
(print-coll (string-repeat loogout 10))

;; A test of a for loop on concatenated string vectors.
(for [x (concat ["Whales."] ["\n"])]
              (print x))

;; Handle an infinite number of arguments, in this case multiplying them all.
(defn do-this-to-everything
  "Do `this` (a func), to `everything` (any number of args)."
  [this & everything]
  (if (nil? everything)
    nil
    (loop [x (rest everything)
           y (first everything)
           a this]
      (if (empty? x)
        y
        (recur (rest x) (this y (first x)) this))
      )
    ))

(do-this-to-everything * 10 2 3 4 10 10)



;; (defn look
;;   ""
;;   [x]
;;   (do-this-to-everything + x))

;; (defn -main
;;   "I don't do a whole lot ... yet."
;;   [reps]
;;   (for [x ]
;;     (print x)))
