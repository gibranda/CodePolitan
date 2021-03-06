/*
 * Copyright (c) 2015 Zelory.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package id.zelory.codepolitan.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created on : July 14, 2015
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class BenihWebView extends WebView
{
    private static final String TEXT_HTML = "text/html";
    private static final String BACKGROUND_COLOR = "#FFF";
    private static final String TEXT_COLOR = "#212121";
    private static final String BUTTON_COLOR = "#52A7DF";
    private static final String SUBTITLE_COLOR = "#727272";
    private static final String SUBTITLE_BORDER_COLOR = "solid #B6B6B6";
    private static final String CSS = "<head><link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'><style type='text/css'> "
            + "body {max-width: 100%; margin: 1.2em 0.3cm 0.3cm 0.2cm; font-family: 'Roboto', sans-serif; color: " + TEXT_COLOR + "; background-color:" + BACKGROUND_COLOR + "; line-height: 140%} "
            + "* {max-width: 100%; word-break: break-word} "
            + "h1 {font-weight: normal; line-height: 130%; text-align: center} "
            + "h2 {font-weight: bold; line-height: 130%; text-align: left} "
            + "h1 {font-size: 170%; margin-bottom: 0.1em;} "
            + "h2 {font-size: 150%} "
            + "a {color: #0099CC} "
            + "h1 a {color: inherit; text-decoration: none} "
            + "div.content {text-align:justify} "
            + "img {height: auto; display: block; margin-left: auto; margin-right: auto} "
            + "img.img-responsive {height: auto; display: block; margin-left: auto; margin-right: auto} "
            + "pre {white-space: pre-wrap;} "
            + "blockquote {margin: 0.8em 0 0.8em 1.2em; padding: 0} "
            + "p {margin: 0.8em 0 0.8em 0; text-align:justify} "
            + "p.subtitle {text-align: center; color: " + SUBTITLE_COLOR + "; border-top:1px " + SUBTITLE_BORDER_COLOR + "; border-bottom:1px " + SUBTITLE_BORDER_COLOR + "; padding-top:2px; padding-bottom:2px; font-weight:800 } "
            + "p.wp-caption-text{font-style: italic; text-align: left} "
            + "ul, ol {margin: 0 0 0.8em 0.6em; padding: 0 0 0 1em} "
            + "ul li, ol li {margin: 0 0 0.8em 0; padding: 0} "
            + "div.button-section {padding: 0.4cm 0; margin: 0; text-align: center} "
            + "div.wrapper {margin: 0.8em 0 0.8em 0; text-align:justify} "
            + ".button-section p {margin: 0.1cm 0 0.2cm 0} "
            + ".button-section p.marginfix {margin: 0.5cm 0 0.5cm 0} "
            + "section {padding: 0px 0px;} "
            + "section > * { margin: 10px } "
            + ".card { position: relative; display: inline-block; vertical-align: top; background-color: #fff; box-shadow: 0 12px 15px 0 rgba(0, 0, 0, 0.24);} "
            + "li.item p {font: 200 12px/1.5 Georgia, Times New Roman, serif;} "
            + "li.item {padding: 0px; overflow: auto;} "
            + ".button-section input, .button-section a {font-family: sans-serif-light; font-size: 100%; color: #FFFFFF; background-color: " + BUTTON_COLOR + "; text-decoration: none; border: none; border-radius:0.2cm; padding: 0.3cm} "
            + "</style><meta name='viewport' content='width=device-width'/> </head> ";
    private static final String BODY_START = "<body>";
    private static final String BODY_END = "</body>";
    private static final String TITLE_START = "<h1>";
    private static final String TITLE_MIDDLE = "";
    private static final String TITLE_END = "</h1>";
    private static final String SUBTITLE_START = "<p class='subtitle'>";
    private static final String SUBTITLE_END = "</p>";
    private static final String IMG_START = "<img src=\"";
    private static final String IMG_END = "\" />";
    private static final String CONTENT_START = "<div class='content'>";
    private static final String CONTENT_END = "</div>";

    public BenihWebView(Context context)
    {
        super(context);
    }

    public BenihWebView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public BenihWebView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    public void loadData(String content)
    {
        content = content.replaceAll("(\r\n|\n)", "<br />");
        loadDataWithBaseURL(null, generateHtml(content), TEXT_HTML, "utf-8", null);
    }

    private String generateHtml(String content)
    {
        return CSS + BODY_START + CONTENT_START + content + CONTENT_END + BODY_END;
    }
}
