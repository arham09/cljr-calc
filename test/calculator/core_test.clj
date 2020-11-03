(ns calculator.core-test
  (:require [clojure.test :refer :all]
            [calculator.calculator :as calculator]
            [calculator.core :refer :all]))

(deftest sum-test
  (testing "Sum Function of calculator"
    (is (= 6 (calculator/sum 3 3)))))

(deftest subtract-test
  (testing "Subtract function of calculator"
    (is (= 2 (calculator/subtract 10 8)))))

(deftest multiplication-test
  (testing "Multiplication function of calculator"
    (is (= 10 (calculator/multiply 5 2)))))

(deftest division-test
  (testing "Division function of calculator"
    (is (= (double 5) (calculator/divide 10 2)))))

