(defproject replr "0.1.5"
  :description "read your code base"
  :url "https://github.com/wandersoncferreira/replr"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cljfx "1.7.10"]
                 [org.clojure/tools.namespace "1.0.0"]
                 [rhizome "0.2.9"]
                 [nrepl "0.8.2"]
                 [cider/orchard "0.6.0"]]
  :repl-options {:init-ns replr.ui
                 :nrepl-middleware [replr.middleware.nrepl/wrap-replr]})
