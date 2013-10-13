(ns testrideallthebikes.views.index
  (:use [hiccup.core :only (html)] [hiccup.page :only (html5 include-js include-css )])) 

(defn render[] 
  (html5 
    [:head 
     [:meta {:charset "utf-8"}]
     [:title "testrideallthebik.es"]
     [:meta {:content "width=device-width, initial-scale=1.0" :name "viewport"}]
     [:meta {:name "apple-mobile-web-app-capable" :content "yes"}]
     [:meta {:name "description" 
             :content "A service for matching prospective bike buyers with shops that offer demo bikes"}]
     [:meta {:name "author" :content "Paul Williams with his imaginary neckbeard" }]

     [:link {:rel="apple-touch-icon-precomposed" :sizes="144x144" :href="assets/ico/apple-touch-icon-144-precomposed.png"}]
     [:link {:rel="apple-touch-icon-precomposed" :sizes="114x114" :href="assets/ico/apple-touch-icon-114-precomposed.png"}]
     [:link {:rel="apple-touch-icon-precomposed" :sizes="72x72" :href="assets/ico/apple-touch-icon-72-precomposed.png"}]
     [:link {:rel="apple-touch-icon-precomposed" :href="assets/ico/apple-touch-icon-57-precomposed.png"}]
     [:link {:rel="shortcut icon" :href="assets/ico/favicon.png"}]

     (include-css "/css/normalize.css")
     (include-css "/css/styles.css")
     (include-js  "/js/hideaddrbar.js")]
    [:body
     [:header
      [:h1 "A service for matching prospective bike buyers with shops that offer demo bikes" 
       ]]
     [:div {:role "main"}
      [:form {:action "/see-more"}
       [:input {:type "submit" :value "Tell me more" }]]]]))

