(defproject sigmund "0.1.1"
  :description "System analytics for Clojure"
  :url "https://github.com/zcaudate/sigmund"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.fusesource/sigar "1.6.4"]
                 [sigar/sigar-native-deps "1.6.4"]]

  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
