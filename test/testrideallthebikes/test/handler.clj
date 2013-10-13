(ns testrideallthebikes.test.handler
  (:use clojure.test
        ring.mock.request  
        testrideallthebikes.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      ))
  
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))
