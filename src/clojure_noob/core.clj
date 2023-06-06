(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (macroexpand '(when (the-cows-come :home)
(call me :pappy)
(slap me :silly)))))
