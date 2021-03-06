(defproject testrideallthebikes "0.1.0-SNAPSHOT"
  :description "A service for matching prospective bike buyers with shops that offer demo bikes"
  :url "http://testrideallthebik.ies"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler testrideallthebikes.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
