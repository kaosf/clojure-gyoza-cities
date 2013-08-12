(ns gyoza.core
  (:require
    [clojure.java.io :as io]
    [tnoda.xls :as xls]))

(def url "http://www.e-stat.go.jp/SG1/estat/GL02020101.do?method=xlsDownload&fileId=000006351598&releaseCount=1")

(defn gyoza-cities
  []
  (->>
    (-> url io/input-stream (xls/read-sheet "2"))
    (apply map list)
    (filter #(some #{"Saitama-shi" "Jiao-zi"} %))
    (apply map list)
    (filter (comp number? second))
    (sort-by (comp - second))
    (take 5)))
