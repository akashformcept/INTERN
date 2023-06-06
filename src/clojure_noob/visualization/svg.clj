
(ns clojure-noob.visualization.svg
(:require [clojure.string :as s])
(:refer-clojure :exclude [min max]))
(defn comparator-over-maps
[comparison-fn ks]
(fn [maps]

(zipmap ks

(map (fn [k] (apply comparison-fn (map k maps)))
ks))))
(def min (comparator-over-maps #'clojure-noob.visualization.svg/min [:lat :lng]))
(def max (comparator-over-maps #'clojure-noob.visualization.svg/max [:lat :lng]))