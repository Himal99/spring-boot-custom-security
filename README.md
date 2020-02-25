
<!DOCTYPE html>
<html lang="en">

    <head itemscope="" itemtype="http://schema.org/WebSite">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link rel="profile" href="https://gmpg.org/xfn/11">
        <title>HimalRaee.com</title>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <link rel="stylesheet" href="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/min/7/1411ba187bb5524b04128078df57bfa3.css" as="style" onload="this.onload = null;this.rel = 'stylesheet'" data-minify="1">
        <link rel="dns-prefetch" href="//fonts.googleapis.com">
        <link rel="alternate" type="application/rss+xml" title="Coach » Feed" href="https://demo.blossomthemes.com/blossom-coach/feed/">
        <link rel="alternate" type="application/rss+xml" title="Coach » Comments Feed" href="https://demo.blossomthemes.com/blossom-coach/comments/feed/">
        <!-- jQuery 2.2.3 -->
<script src="/webjars/adminlte/2.3.11/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
        <link rel="preload" id="woocommerce-smallscreen-css" href="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/css/woocommerce-smallscreen-3.9.2.css" as="style" onload="this.onload = null;this.rel = 'stylesheet'"
              type="text/css" media="only screen and (max-width: 768px)">
       
        <link rel="stylesheet" id="blossom-coach-google-fonts-css" href="https://fonts.googleapis.com/css?family=Nunito+Sans%3A200%2C200italic%2C300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CNunito%3A200%2C200italic%2C300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CNunito%3A700"
              as="style" onload="this.onload = null;this.rel = 'stylesheet'" type="text/css" media="all">
       
        
    </head>

    <body>

    <body data-rsssl="1" class="home page-template-default page page-id-6 wp-custom-logo theme-blossom-coach woocommerce-js style1 rightsidebar" itemscope="" itemtype="http://schema.org/WebPage">
        <div id="page" class="site"><a aria-label="skip to content" class="skip-link" href="#content">Skip to Content</a>
            <div class="sticky-t-bar active">
                <div class="sticky-bar-content">
                    <div class="wrapper">
                        <div class="blossomthemes-email-newsletter-wrapper" id="boxes-21" style="background: #88ced0; color: ">
                            <div class="text-holder">
                                <h3>Hello Namaste Keep in touch for new updates</h3>
                            </div>
                            <form id="blossomthemes-email-newsletter-21" class="blossomthemes-email-newsletter-window-21"> <input type="text" name="subscribe-fname" required="required" class="subscribe-fname-21" value="" placeholder="Your First Name"> <input type="text" name="subscribe-email" required="required" class="subscribe-email-21" value=""
                                                                                                                                                                                                        placeholder="Your Email">
                                <div id="loader-21" style="display: none">
                                    <div class="table">
                                        <div class="table-row">
                                            <div class="table-cell"> <img src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%200%200'%3E%3C/svg%3E" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"><noscript><img src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"></noscript></div>
                                        </div>
                                    </div>
                                </div> <input type="submit" name="subscribe-submit" class="subscribe-submit-21" value="Submit"></form>
                            <div class="bten-response" id="bten-response-21"><span></span></div>
                            <div id="mask-21"></div>
                        </div>
                        
                        <script>
                            jQuery(document).ready(function () {
                                jQuery(document).on("submit", "form#blossomthemes-email-newsletter-21", function (e) {
                                    e.preventDefault();
                                    jQuery(".subscribe-submit-21").attr("disabled", "disabled");
                                    var email = jQuery(".subscribe-email-21").val();
                                    var fname = jQuery(".subscribe-fname-21").val();
                                    var confirmation = jQuery(".subscribe-confirmation-21").val();
                                    var sid = 21;
                                    jQuery.ajax({
                                        type: "post",
                                        dataType: "json",
                                        url: bten_ajax_data.ajaxurl,
                                        data: {
                                            action: "subscription_response",
                                            email: email,
                                            fname: fname,
                                            sid: sid,
                                            confirmation: confirmation
                                        },
                                        beforeSend: function () {
                                            jQuery("#loader-21").fadeIn(500)
                                        },
                                        success: function (response) {
                                            jQuery(".subscribe-submit-21").attr("disabled", "disabled");
                                            if (response.type === "success") {
                                                jQuery("#bten-response-21 span").html(response.message);
                                                jQuery("#bten-response-21").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                    jQuery(".subscribe-submit-21").removeAttr("disabled", "disabled");
                                                    jQuery("form#blossomthemes-email-newsletter-21").find("input[type=text]").val("");
                                                    jQuery("form#blossomthemes-email-newsletter-21").find("input[type=checkbox]").prop("checked", !1)
                                                })
                                            } else {
                                                jQuery("#bten-response-21 span").html(response.message);
                                                jQuery("#bten-response-21").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                    jQuery(".subscribe-submit-21").removeAttr("disabled", "disabled");
                                                    jQuery("form#blossomthemes-email-newsletter-21").find("input[type=text]").val("");
                                                    jQuery("form#blossomthemes-email-newsletter-21").find("input[type=checkbox]").prop("checked", !1)
                                                })
                                            }
                                        },
                                        complete: function () {
                                            jQuery("#loader-21").fadeOut(500)
                                        }
                                    })
                                })
                            });
                            
                        </script>
                    </div>
                </div> <button aria-label="sticky bar close" class="close"></button></div>
            <header id="masthead" class="site-header" itemscope="" itemtype="http://schema.org/WPHeader" style="padding-top: 50px;">
                <div class="header-t">
                    <div class="wrapper">
                        <div class="top-left"><span><svg class="svg-inline--fa fa-phone fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="phone" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M493.4 24.6l-104-24c-11.3-2.6-22.9 3.3-27.5 13.9l-48 112c-4.2 9.8-1.4 21.3 6.9 28l60.6 49.6c-36 76.7-98.9 140.5-177.2 177.2l-49.6-60.6c-6.8-8.3-18.2-11.1-28-6.9l-112 48C3.9 366.5-2 378.1.6 389.4l24 104C27.1 504.2 36.7 512 48 512c256.1 0 464-207.5 464-464 0-11.2-7.7-20.9-18.6-23.4z"></path></svg><!-- <i class="fa fa-phone"></i> --><a href="tel:1234567890"><span class="phone">9816394533</span>
                            </span><span><svg class="svg-inline--fa fa-envelope fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="envelope" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M502.3 190.8c3.9-3.1 9.7-.2 9.7 4.7V400c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V195.6c0-5 5.7-7.8 9.7-4.7 22.4 17.4 52.1 39.5 154.1 113.6 21.1 15.4 56.7 47.8 92.2 47.6 35.7.3 72-32.8 92.3-47.6 102-74.1 131.6-96.3 154-113.7zM256 320c23.2.4 56.6-29.2 73.4-41.4 132.7-96.3 142.8-104.7 173.4-128.7 5.8-4.5 9.2-11.5 9.2-18.9v-19c0-26.5-21.5-48-48-48H48C21.5 64 0 85.5 0 112v19c0 7.4 3.4 14.3 9.2 18.9 30.6 23.9 40.7 32.4 173.4 128.7 16.8 12.2 50.2 41.8 73.4 41.4z"></path></svg><!-- <i class="fa fa-envelope"></i> --><a href="mailto:mail@domain.com"><span class="email">Bantwaheem35@gmail.com</span>
                            </span>
                        </div>
                        <div class="top-right">
                            <div class="header-social">
                                <ul class="social-icons">
                                    <li><a href="https://facebook.com/HeemalRaee1999/" target="_blank" rel="nofollow"><svg class="svg-inline--fa fa-facebook-f fa-w-9" aria-hidden="true" data-prefix="fab" data-icon="facebook-f" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 264 512" data-fa-i2svg=""><path fill="currentColor" d="M76.7 512V283H0v-91h76.7v-71.7C76.7 42.4 124.3 0 193.8 0c33.3 0 61.9 2.5 70.2 3.6V85h-48.2c-37.8 0-45.1 18-45.1 44.3V192H256l-11.7 91h-73.6v229"></path></svg><!-- <i class="fa fa-facebook"></i> --></a></li>
                                    <li><a href="https://twitter.com/blossomthemesHQ" target="_blank" rel="nofollow"><svg class="svg-inline--fa fa-twitter fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="twitter" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M459.37 151.716c.325 4.548.325 9.097.325 13.645 0 138.72-105.583 298.558-298.558 298.558-59.452 0-114.68-17.219-161.137-47.106 8.447.974 16.568 1.299 25.34 1.299 49.055 0 94.213-16.568 130.274-44.832-46.132-.975-84.792-31.188-98.112-72.772 6.498.974 12.995 1.624 19.818 1.624 9.421 0 18.843-1.3 27.614-3.573-48.081-9.747-84.143-51.98-84.143-102.985v-1.299c13.969 7.797 30.214 12.67 47.431 13.319-28.264-18.843-46.781-51.005-46.781-87.391 0-19.492 5.197-37.36 14.294-52.954 51.655 63.675 129.3 105.258 216.365 109.807-1.624-7.797-2.599-15.918-2.599-24.04 0-57.828 46.782-104.934 104.934-104.934 30.213 0 57.502 12.67 76.67 33.137 23.715-4.548 46.456-13.32 66.599-25.34-7.798 24.366-24.366 44.833-46.132 57.827 21.117-2.273 41.584-8.122 60.426-16.243-14.292 20.791-32.161 39.308-52.628 54.253z"></path></svg><!-- <i class="fa fa-twitter"></i> --></a></li>
                                    <li><a href="https://www.youtube.com/" target="_blank" rel="nofollow"><svg class="svg-inline--fa fa-youtube-square fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="youtube-square" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M186.8 202.1l95.2 54.1-95.2 54.1V202.1zM448 80v352c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V80c0-26.5 21.5-48 48-48h352c26.5 0 48 21.5 48 48zm-42 176.3s0-59.6-7.6-88.2c-4.2-15.8-16.5-28.2-32.2-32.4C337.9 128 224 128 224 128s-113.9 0-142.2 7.7c-15.7 4.2-28 16.6-32.2 32.4-7.6 28.5-7.6 88.2-7.6 88.2s0 59.6 7.6 88.2c4.2 15.8 16.5 27.7 32.2 31.9C110.1 384 224 384 224 384s113.9 0 142.2-7.7c15.7-4.2 28-16.1 32.2-31.9 7.6-28.5 7.6-88.1 7.6-88.1z"></path></svg><!-- <i class="fa fa-youtube-square"></i> --></a></li>
                                    <li><a href="https://www.instagram.com/_blossomthemes" target="_blank" rel="nofollow"><svg class="svg-inline--fa fa-instagram fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="instagram" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.7 102.7-9 132.1z"></path></svg><!-- <i class="fa fa-instagram"></i> --></a></li>
                                    <li><a href="https://plus.google.com/" target="_blank" rel="nofollow"><svg class="svg-inline--fa fa-google-plus-square fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="google-plus-square" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M400 32H48C21.5 32 0 53.5 0 80v352c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48V80c0-26.5-21.5-48-48-48zM164 356c-55.3 0-100-44.7-100-100s44.7-100 100-100c27 0 49.5 9.8 67 26.2l-27.1 26.1c-7.4-7.1-20.3-15.4-39.8-15.4-34.1 0-61.9 28.2-61.9 63.2 0 34.9 27.8 63.2 61.9 63.2 39.6 0 54.4-28.5 56.8-43.1H164v-34.4h94.4c1 5 1.6 10.1 1.6 16.6 0 57.1-38.3 97.6-96 97.6zm220-81.8h-29v29h-29.2v-29h-29V245h29v-29H355v29h29v29.2z"></path></svg><!-- <i class="fa fa-google-plus-square"></i> --></a></li>
                                </ul>
                            </div>
                            <div class="header-search"><button aria-label="search form toggle"><svg class="svg-inline--fa fa-search fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path></svg><!-- <i class="fa fa-search"></i> --></button>
                                <div class="header-search-form"><button aria-label="search form close" class="close"></button>
                                    <form role="search" method="get" class="search-form" action="https://demo.blossomthemes.com/blossom-coach/"> <label class="screen-reader-text">Looking for Something?</label> <input type="search" class="search-field" placeholder="Enter Keywords…" value="" name="s"> <label for="submit-field"> <span><svg class="svg-inline--fa fa-search fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path></svg><!-- <i class="fa fa-search"></i> --></span> <input type="submit" id="submit-field" class="search-submit" value="Search"> </label></form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="main-header">
                    <div class="wrapper">
                        <div class="site-branding icon-text" itemscope="" itemtype="http://schema.org/Organization">
                            <div class="site-logo">
                                <a href="/projects/portfolio" class="custom-logo-link" rel="home"><img width="68" height="60" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/site-logo_c68d2e8b12b4eb7d172a5d1bf6d7975b.png" class="custom-logo lazyloaded" alt="Coach" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/site-logo_c68d2e8b12b4eb7d172a5d1bf6d7975b.png"
                                                                                                                                 data-was-processed="true"><noscript><img width="68" height="60" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/site-logo_c68d2e8b12b4eb7d172a5d1bf6d7975b.png" class="custom-logo" alt="Coach" /></noscript></a>
                            </div>
                            <div class="site-title-wrap">
                                <h1 class="site-title" itemprop="name"><a href="/projects/portfolio" rel="home" itemprop="url">HimalRaee</a></h1>
                                <p class="site-description">Software Developer</p>
                            </div>
                        </div>
                        <div class="menu-wrap">
                            <nav id="site-navigation" class="main-navigation" itemscope="" itemtype="http://schema.org/SiteNavigationElement"> <button type="button" class="toggle-button"> <span class="toggle-bar"></span> <span class="toggle-bar"></span> <span class="toggle-bar"></span> </button>
                                <div class="menu-primary-container">
                                    <ul id="primary-menu" class="menu">
                                        <li id="menu-item-123" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-6 current_page_item menu-item-123"><a href="https://demo.blossomthemes.com/blossom-coach/" aria-current="page">Home</a></li>
                                        <li id="menu-item-152" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-152 about-me"><a href="javascript:void(0)">About Me</a></li>
                                        <li id="menu-item-186" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-186"><a href="javascript:void(0)">Portfolio</a></li>
                                        <li id="menu-item-125" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-125"><a href="javascript:void(0)">Blog</a></li><!--
                                        <li id="menu-item-151" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-151"><a href="javascript:void(0)">Style Guide</a></li>
                                        <li id="menu-item-164" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-164"><a href="javascript:void(0)">Pages</a>
                                            <ul class="sub-menu">
                                                <li id="menu-item-165" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-165"><a href="javascript:void(0)">Full Width</a></li>
                                                <li id="menu-item-166" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-166"><a href="javascript:void(0)">Category Page</a></li>
                                                <li id="menu-item-167" class="menu-item menu-item-type-post_type menu-item-object-post menu-item-167"><a href="javascript:void(0)">Post Page</a></li>
                                                <li id="menu-item-168" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-168"><a href="javascript:void(0)">Search Page</a></li>
                                                <li id="menu-item-169" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-169"><a href="javascript:void(0)">404 error page</a></li>
                                            </ul><button class="submenu-toggle"><svg class="svg-inline--fa fa-angle-down fa-w-10" aria-hidden="true" data-prefix="fa" data-icon="angle-down" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg=""><path fill="currentColor" d="M143 352.3L7 216.3c-9.4-9.4-9.4-24.6 0-33.9l22.6-22.6c9.4-9.4 24.6-9.4 33.9 0l96.4 96.4 96.4-96.4c9.4-9.4 24.6-9.4 33.9 0l22.6 22.6c9.4 9.4 9.4 24.6 0 33.9l-136 136c-9.2 9.4-24.4 9.4-33.8 0z"></path></svg> <i class="fa fa-angle-down"></i> </button></li>
                                        <li id="menu-item-196" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-196"><a href="javascript:void(0)">Shop</a>-->
                                            <ul class="sub-menu">
