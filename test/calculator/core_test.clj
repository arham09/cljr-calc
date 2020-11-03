(ns calculator.core-test
  (:require [clojure.test :refer :all]
            [calculator.calculator :as calculator]
            [calculator.core :refer :all]))

(deftest sum-test
  (testing "Sum Function of calculator"
    (is (= 6 (calculator/sum 3 3)))))

