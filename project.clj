(defproject throttler "1.0.0"
  :description "Control the throughput of function calls and core.async channels using the token bucket algorithm"
  :url "https://github.com/brunoV/throttler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]]
  :profiles {:dev {:dependencies [[midje "1.9.1"]
                                  [criterium "0.4.3"]]
                   :plugins [[lein-midje "3.2.1"]]}})