<!--                                                <li id="menu-item-286" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-286"><a href="javascript:void(0)">Products Listing Page</a></li>
                                                <li id="menu-item-285" class="menu-item menu-item-type-post_type menu-item-object-product menu-item-285"><a href="javascript:void(0)">Product page</a></li>
                                                <li id="menu-item-194" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-194"><a href="javascript:void(0)">Checkout</a></li>-->
                                                <li id="menu-item-195" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-195"><a href="javascript:void(0)">Cart</a></li>
                                            <!--</ul><button class="submenu-toggle"><svg class="svg-inline--fa fa-angle-down fa-w-10" aria-hidden="true" data-prefix="fa" data-icon="angle-down" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512" data-fa-i2svg=""><path fill="currentColor" d="M143 352.3L7 216.3c-9.4-9.4-9.4-24.6 0-33.9l22.6-22.6c9.4-9.4 24.6-9.4 33.9 0l96.4 96.4 96.4-96.4c9.4-9.4 24.6-9.4 33.9 0l22.6 22.6c9.4 9.4 9.4 24.6 0 33.9l-136 136c-9.2 9.4-24.4 9.4-33.8 0z"></path></svg> <i class="fa fa-angle-down"></i> </button></li>-->
                                    </ul>
                                </div>
                            </nav>
                            <span class="fa fa-envelope"></span>
                        </div>
                    </div>
                </div>
            </header>
            <div id="banner_section" class="site-banner">
                <div id="wp-custom-header" class="wp-custom-header"><img src="/img/cover2.jpg" width="1920" height="500" alt="Coach" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/themes/blossom-coach/images/banner-img.jpg"
                                                                         class="lazyloaded" data-was-processed="true"><noscript><img src="https://demo.blossomthemes.com/blossom-coach/wp-content/themes/blossom-coach/images/banner-img.jpg" width="1920" height="700" alt="Coach" /></noscript></div>
                <div class="banner-caption">
                    <div class="wrapper">
                        <div class="blossomthemes-email-newsletter-wrapper"  style="background-color:red">
                            <div class="text-holder">
                                <h3>No matter how good you are at anything a Coach makes you better</h3>
                            </div>
                            <form id="blossomthemes-email-newsletter-17" class="blossomthemes-email-newsletter-window-17"> <input type="text" name="subscribe-fname" required="required" class="subscribe-fname-17" value="" placeholder="Your Name"> <input type="text" name="subscribe-email" required="required" class="subscribe-email-17" value="" placeholder="Your Email">
                                <div id="loader-17" style="display: none">
                                    <div class="table">
                                        <div class="table-row">
                                            <div class="table-cell"> <img src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%200%200'%3E%3C/svg%3E" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"><noscript><img src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"></noscript></div>
                                        </div>
                                    </div>
                                </div> <input type="submit" name="subscribe-submit" class="subscribe-submit-17" value="Subscribe Now"></form>
                            <div class="bten-response" id="bten-response-17"><span></span></div>
                            <div id="mask-17"></div>
                        </div>
                       
                        <script>
                            jQuery(document).ready(function () {
                               
                                jQuery(document).on("submit", "form#blossomthemes-email-newsletter-17", function (e) {
                                    e.preventDefault();
                                    jQuery(".subscribe-submit-17").attr("disabled", "disabled");
                                    var email = jQuery(".subscribe-email-17").val();
                                    var fname = jQuery(".subscribe-fname-17").val();
                                    var confirmation = jQuery(".subscribe-confirmation-17").val();
                                    var sid = 17;
                                    jQuery.ajax({
                                        type: "post",
                                        dataType: "json",
                                        url: bten_ajax_data.ajaxurl,
                                        data: {
                                            action: "subscription_response",
                                            email: email,
                                            fname: fname,
                                            sid: sid,
                                            confirmation: confirmation
                                        },
                                        beforeSend: function () {
                                            jQuery("#loader-17").fadeIn(500)
                                        },
                                        success: function (response) {
                                            jQuery(".subscribe-submit-17").attr("disabled", "disabled");
                                            if (response.type === "success") {
                                                jQuery("#bten-response-17 span").html(response.message);
                                                jQuery("#bten-response-17").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                    jQuery(".subscribe-submit-17").removeAttr("disabled", "disabled");
                                                    jQuery("form#blossomthemes-email-newsletter-17").find("input[type=text]").val("");
                                                    jQuery("form#blossomthemes-email-newsletter-17").find("input[type=checkbox]").prop("checked", !1)
                                                })
                                            } else {
                                                jQuery("#bten-response-17 span").html(response.message);
                                                jQuery("#bten-response-17").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                    jQuery(".subscribe-submit-17").removeAttr("disabled", "disabled");
                                                    jQuery("form#blossomthemes-email-newsletter-17").find("input[type=text]").val("");
                                                    jQuery("form#blossomthemes-email-newsletter-17").find("input[type=checkbox]").prop("checked", !1)
                                                })
                                            }
                                        },
                                        complete: function () {
                                            jQuery("#loader-17").fadeOut(500)
                                        }
                                    })
                                })
                            });
                        </script>
                        
                    </div>
                </div>
            </div>
            <section id="client_section" class="client-section">
                <div class="wrapper">
                    <section id="blossom_client_logo_widget-3" class="widget widget_blossom_client_logo_widget">
                        <div class="blossom-iw-holder">
                            <div class="blossom-iw-inner-holder">
                                <!--<h2 class="widget-title" itemprop="name"><span>As Featured On</span></h2>-->
<!--                                <div class="blossom-inner-wrap">
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="145" height="59" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20145%2059'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/akamai-1_71dcc068fb57a64d9eb3e240042a7963.png"><noscript><img width="145" height="59" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/akamai-1_71dcc068fb57a64d9eb3e240042a7963.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="37" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%2037'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/algolia-1_dba48ddb13ebe775defe27c28ece11f2.png"><noscript><img width="146" height="37" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/algolia-1_dba48ddb13ebe775defe27c28ece11f2.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="100" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%20100'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size"
                                                                          alt="As Featured On" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1-88x60.png 88w"
                                                                          data-lazy-sizes="(max-width: 146px) 100vw, 146px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1.png"><noscript><img width="146" height="100" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/arduino-1-88x60.png 88w" sizes="(max-width: 146px) 100vw, 146px" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="58" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%2058'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/aws-1_80e3fec0241b840da11be980bee4e687.png"><noscript><img width="146" height="58" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2019/09/aws-1_80e3fec0241b840da11be980bee4e687.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="147" height="36" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20147%2036'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/basekit-1.png"><noscript><img width="147" height="36" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/basekit-1.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="97" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%2097'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1-90x60.png 90w"
                                                                          data-lazy-sizes="(max-width: 146px) 100vw, 146px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1.png"><noscript><img width="146" height="97" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/cassandra-1-90x60.png 90w" sizes="(max-width: 146px) 100vw, 146px" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="108" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%20108'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size"
                                                                          alt="As Featured On" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1-81x60.png 81w"
                                                                          data-lazy-sizes="(max-width: 146px) 100vw, 146px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1.png"><noscript><img width="146" height="108" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1.png 146w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/awesome-1-81x60.png 81w" sizes="(max-width: 146px) 100vw, 146px" /></noscript></a>
                                    </div>
                                    <div class="image-holder black-white">
                                        <a href="#" target="_blank"> <img width="146" height="50" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20146%2050'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On"
                                                                          data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/certbot-2.png"><noscript><img width="146" height="50" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/certbot-2.png" class="attachment-post-slider-thumb-size size-post-slider-thumb-size" alt="As Featured On" /></noscript></a>
                                    </div>
                                </div>-->
                            </div>
                        </div>
                    </section>
                </div>
            </section>
            <section id="about_section" class="about-section">
                <div class="wrapper">
                    <section id="blossomtheme_featured_page_widget-3" class="widget widget_blossomtheme_featured_page_widget">
                        <div class="widget-featured-holder right">
                            <h2 class="widget-title" itemprop="name"><span>About Me</span></h2>
                            <div class="img-holder">
                                
                                    <img width="1080" height="1255" src="/img/profile.jpg" 
                                         class="attachment-full size-full wp-post-image" alt="#" />
                                       </div>
                            <div class="text-holder">
                                <div class="featured_page_content">
                                    <h6>Owner/Founder</h6>
                                    <p>Yes, I know my stuff! And throughout our coaching time, you will develop the tools and confidence to take action. My way of coaching is to empower you in becoming the Leader you want to be. You are unique and so your
                                        coaching should be too. I don’t follow a template, or ‘one size fits all’. We start where you are &amp; we work towards your goals. If you want a business that generates you income while also positively contributing
                                        to others, then you have arrived at the right place!</p>
                                     <p><img class="alignnone wp-image-298 size-full" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20250%2037'%3E%3C/svg%3E" alt="" width="250" height="37" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/signature-1.png"><noscript><img class="alignnone wp-image-298 size-full" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/signature-1.png" alt="" width="250" height="37" /></noscript></p>
                                    <p>Samantha Walters</p> <a href="https://demo.blossomthemes.com/blossom-coach/about-us/" target="_self" class="btn-readmore">Read More</a></div>
                            </div>
                        </div>
                    </section>
                </div>
            </section>
            <section id="cta_section" class="bg-cta-section">
<!--                <div class="wrapper">
                    <section id="blossomtheme_companion_cta_widget-3" class="widget widget_blossomtheme_companion_cta_widget">
                        <div class="centered bttk-cta-bg" style="background:url(https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/adult-1869430_19201.jpg) no-repeat; background-size: cover; background-position: center">
                            <div class="blossomtheme-cta-container">
                                <h2 class="widget-title" itemprop="name"><span>Do You Want to Improve Your Business?</span></h2>
                                <div class="text-holder">
                                    <p>Close the gap between where you are today – and where you want to be. My way of coaching is to empower you in becoming the Leader you want to be.</p>
                                    <div class="button-wrap"> <a target="_self" href="#" class="btn-cta btn-1">Learn More</a></div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>-->
            </section>
            <section id="testimonial_section" class="testimonial-section">
<!--                <div class="wrapper">
                    <section id="text-3" class="widget widget_text">
                        <h2 class="widget-title" itemprop="name"><span>Trusted By</span></h2>
                        <div class="textwidget"></div>
                    </section>
                    <section id="bttk_testimonial_widget-3" class="widget widget_bttk_testimonial_widget">
                        <div class="bttk-testimonial-holder">
                            <div class="bttk-testimonial-inner-holder">
                                <div class="img-holder"> <img width="150" height="150" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20150%20150'%3E%3C/svg%3E" class="attachment-thumbnail size-thumbnail" alt="Samantha Walters" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-150x150.jpeg 150w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-300x300.jpeg 300w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-100x100.jpeg 100w"
                                                              data-lazy-sizes="(max-width: 150px) 100vw, 150px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-150x150.jpeg"><noscript><img width="150" height="150" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-150x150.jpeg" class="attachment-thumbnail size-thumbnail" alt="Samantha Walters" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-150x150.jpeg 150w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-300x300.jpeg 300w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3246581-100x100.jpeg 100w" sizes="(max-width: 150px) 100vw, 150px" /></noscript></div>
                                <div class="text-holder">
                                    <div class="testimonial-meta"> <span class="name">Samantha Walters</span><span class="designation"> CEO, VegFest London </span></div>
                                    <div class="testimonial-content">
                                        <p>Meeting Samantha has deﬁnitely been a game changer for me. Her perspective on things is so clear and she's so knowledgable that she taught me and showed me a totally new way to view myself and my own capabilities,
                                            and now I'm reaching goals within weeks that I thought would take me years.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_testimonial_widget-4" class="widget widget_bttk_testimonial_widget">
                        <div class="bttk-testimonial-holder">
                            <div class="bttk-testimonial-inner-holder">
                                <div class="img-holder"> <img width="150" height="150" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20150%20150'%3E%3C/svg%3E" class="attachment-thumbnail size-thumbnail" alt="Jonathon Walters" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-150x150.jpeg 150w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-300x300.jpeg 300w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-100x100.jpeg 100w"
                                                              data-lazy-sizes="(max-width: 150px) 100vw, 150px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-150x150.jpeg"><noscript><img width="150" height="150" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-150x150.jpeg" class="attachment-thumbnail size-thumbnail" alt="Jonathon Walters" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-150x150.jpeg 150w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-300x300.jpeg 300w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-4623591-100x100.jpeg 100w" sizes="(max-width: 150px) 100vw, 150px" /></noscript></div>
                                <div class="text-holder">
                                    <div class="testimonial-meta"> <span class="name">Jonathon Walters</span><span class="designation"> CEO, VegFest London </span></div>
                                    <div class="testimonial-content">
                                        <p>Meeting Samantha has deﬁnitely been a game changer for me. Her perspective on things is so clear and she's so knowledgable that she taught me and showed me a totally new way to view myself and my own capabilities,
                                            and now I'm reaching goals within weeks that I thought would take me years.</p>
                                    </div>
                                </div>
                            </div>
                        </div>-->
                    </section>
                </div>
            </section>
<!--            <section id="service_section" class="service-section">
                <div class="wrapper">
                    <section id="text-4" class="widget widget_text">
                        <h2 class="widget-title" itemprop="name"><span>What We Can Do For You?</span></h2>
                        <div class="textwidget"></div>
                    </section>
                    <section id="bttk_icon_text_widget-3" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>Business Coaching</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-briefcase fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="briefcase" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M320 336c0 8.84-7.16 16-16 16h-96c-8.84 0-16-7.16-16-16v-48H0v144c0 25.6 22.4 48 48 48h416c25.6 0 48-22.4 48-48V288H320v48zm144-208h-80V80c0-25.6-22.4-48-48-48H176c-25.6 0-48 22.4-48 48v48H48c-25.6 0-48 22.4-48 48v80h512v-80c0-25.6-22.4-48-48-48zm-144 0H192V96h128v32z"></path></svg>
                                     <span class="fa fa-briefcase"></span> </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_icon_text_widget-4" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>1:1 Consultation</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-handshake fa-w-20" aria-hidden="true" data-prefix="far" data-icon="handshake" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512" data-fa-i2svg=""><path fill="currentColor" d="M519.2 127.9l-47.6-47.6A56.252 56.252 0 0 0 432 64H205.2c-14.8 0-29.1 5.9-39.6 16.3L118 127.9H0v255.7h64c17.6 0 31.8-14.2 31.9-31.7h9.1l84.6 76.4c30.9 25.1 73.8 25.7 105.6 3.8 12.5 10.8 26 15.9 41.1 15.9 18.2 0 35.3-7.4 48.8-24 22.1 8.7 48.2 2.6 64-16.8l26.2-32.3c5.6-6.9 9.1-14.8 10.9-23h57.9c.1 17.5 14.4 31.7 31.9 31.7h64V127.9H519.2zM48 351.6c-8.8 0-16-7.2-16-16s7.2-16 16-16 16 7.2 16 16c0 8.9-7.2 16-16 16zm390-6.9l-26.1 32.2c-2.8 3.4-7.8 4-11.3 1.2l-23.9-19.4-30 36.5c-6 7.3-15 4.8-18 2.4l-36.8-31.5-15.6 19.2c-13.9 17.1-39.2 19.7-55.3 6.6l-97.3-88H96V175.8h41.9l61.7-61.6c2-.8 3.7-1.5 5.7-2.3H262l-38.7 35.5c-29.4 26.9-31.1 72.3-4.4 101.3 14.8 16.2 61.2 41.2 101.5 4.4l8.2-7.5 108.2 87.8c3.4 2.8 3.9 7.9 1.2 11.3zm106-40.8h-69.2c-2.3-2.8-4.9-5.4-7.7-7.7l-102.7-83.4 12.5-11.4c6.5-6 7-16.1 1-22.6L367 167.1c-6-6.5-16.1-6.9-22.6-1l-55.2 50.6c-9.5 8.7-25.7 9.4-34.6 0-9.3-9.9-8.5-25.1 1.2-33.9l65.6-60.1c7.4-6.8 17-10.5 27-10.5l83.7-.2c2.1 0 4.1.8 5.5 2.3l61.7 61.6H544v128zm48 47.7c-8.8 0-16-7.2-16-16s7.2-16 16-16 16 7.2 16 16c0 8.9-7.2 16-16 16z"></path></svg>
                                     <span class="fa fa-handshake-o"></span> </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_icon_text_widget-5" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>Career Analysis</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-graduation-cap fa-w-20" aria-hidden="true" data-prefix="fa" data-icon="graduation-cap" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512" data-fa-i2svg=""><path fill="currentColor" d="M622.34 153.2L343.4 67.5c-15.2-4.67-31.6-4.67-46.79 0L17.66 153.2c-23.54 7.23-23.54 38.36 0 45.59l48.63 14.94c-10.67 13.19-17.23 29.28-17.88 46.9C38.78 266.15 32 276.11 32 288c0 10.78 5.68 19.85 13.86 25.65L20.33 428.53C18.11 438.52 25.71 448 35.94 448h56.11c10.24 0 17.84-9.48 15.62-19.47L82.14 313.65C90.32 307.85 96 298.78 96 288c0-11.57-6.47-21.25-15.66-26.87.76-15.02 8.44-28.3 20.69-36.72L296.6 284.5c9.06 2.78 26.44 6.25 46.79 0l278.95-85.7c23.55-7.24 23.55-38.36 0-45.6zM352.79 315.09c-28.53 8.76-52.84 3.92-65.59 0l-145.02-44.55L128 384c0 35.35 85.96 64 192 64s192-28.65 192-64l-14.18-113.47-145.03 44.56z"></path></svg>
                                     <span class="fa fa-graduation-cap"></span> </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_icon_text_widget-6" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>Balanced Body &amp; Mind</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-balance-scale fa-w-20" aria-hidden="true" data-prefix="fa" data-icon="balance-scale" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512" data-fa-i2svg=""><path fill="currentColor" d="M256 336h-.02c0-16.18 1.34-8.73-85.05-181.51-17.65-35.29-68.19-35.36-85.87 0C-2.06 328.75.02 320.33.02 336H0c0 44.18 57.31 80 128 80s128-35.82 128-80zM128 176l72 144H56l72-144zm511.98 160c0-16.18 1.34-8.73-85.05-181.51-17.65-35.29-68.19-35.36-85.87 0-87.12 174.26-85.04 165.84-85.04 181.51H384c0 44.18 57.31 80 128 80s128-35.82 128-80h-.02zM440 320l72-144 72 144H440zm88 128H352V153.25c23.51-10.29 41.16-31.48 46.39-57.25H528c8.84 0 16-7.16 16-16V48c0-8.84-7.16-16-16-16H383.64C369.04 12.68 346.09 0 320 0s-49.04 12.68-63.64 32H112c-8.84 0-16 7.16-16 16v32c0 8.84 7.16 16 16 16h129.61c5.23 25.76 22.87 46.96 46.39 57.25V448H112c-8.84 0-16 7.16-16 16v32c0 8.84 7.16 16 16 16h416c8.84 0 16-7.16 16-16v-32c0-8.84-7.16-16-16-16z"></path></svg>
                                     <span class="fa fa-balance-scale"></span> </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_icon_text_widget-7" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>Online Coaching</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-globe fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="globe" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512" data-fa-i2svg=""><path fill="currentColor" d="M336.5 160C322 70.7 287.8 8 248 8s-74 62.7-88.5 152h177zM152 256c0 22.2 1.2 43.5 3.3 64h185.3c2.1-20.5 3.3-41.8 3.3-64s-1.2-43.5-3.3-64H155.3c-2.1 20.5-3.3 41.8-3.3 64zm324.7-96c-28.6-67.9-86.5-120.4-158-141.6 24.4 33.8 41.2 84.7 50 141.6h108zM177.2 18.4C105.8 39.6 47.8 92.1 19.3 160h108c8.7-56.9 25.5-107.8 49.9-141.6zM487.4 192H372.7c2.1 21 3.3 42.5 3.3 64s-1.2 43-3.3 64h114.6c5.5-20.5 8.6-41.8 8.6-64s-3.1-43.5-8.5-64zM120 256c0-21.5 1.2-43 3.3-64H8.6C3.2 212.5 0 233.8 0 256s3.2 43.5 8.6 64h114.6c-2-21-3.2-42.5-3.2-64zm39.5 96c14.5 89.3 48.7 152 88.5 152s74-62.7 88.5-152h-177zm159.3 141.6c71.4-21.2 129.4-73.7 158-141.6h-108c-8.8 56.9-25.6 107.8-50 141.6zM19.3 352c28.6 67.9 86.5 120.4 158 141.6-24.4-33.8-41.2-84.7-50-141.6h-108z"></path></svg>
                                     <span class="fa fa-globe"></span> </div>
                            </div>
                        </div>
                    </section>
                    <section id="bttk_icon_text_widget-8" class="widget widget_bttk_icon_text_widget">
                        <div class="rtc-itw-holder">
                            <div class="rtc-itw-inner-holder">
                                <div class="text-holder">
                                    <h2 class="widget-title" itemprop="name"><span>Public Speaking</span></h2>
                                    <div class="content">
                                        <p>Coaching starts by declaring a powerful future. Let me help you realize your business goals and achieve success.</p>
                                    </div>
                                </div>
                                <div class="icon-holder"> <svg class="svg-inline--fa fa-podcast fa-w-14" aria-hidden="true" data-prefix="fa" data-icon="podcast" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M267.429 488.563C262.286 507.573 242.858 512 224 512c-18.857 0-38.286-4.427-43.428-23.437C172.927 460.134 160 388.898 160 355.75c0-35.156 31.142-43.75 64-43.75s64 8.594 64 43.75c0 32.949-12.871 104.179-20.571 132.813zM156.867 288.554c-18.693-18.308-29.958-44.173-28.784-72.599 2.054-49.724 42.395-89.956 92.124-91.881C274.862 121.958 320 165.807 320 220c0 26.827-11.064 51.116-28.866 68.552-2.675 2.62-2.401 6.986.628 9.187 9.312 6.765 16.46 15.343 21.234 25.363 1.741 3.654 6.497 4.66 9.449 1.891 28.826-27.043 46.553-65.783 45.511-108.565-1.855-76.206-63.595-138.208-139.793-140.369C146.869 73.753 80 139.215 80 220c0 41.361 17.532 78.7 45.55 104.989 2.953 2.771 7.711 1.77 9.453-1.887 4.774-10.021 11.923-18.598 21.235-25.363 3.029-2.2 3.304-6.566.629-9.185zM224 0C100.204 0 0 100.185 0 224c0 89.992 52.602 165.647 125.739 201.408 4.333 2.118 9.267-1.544 8.535-6.31-2.382-15.512-4.342-30.946-5.406-44.339-.146-1.836-1.149-3.486-2.678-4.512-47.4-31.806-78.564-86.016-78.187-147.347.592-96.237 79.29-174.648 175.529-174.899C320.793 47.747 400 126.797 400 224c0 61.932-32.158 116.49-80.65 147.867-.999 14.037-3.069 30.588-5.624 47.23-.732 4.767 4.203 8.429 8.535 6.31C395.227 389.727 448 314.187 448 224 448 100.205 347.815 0 224 0zm0 160c-35.346 0-64 28.654-64 64s28.654 64 64 64 64-28.654 64-64-28.654-64-64-64z"></path></svg>
                                     <span class="fa fa-podcast"></span> </div>
                            </div>
                        </div>
                    </section>
                </div>-->
            <!--</section>-->
            <section id="blog_section" class="blog-section">
                <div class="wrapper">
                    <h2 class="section-title"><span>Latest Articles</span></h2>
                    <div class="article-wrap">
                        <article class="post">
                            <figure class="post-thumbnail">
                                <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/"> <img width="370" height="275" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20370%20275'%3E%3C/svg%3E" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image"
                                                                                                                                           alt="" itemprop="image" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-80x60.jpeg 80w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-390x290.jpeg 390w"
                                                                                                                                           data-lazy-sizes="(max-width: 370px) 100vw, 370px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-370x275.jpeg"><noscript><img width="370" height="275" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-370x275.jpeg" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image" alt="" itemprop="image" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-80x60.jpeg 80w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-390x290.jpeg 390w" sizes="(max-width: 370px) 100vw, 370px" /></noscript>                                    </a>
                            </figure>
                            <header class="entry-header">
                                <div class="entry-meta">
                                    <div class="category" itemprop="about"><a href="https://demo.blossomthemes.com/blossom-coach/category/business/" rel="category tag">Business</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/career/" rel="category tag">Career</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/impact/"
                                                                                                                                                                                                        rel="category tag">Impact</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/performance/" rel="category tag">Performance</a></div>
                                </div>
                                <h3 class="entry-title"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/">Starting a Life-Coaching Practice</a></h3>
                            </header>
                            <div class="entry-content">
                                <p>Coaching is a form of development in which a person called a coach supports a learner or client in achieving a specific personal or professional goal by providing training and guidance.</p>
                            </div> <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/" class="btn-link">Read More</a></article>
                        <article class="post">
                            <figure class="post-thumbnail">
                                <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/"> <img width="370" height="275" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20370%20275'%3E%3C/svg%3E" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image"
                                                                                                                                       alt="" itemprop="image" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-390x290.jpeg 390w"
                                                                                                                                       data-lazy-sizes="(max-width: 370px) 100vw, 370px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-370x275.jpeg"><noscript><img width="370" height="275" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-370x275.jpeg" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image" alt="" itemprop="image" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-390x290.jpeg 390w" sizes="(max-width: 370px) 100vw, 370px" /></noscript>                                    </a>
                            </figure>
                            <header class="entry-header">
                                <div class="entry-meta">
                                    <div class="category" itemprop="about"><a href="https://demo.blossomthemes.com/blossom-coach/category/career/" rel="category tag">Career</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/impact/" rel="category tag">Impact</a></div>
                                </div>
                                <h3 class="entry-title"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/">Create a Personal Growth Plan</a></h3>
                            </header>
                            <div class="entry-content">
                                <p>Coaching is a form of development in which a person called a coach supports a learner or client in achieving a specific personal or professional goal by providing training and guidance.</p>
                            </div> <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/" class="btn-link">Read More</a></article>
                        <article class="post">
                            <figure class="post-thumbnail">
                                <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/"> <img width="370" height="275" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20370%20275'%3E%3C/svg%3E" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image"
                                                                                                                                       alt="" itemprop="image" data-lazy-srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-80x60.jpeg 80w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-390x290.jpeg 390w"
                                                                                                                                       data-lazy-sizes="(max-width: 370px) 100vw, 370px" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-370x275.jpeg"><noscript><img width="370" height="275" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-370x275.jpeg" class="attachment-blossom-coach-latest size-blossom-coach-latest wp-post-image" alt="" itemprop="image" srcset="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-370x275.jpeg 370w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-80x60.jpeg 80w, https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-390x290.jpeg 390w" sizes="(max-width: 370px) 100vw, 370px" /></noscript>                                    </a>
                            </figure>
                            <header class="entry-header">
                                <div class="entry-meta">
                                    <div class="category" itemprop="about"><a href="https://demo.blossomthemes.com/blossom-coach/category/business/" rel="category tag">Business</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/career/" rel="category tag">Career</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/impact/"
                                                                                                                                                                                                        rel="category tag">Impact</a> <a href="https://demo.blossomthemes.com/blossom-coach/category/performance/" rel="category tag">Performance</a></div>
                                </div>
                                <h3 class="entry-title"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/">Sustainable Giving for Better</a></h3>
                            </header>
                            <div class="entry-content">
                                <p>Coaching is a form of development in which a person called a coach supports a learner or client in achieving a specific personal or professional goal by providing training and guidance.</p>
                            </div> <a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/" class="btn-link">Read More</a></article>
                    </div> <a href="https://demo.blossomthemes.com/blossom-coach/blog/" class="btn-readmore">See More Posts</a></div>
            </section>
<!--            <section id="simple_cta_section" class="simple-cta-section">
                <div class="wrapper">
                    <section id="blossomtheme_companion_cta_widget-5" class="widget widget_blossomtheme_companion_cta_widget">
                        <div class="right text" style="background:#88ced0">
                            <div class="blossomtheme-cta-container">
                                <h2 class="widget-title" itemprop="name"><span>Not Sure Where to Start?</span></h2>
                                <div class="text-holder">
                                    <p>I'd love to share my experience to help you build your business from scratch to reach your goals, which you can't find elsewhere.</p>
                                    <div class="button-wrap"> <a target="_self" href="#" class="btn-cta btn-1">Start Here</a></div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </section>-->
            <section id="contact_section" class="contact-section">
                <div class="wrapper">
                    <section id="bttk_contact_social_links-3" class="widget widget_bttk_contact_social_links">
                        <h2 class="widget-title" itemprop="name"><span>Address</span></h2>
                        <div class="bttk-contact-widget-wrap contact-info">
                            <p>Place of residence of the person addressed; a street address .</p>
                            <ul class="contact-list">
                                <li><svg class="svg-inline--fa fa-phone fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="phone" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M493.4 24.6l-104-24c-11.3-2.6-22.9 3.3-27.5 13.9l-48 112c-4.2 9.8-1.4 21.3 6.9 28l60.6 49.6c-36 76.7-98.9 140.5-177.2 177.2l-49.6-60.6c-6.8-8.3-18.2-11.1-28-6.9l-112 48C3.9 366.5-2 378.1.6 389.4l24 104C27.1 504.2 36.7 512 48 512c256.1 0 464-207.5 464-464 0-11.2-7.7-20.9-18.6-23.4z"></path></svg>
                                    <!-- <i class="fa fa-phone"></i> --><a href="tel:1234567890"> +123-456-7890</a></li>
                                <li><svg class="svg-inline--fa fa-envelope fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="envelope" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M502.3 190.8c3.9-3.1 9.7-.2 9.7 4.7V400c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V195.6c0-5 5.7-7.8 9.7-4.7 22.4 17.4 52.1 39.5 154.1 113.6 21.1 15.4 56.7 47.8 92.2 47.6 35.7.3 72-32.8 92.3-47.6 102-74.1 131.6-96.3 154-113.7zM256 320c23.2.4 56.6-29.2 73.4-41.4 132.7-96.3 142.8-104.7 173.4-128.7 5.8-4.5 9.2-11.5 9.2-18.9v-19c0-26.5-21.5-48-48-48H48C21.5 64 0 85.5 0 112v19c0 7.4 3.4 14.3 9.2 18.9 30.6 23.9 40.7 32.4 173.4 128.7 16.8 12.2 50.2 41.8 73.4 41.4z"></path></svg>
                                    <!-- <i class="fa fa-envelope"></i> --><a href="mailto:mail@domain.com">mail@domain.com</a></li>
                                <li><svg class="svg-inline--fa fa-map-marker-alt fa-w-12" aria-hidden="true" data-prefix="fa" data-icon="map-marker-alt" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512" data-fa-i2svg=""><path fill="currentColor" d="M172.268 501.67C26.97 291.031 0 269.413 0 192 0 85.961 85.961 0 192 0s192 85.961 192 192c0 77.413-26.97 99.031-172.268 309.67-9.535 13.774-29.93 13.773-39.464 0zM192 272c44.183 0 80-35.817 80-80s-35.817-80-80-80-80 35.817-80 80 35.817 80 80 80z"></path></svg>
                                    <!-- <i class="fa fa-map-marker"></i> -->Apple St, New York NY 10012, USA</li>
                            </ul>
                            <ul class="social-networks">
                                <li class="bttk-contact-social-icon-wrap">
                                    <a target="_blank" href="https://www.facebook.com/blossomthemesHQ/"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-facebook fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="facebook" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M448 56.7v398.5c0 13.7-11.1 24.7-24.7 24.7H309.1V306.5h58.2l8.7-67.6h-67v-43.2c0-19.6 5.4-32.9 33.5-32.9h35.8v-60.5c-6.2-.8-27.4-2.7-52.2-2.7-51.6 0-87 31.5-87 89.4v49.9h-58.4v67.6h58.4V480H24.7C11.1 480 0 468.9 0 455.3V56.7C0 43.1 11.1 32 24.7 32h398.5c13.7 0 24.8 11.1 24.8 24.7z"></path></svg><!-- <i class="fab fa-facebook"></i> --></span>                                        </a>
                                </li>
                                <li class="bttk-contact-social-icon-wrap">
                                    <a target="_blank" href="https://twitter.com/blossomthemesHQ"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-twitter fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="twitter" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M459.37 151.716c.325 4.548.325 9.097.325 13.645 0 138.72-105.583 298.558-298.558 298.558-59.452 0-114.68-17.219-161.137-47.106 8.447.974 16.568 1.299 25.34 1.299 49.055 0 94.213-16.568 130.274-44.832-46.132-.975-84.792-31.188-98.112-72.772 6.498.974 12.995 1.624 19.818 1.624 9.421 0 18.843-1.3 27.614-3.573-48.081-9.747-84.143-51.98-84.143-102.985v-1.299c13.969 7.797 30.214 12.67 47.431 13.319-28.264-18.843-46.781-51.005-46.781-87.391 0-19.492 5.197-37.36 14.294-52.954 51.655 63.675 129.3 105.258 216.365 109.807-1.624-7.797-2.599-15.918-2.599-24.04 0-57.828 46.782-104.934 104.934-104.934 30.213 0 57.502 12.67 76.67 33.137 23.715-4.548 46.456-13.32 66.599-25.34-7.798 24.366-24.366 44.833-46.132 57.827 21.117-2.273 41.584-8.122 60.426-16.243-14.292 20.791-32.161 39.308-52.628 54.253z"></path></svg><!-- <i class="fab fa-twitter"></i> --></span>                                        </a>
                                </li>
                                <li class="bttk-contact-social-icon-wrap">
                                    <a target="_blank" href="https://www.instagram.com/_blossomthemes"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-instagram fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="instagram" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.7 102.7-9 132.1z"></path></svg><!-- <i class="fab fa-instagram"></i> --></span>                                        </a>
                                </li>
                                <li class="bttk-contact-social-icon-wrap">
                                    <a target="_blank" href="http://pinterest.com"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-pinterest fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="pinterest" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512" data-fa-i2svg=""><path fill="currentColor" d="M496 256c0 137-111 248-248 248-25.6 0-50.2-3.9-73.4-11.1 10.1-16.5 25.2-43.5 30.8-65 3-11.6 15.4-59 15.4-59 8.1 15.4 31.7 28.5 56.8 28.5 74.8 0 128.7-68.8 128.7-154.3 0-81.9-66.9-143.2-152.9-143.2-107 0-163.9 71.8-163.9 150.1 0 36.4 19.4 81.7 50.3 96.1 4.7 2.2 7.2 1.2 8.3-3.3.8-3.4 5-20.3 6.9-28.1.6-2.5.3-4.7-1.7-7.1-10.1-12.5-18.3-35.3-18.3-56.6 0-54.7 41.4-107.6 112-107.6 60.9 0 103.6 41.5 103.6 100.9 0 67.1-33.9 113.6-78 113.6-24.3 0-42.6-20.1-36.7-44.8 7-29.5 20.5-61.3 20.5-82.6 0-19-10.2-34.9-31.4-34.9-24.9 0-44.9 25.7-44.9 60.2 0 22 7.4 36.8 7.4 36.8s-24.5 103.8-29 123.2c-5 21.4-3 51.6-.9 71.2C65.4 450.9 0 361.1 0 256 0 119 111 8 248 8s248 111 248 248z"></path></svg><!-- <i class="fab fa-pinterest"></i> --></span>                                        </a>
                                </li>
                                <li class="bttk-contact-social-icon-wrap">
                                    <a target="_blank" href="http://plus.google.com"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-google fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="google" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 488 512" data-fa-i2svg=""><path fill="currentColor" d="M488 261.8C488 403.3 391.1 504 248 504 110.8 504 0 393.2 0 256S110.8 8 248 8c66.8 0 123 24.5 166.3 64.9l-67.5 64.9C258.5 52.6 94.3 116.6 94.3 256c0 86.5 69.1 156.6 153.7 156.6 98.2 0 135-70.4 140.8-106.9H248v-85.3h236.1c2.3 12.7 3.9 24.9 3.9 41.4z"></path></svg><!-- <i class="fab fa-google"></i> --></span>                                        </a>
                                </li>
                            </ul>
                        </div>
                    </section>
                    <section id="text-5" class="widget widget_text">
                        <h2 class="widget-title" itemprop="name"><span>Request a Free Consultation</span></h2>
                        <div class="textwidget">
                            <p>If you have any questions or just want to get in touch, use the form below. I look forward to hearing from you! You can get in touch with me directly at <a href="#">hello@domain.com.</a></p>
                            <div role="form" class="wpcf7" id="wpcf7-f67-o1" lang="en-US" dir="ltr">
                                <div class="screen-reader-response"></div>
                                <form action="/blossom-coach/#wpcf7-f67-o1" method="post" class="wpcf7-form" novalidate="novalidate">
                                    <div style="display: none;"> <input type="hidden" name="_wpcf7" value="67"> <input type="hidden" name="_wpcf7_version" value="5.1.6"> <input type="hidden" name="_wpcf7_locale" value="en_US"> <input type="hidden" name="_wpcf7_unit_tag" value="wpcf7-f67-o1">                                        <input type="hidden" name="_wpcf7_container_post" value="0"></div>
                                    <p><span class="wpcf7-form-control-wrap your-name"><input type="text" name="your-name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false" placeholder="Name"></span></p>
                                    <p><span class="wpcf7-form-control-wrap your-email"><input type="email" name="your-email" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email" aria-required="true" aria-invalid="false" placeholder="Email"></span></p>
                                    <p><span class="wpcf7-form-control-wrap your-message"><textarea name="your-message" cols="40" rows="10" class="wpcf7-form-control wpcf7-textarea" aria-invalid="false" placeholder="Message"></textarea></span></p>
                                    <p><input type="submit" value="Send Message" class="wpcf7-form-control wpcf7-submit"><span class="ajax-loader"></span></p>
                                    <div class="wpcf7-response-output wpcf7-display-none"></div>
                                </form>
                            </div>
                        </div>
                    </section>
                </div>
            </section>
            <section class="newsletter-section">
                <div class="wrapper">
                    <div class="blossomthemes-email-newsletter-wrapper" id="boxes-120" style="background: #88ced0; color: ">
                        <div class="text-holder">
                            <h3>Sign up for Newsletter</h3> <span>And get free eBook of successful leadership</span></div>
                        <form id="blossomthemes-email-newsletter-120" class="blossomthemes-email-newsletter-window-120"> <input type="text" name="subscribe-fname" required="required" class="subscribe-fname-120" value="" placeholder="Your First Name"> <input type="text" name="subscribe-email" required="required" class="subscribe-email-120" value=""
                                                                                                                                                                                                        placeholder="Your Email"> <label for="subscribe-confirmation-120"><div class="subscribe-inner-wrap"> <input type="checkbox" class="subscribe-confirmation-120" name="subscribe-confirmation" id="subscribe-confirmation-120" required=""><span class="check-mark"></span> <span class="text"> By checking this, you agree to our Privacy Policy. </span></div> </label>
                            <div id="loader-120" style="display: none">
                                <div class="table">
                                    <div class="table-row">
                                        <div class="table-cell"> <img src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%200%200'%3E%3C/svg%3E" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"><noscript><img src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/css/loader.gif"></noscript></div>
                                    </div>
                                </div>
                            </div> <input type="submit" name="subscribe-submit" class="subscribe-submit-120" value="Register"></form>
                        <div class="bten-response" id="bten-response-120"><span></span></div>
                        <div id="mask-120"></div>
                    </div>
                    
                    
                    <script>
                        jQuery(document).ready(function () {
                            
                            jQuery(document).on("submit", "form#blossomthemes-email-newsletter-120", function (e) {
                                e.preventDefault();
                                jQuery(".subscribe-submit-120").attr("disabled", "disabled");
                                var email = jQuery(".subscribe-email-120").val();
                                var fname = jQuery(".subscribe-fname-120").val();
                                var confirmation = jQuery(".subscribe-confirmation-120").val();
                                var sid = 120;
                                jQuery.ajax({
                                    type: "post",
                                    dataType: "json",
                                    url: bten_ajax_data.ajaxurl,
                                    data: {
                                        action: "subscription_response",
                                        email: email,
                                        fname: fname,
                                        sid: sid,
                                        confirmation: confirmation
                                    },
                                    beforeSend: function () {
                                        jQuery("#loader-120").fadeIn(500)
                                    },
                                    success: function (response) {
                                        jQuery(".subscribe-submit-120").attr("disabled", "disabled");
                                        if (response.type === "success") {
                                            jQuery("#bten-response-120 span").html(response.message);
                                            jQuery("#bten-response-120").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                jQuery(".subscribe-submit-120").removeAttr("disabled", "disabled");
                                                jQuery("form#blossomthemes-email-newsletter-120").find("input[type=text]").val("");
                                                jQuery("form#blossomthemes-email-newsletter-120").find("input[type=checkbox]").prop("checked", !1)
                                            })
                                        } else {
                                            jQuery("#bten-response-120 span").html(response.message);
                                            jQuery("#bten-response-120").fadeIn("slow").delay("3000").fadeOut("3000", function () {
                                                jQuery(".subscribe-submit-120").removeAttr("disabled", "disabled");
                                                jQuery("form#blossomthemes-email-newsletter-120").find("input[type=text]").val("");
                                                jQuery("form#blossomthemes-email-newsletter-120").find("input[type=checkbox]").prop("checked", !1)
                                            })
                                        }
                                    },
                                    complete: function () {
                                        jQuery("#loader-120").fadeOut(500)
                                    }
                                })
                            })
                        });
                    </script>
                </div>
            </section>
            <footer id="colophon" class="site-footer" itemscope="" itemtype="http://schema.org/WPFooter">
                <div class="top-footer">
                    <div class="wrapper">
                        <div class="grid column-4">
                            <div class="col">
                                <section id="text-8" class="widget widget_text">
                                    <div class="textwidget">
                                        <p><img class="alignnone size-full wp-image-76" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20189%2048'%3E%3C/svg%3E" alt="" width="189" height="48" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/logo.png"><noscript><img class="alignnone size-full wp-image-76" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/logo.png" alt="" width="189" height="48" /></noscript></p>
                                        <p>Coaching is a form of development in which a person called a coach supports a learner or client in achieving a specific personal or professional goal by providing training and guidance. The learner is sometimes
                                            called a coachee.</p>
                                    </div>
                                </section>
                            </div>
                            <div class="col">
                                <section id="bttk_pro_recent_post-3" class="widget widget_bttk_pro_recent_post">
                                    <h2 class="widget-title" itemprop="name"><span>Recent Posts</span></h2>
                                    <ul class="style-one">
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                             alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/business/" alt="View all posts in Business">Business</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/career/" alt="View all posts in Career">Career</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/performance/" alt="View all posts in Performance">Performance</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/">Starting a Life-Coaching Practice</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/"> <time datetime="2018-05-03">May 3, 2018</time></a> </span></div>
                                            </div>
                                        </li>
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                         alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2744221-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/career/" alt="View all posts in Career">Career</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/">Create a Personal Growth Plan</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/create-a-personal-growth-plan/"> <time datetime="2018-05-03">May 3, 2018</time></a> </span></div>
                                            </div>
                                        </li>
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                         alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-2251571-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/business/" alt="View all posts in Business">Business</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/career/" alt="View all posts in Career">Career</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/performance/" alt="View all posts in Performance">Performance</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/">Sustainable Giving for Better</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/sustainable-giving-for-better/"> <time datetime="2018-05-03">May 3, 2018</time></a> </span></div>
                                            </div>
                                        </li>
                                    </ul>
                                </section>
                            </div>
                            <div class="col">
                                <section id="bttk_contact_social_links-4" class="widget widget_bttk_contact_social_links">
                                    <h2 class="widget-title" itemprop="name"><span>Contact Us</span></h2>
                                    <div class="bttk-contact-widget-wrap contact-info">
                                        <ul class="contact-list">
                                            <li><svg class="svg-inline--fa fa-phone fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="phone" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M493.4 24.6l-104-24c-11.3-2.6-22.9 3.3-27.5 13.9l-48 112c-4.2 9.8-1.4 21.3 6.9 28l60.6 49.6c-36 76.7-98.9 140.5-177.2 177.2l-49.6-60.6c-6.8-8.3-18.2-11.1-28-6.9l-112 48C3.9 366.5-2 378.1.6 389.4l24 104C27.1 504.2 36.7 512 48 512c256.1 0 464-207.5 464-464 0-11.2-7.7-20.9-18.6-23.4z"></path></svg>
                                                <!-- <i class="fa fa-phone"></i> --><a href="tel:1234567890"> +123-456-7890</a></li>
                                            <li><svg class="svg-inline--fa fa-envelope fa-w-16" aria-hidden="true" data-prefix="fa" data-icon="envelope" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M502.3 190.8c3.9-3.1 9.7-.2 9.7 4.7V400c0 26.5-21.5 48-48 48H48c-26.5 0-48-21.5-48-48V195.6c0-5 5.7-7.8 9.7-4.7 22.4 17.4 52.1 39.5 154.1 113.6 21.1 15.4 56.7 47.8 92.2 47.6 35.7.3 72-32.8 92.3-47.6 102-74.1 131.6-96.3 154-113.7zM256 320c23.2.4 56.6-29.2 73.4-41.4 132.7-96.3 142.8-104.7 173.4-128.7 5.8-4.5 9.2-11.5 9.2-18.9v-19c0-26.5-21.5-48-48-48H48C21.5 64 0 85.5 0 112v19c0 7.4 3.4 14.3 9.2 18.9 30.6 23.9 40.7 32.4 173.4 128.7 16.8 12.2 50.2 41.8 73.4 41.4z"></path></svg>
                                                <!-- <i class="fa fa-envelope"></i> --><a href="mailto:mail@domain.com">mail@domain.com</a></li>
                                            <li><svg class="svg-inline--fa fa-map-marker-alt fa-w-12" aria-hidden="true" data-prefix="fa" data-icon="map-marker-alt" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512" data-fa-i2svg=""><path fill="currentColor" d="M172.268 501.67C26.97 291.031 0 269.413 0 192 0 85.961 85.961 0 192 0s192 85.961 192 192c0 77.413-26.97 99.031-172.268 309.67-9.535 13.774-29.93 13.773-39.464 0zM192 272c44.183 0 80-35.817 80-80s-35.817-80-80-80-80 35.817-80 80 35.817 80 80 80z"></path></svg>
                                                <!-- <i class="fa fa-map-marker"></i> -->Apple St, New York NY 10012, USA</li>
                                        </ul>
                                        <ul class="social-networks">
                                            <li class="bttk-contact-social-icon-wrap">
                                                <a href="https://www.facebook.com/blossomthemesHQ/"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-facebook fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="facebook" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M448 56.7v398.5c0 13.7-11.1 24.7-24.7 24.7H309.1V306.5h58.2l8.7-67.6h-67v-43.2c0-19.6 5.4-32.9 33.5-32.9h35.8v-60.5c-6.2-.8-27.4-2.7-52.2-2.7-51.6 0-87 31.5-87 89.4v49.9h-58.4v67.6h58.4V480H24.7C11.1 480 0 468.9 0 455.3V56.7C0 43.1 11.1 32 24.7 32h398.5c13.7 0 24.8 11.1 24.8 24.7z"></path></svg><!-- <i class="fab fa-facebook"></i> --></span>                                                    </a>
                                            </li>
                                            <li class="bttk-contact-social-icon-wrap">
                                                <a href="https://twitter.com/blossomthemesHQ"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-twitter fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="twitter" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M459.37 151.716c.325 4.548.325 9.097.325 13.645 0 138.72-105.583 298.558-298.558 298.558-59.452 0-114.68-17.219-161.137-47.106 8.447.974 16.568 1.299 25.34 1.299 49.055 0 94.213-16.568 130.274-44.832-46.132-.975-84.792-31.188-98.112-72.772 6.498.974 12.995 1.624 19.818 1.624 9.421 0 18.843-1.3 27.614-3.573-48.081-9.747-84.143-51.98-84.143-102.985v-1.299c13.969 7.797 30.214 12.67 47.431 13.319-28.264-18.843-46.781-51.005-46.781-87.391 0-19.492 5.197-37.36 14.294-52.954 51.655 63.675 129.3 105.258 216.365 109.807-1.624-7.797-2.599-15.918-2.599-24.04 0-57.828 46.782-104.934 104.934-104.934 30.213 0 57.502 12.67 76.67 33.137 23.715-4.548 46.456-13.32 66.599-25.34-7.798 24.366-24.366 44.833-46.132 57.827 21.117-2.273 41.584-8.122 60.426-16.243-14.292 20.791-32.161 39.308-52.628 54.253z"></path></svg><!-- <i class="fab fa-twitter"></i> --></span>                                                    </a>
                                            </li>
                                            <li class="bttk-contact-social-icon-wrap">
                                                <a href="https://www.instagram.com/_blossomthemes"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-instagram fa-w-14" aria-hidden="true" data-prefix="fab" data-icon="instagram" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" data-fa-i2svg=""><path fill="currentColor" d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.7 102.7-9 132.1z"></path></svg><!-- <i class="fab fa-instagram"></i> --></span>                                                    </a>
                                            </li>
                                            <li class="bttk-contact-social-icon-wrap">
                                                <a href="http://pinterest.com"> <span class="bttk-contact-social-links-field-handle"><svg class="svg-inline--fa fa-pinterest fa-w-16" aria-hidden="true" data-prefix="fab" data-icon="pinterest" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512" data-fa-i2svg=""><path fill="currentColor" d="M496 256c0 137-111 248-248 248-25.6 0-50.2-3.9-73.4-11.1 10.1-16.5 25.2-43.5 30.8-65 3-11.6 15.4-59 15.4-59 8.1 15.4 31.7 28.5 56.8 28.5 74.8 0 128.7-68.8 128.7-154.3 0-81.9-66.9-143.2-152.9-143.2-107 0-163.9 71.8-163.9 150.1 0 36.4 19.4 81.7 50.3 96.1 4.7 2.2 7.2 1.2 8.3-3.3.8-3.4 5-20.3 6.9-28.1.6-2.5.3-4.7-1.7-7.1-10.1-12.5-18.3-35.3-18.3-56.6 0-54.7 41.4-107.6 112-107.6 60.9 0 103.6 41.5 103.6 100.9 0 67.1-33.9 113.6-78 113.6-24.3 0-42.6-20.1-36.7-44.8 7-29.5 20.5-61.3 20.5-82.6 0-19-10.2-34.9-31.4-34.9-24.9 0-44.9 25.7-44.9 60.2 0 22 7.4 36.8 7.4 36.8s-24.5 103.8-29 123.2c-5 21.4-3 51.6-.9 71.2C65.4 450.9 0 361.1 0 256 0 119 111 8 248 8s248 111 248 248z"></path></svg><!-- <i class="fab fa-pinterest"></i> --></span>                                                    </a>
                                            </li>
                                        </ul>
                                    </div>
                                </section>
                            </div>
                            <div class="col">
                                <section id="bttk_popular_post-4" class="widget widget_bttk_popular_post">
                                    <h2 class="widget-title" itemprop="name"><span>Popular Posts</span></h2>
                                    <ul class="style-one">
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                             alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-313691-1-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/business/" alt="View all posts in Business">Business</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/career/" alt="View all posts in Career">Career</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/performance/" alt="View all posts in Performance">Performance</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/">Starting a Life-Coaching Practice</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/starting-a-life-coaching-practice/" rel="bookmark"><time class="entry-date published updated" datetime="2018-05-03T09:18:48+00:00">May 3, 2018</time></a></span></div>
                                            </div>
                                        </li>
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/coach-supports-a-learner/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                    alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3136901-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/pexels-photo-3136901-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/business/" alt="View all posts in Business">Business</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/coach-supports-a-learner/">Coach supports a learner</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/coach-supports-a-learner/" rel="bookmark"><time class="entry-date published updated" datetime="2018-05-03T08:59:41+00:00">May 3, 2018</time></a></span></div>
                                            </div>
                                        </li>
                                        <li>
                                            <a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/10-online-careers-your-can-start-today-with-basically-no-money/" class="post-thumbnail"> <img width="330" height="190" src="data:image/svg+xml,%3Csvg%20xmlns='http://www.w3.org/2000/svg'%20viewBox='0%200%20330%20190'%3E%3C/svg%3E" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image"
                                                                                                                                                                                                        alt="" itemprop="image" data-lazy-src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/office-notes-notepad-entrepreneur-385561-330x190.jpeg"><noscript><img width="330" height="190" src="https://demo.blossomthemes.com/blossom-coach/wp-content/uploads/sites/7/2018/05/office-notes-notepad-entrepreneur-385561-330x190.jpeg" class="attachment-post-slider-thumb-size size-post-slider-thumb-size wp-post-image" alt="" itemprop="image" /></noscript>                                                </a>
                                            <div class="entry-header"> <span class="cat-links"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/business/" alt="View all posts in Business">Business</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/career/" alt="View all posts in Career">Career</a><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/category/impact/" alt="View all posts in Impact">Impact</a></span>
                                                <h3 class="entry-title"><a target="_self" href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/10-online-careers-your-can-start-today-with-basically-no-money/">10 Online Careers Your Can Start Today With Basically No Money</a></h3>
                                                <div class="entry-meta"> <span class="posted-on"><a href="https://demo.blossomthemes.com/blossom-coach/2018/05/03/10-online-careers-your-can-start-today-with-basically-no-money/" rel="bookmark"><time class="entry-date published updated" datetime="2018-05-03T09:03:12+00:00">May 3, 2018</time></a></span></div>
                                            </div>
                                        </li>
                                    </ul>
                                </section>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="bottom-footer">
                    <div class="wrapper">
                        <div class="copyright"> <span>© Copyright 2020 <a href="https://demo.blossomthemes.com/blossom-coach/">Coach</a>. All Rights Reserved. </span>  Developed By <a href="#" rel="nofollow" target="_blank">HimalRaee</a>.
                            Powered by <a href="#" target="_blank">Me the developer</a>.</div>
                    </div>
                </div> <button aria-label="go to top" class="back-to-top"> <span>➜</span> </button></footer>
        </div>
        <script type="text/javascript">
            var c = document.body.className;
            c = c.replace(/woocommerce-no-js/, 'woocommerce-js');
            document.body.className = c;
        </script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var bten_ajax_data = {
                "ajaxurl": "https:\/\/demo.blossomthemes.com\/blossom-coach\/wp-admin\/admin-ajax.php"
            }; /* ]]> */
        </script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/js/blossomthemes-email-newsletter-public.min-2.0.9.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-email-newsletter/public/js/all.min-5.6.3.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-instagram-feed/public/js/blossomthemes-instagram-feed-public.min-1.2.0.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-instagram-feed/public/js/jquery.magnific-popup.min-1.0.0.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-toolkit/public/js/isotope.pkgd.min-3.0.5.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-includes/js/imagesloaded.min-3.2.0.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-includes/js/masonry.min-3.3.2.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-toolkit/public/js/blossomthemes-toolkit-public.min-2.1.6.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/blossomthemes-toolkit/public/js/fontawesome/v4-shims.min-5.6.3.js" defer=""></script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var wpcf7 = {
                "apiSettings": {
                    "root": "https:\/\/demo.blossomthemes.com\/blossom-coach\/wp-json\/contact-form-7\/v1",
                    "namespace": "contact-form-7\/v1"
                },
                "cached": "1"
            }; /* ]]> */
        </script>
        <script data-minify="1" type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/min/7/blossom-coach/wp-content/plugins/contact-form-7/includes/js/scripts-733df5c39dfd3822eeb12bd4b0a66252.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min-2.70.js" defer=""></script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var wc_add_to_cart_params = {
                "ajax_url": "\/blossom-coach\/wp-admin\/admin-ajax.php",
                "wc_ajax_url": "\/blossom-coach\/?wc-ajax=%%endpoint%%",
                "i18n_view_cart": "View cart",
                "cart_url": "https:\/\/demo.blossomthemes.com\/blossom-coach\/cart\/",
                "is_cart": "",
                "cart_redirect_after_add": "no"
            }; /* ]]> */
        </script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min-3.9.2.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/js/js-cookie/js.cookie.min-2.1.4.js" defer=""></script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var woocommerce_params = {
                "ajax_url": "\/blossom-coach\/wp-admin\/admin-ajax.php",
                "wc_ajax_url": "\/blossom-coach\/?wc-ajax=%%endpoint%%"
            }; /* ]]> */
        </script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min-3.9.2.js" defer=""></script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var wc_cart_fragments_params = {
                "ajax_url": "\/blossom-coach\/wp-admin\/admin-ajax.php",
                "wc_ajax_url": "\/blossom-coach\/?wc-ajax=%%endpoint%%",
                "cart_hash_key": "wc_cart_hash_f6a6bff68c829c9030b603f423a02316",
                "fragment_name": "wc_fragments_f6a6bff68c829c9030b603f423a02316",
                "request_timeout": "5000"
            }; /* ]]> */
        </script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min-3.9.2.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/themes/blossom-coach/js/owl.carousel.min-2.2.1.js" defer=""></script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/themes/blossom-coach/js/owl.carousel.aria.min-2.0.0.js" defer=""></script>
        <script type="text/javascript">
            /* <![CDATA[ */
            var blossom_coach_data = {
                "rtl": "",
                "animation": ""
            }; /* ]]> */
        </script>
        <script type="text/javascript" src="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/themes/blossom-coach/js/custom.min-1.2.3.js" defer=""></script>
        <script>
            window.lazyLoadOptions = {
                elements_selector: "img[data-lazy-src],.rocket-lazyload",
                data_src: "lazy-src",
                data_srcset: "lazy-srcset",
                data_sizes: "lazy-sizes",
                class_loading: "lazyloading",
                class_loaded: "lazyloaded",
                threshold: 300,
                callback_loaded: function (element) {
                    if (element.tagName === "IFRAME" && element.dataset.rocketLazyload == "fitvidscompatible") {
                        if (element.classList.contains("lazyloaded")) {
                            if (typeof window.jQuery != "undefined") {
                                if (jQuery.fn.fitVids) {
                                    jQuery(element).parent().fitVids()
                                }
                            }
                        }
                    }
                }
            };
            window.addEventListener('LazyLoad::Initialized', function (e) {
                var lazyLoadInstance = e.detail.instance;
                if (window.MutationObserver) {
                    var observer = new MutationObserver(function (mutations) {
                        var image_count = 0;
                        var iframe_count = 0;
                        var rocketlazy_count = 0;
                        mutations.forEach(function (mutation) {
                            for (i = 0; i < mutation.addedNodes.length; i++) {
                                if (typeof mutation.addedNodes[i].getElementsByTagName !== 'function') {
                                    return
                                }
                                if (typeof mutation.addedNodes[i].getElementsByClassName !== 'function') {
                                    return
                                }
                                images = mutation.addedNodes[i].getElementsByTagName('img');
                                is_image = mutation.addedNodes[i].tagName == "IMG";
                                iframes = mutation.addedNodes[i].getElementsByTagName('iframe');
                                is_iframe = mutation.addedNodes[i].tagName == "IFRAME";
                                rocket_lazy = mutation.addedNodes[i].getElementsByClassName('rocket-lazyload');
                                image_count += images.length;
                                iframe_count += iframes.length;
                                rocketlazy_count += rocket_lazy.length;
                                if (is_image) {
                                    image_count += 1
                                }
                                if (is_iframe) {
                                    iframe_count += 1
                                }
                            }
                        });
                        if (image_count > 0 || iframe_count > 0 || rocketlazy_count > 0) {
                            lazyLoadInstance.update()
                        }
                    });
                    var b = document.getElementsByTagName("body")[0];
                    var config = {
                        childList: !0,
                        subtree: !0
                    };
                    observer.observe(b, config)
                }
            }, !1)
        </script>
        <script data-no-minify="1" async="" src="https://demo.blossomthemes.com/blossom-coach/wp-content/plugins/wp-rocket/assets/js/lazyload/12.0/lazyload.min.js"></script> <noscript><link rel="stylesheet" href="https://demo.blossomthemes.com/blossom-coach/wp-content/cache/min/7/1411ba187bb5524b04128078df57bfa3.css" data-minify="1" /></noscript><noscript><link rel='stylesheet' id='woocommerce-smallscreen-css' href='https://demo.blossomthemes.com/blossom-coach/wp-content/cache/busting/7/blossom-coach/wp-content/plugins/woocommerce/assets/css/woocommerce-smallscreen-3.9.2.css' type='text/css' media='only screen and (max-width: 768px)' /></noscript><noscript><link rel='stylesheet' id='blossom-coach-google-fonts-css' href='https://fonts.googleapis.com/css?family=Nunito+Sans%3A200%2C200italic%2C300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CNunito%3A200%2C200italic%2C300%2C300italic%2Cregular%2Citalic%2C600%2C600italic%2C700%2C700italic%2C800%2C800italic%2C900%2C900italic%7CNunito%3A700' type='text/css' media='all' /></noscript>
        <!-- This website is like a Rocket, isn't it? Performance optimized by WP Rocket. Learn more: https://wp-rocket.me - Debug: cached@1582602963 -->


<!-- Modal -->

</body>
</body>

</html>
