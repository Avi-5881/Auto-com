$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "End to End Functional Test",
  "description": "Product search and purchase from amazon.com\r\nUser wants to search for Product and purchase from amazon.com\r\nValidation criteria : User should be logged in to check out the product",
  "id": "end-to-end-functional-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he search for \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 15,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;1"
    },
    {
      "cells": [
        "hp laptop"
      ],
      "line": 16,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2"
    },
    {
      "cells": [
        "hp laptop"
      ],
      "line": 17,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he search for \"hp laptop\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 10774178400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_submit_username_and_password()"
});
formatter.result({
  "duration": 2381408600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hp laptop",
      "offset": 15
    }
  ],
  "location": "Steps.heSearchFor(String)"
});
formatter.result({
  "duration": 2822437500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.chooseToBuyTheFirstItem()"
});
formatter.result({
  "duration": 2371629800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.addsProductToShoppingCart()"
});
formatter.result({
  "duration": 3165033700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userClicksOnProceedCheckOut()"
});
formatter.result({
  "duration": 9462316300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he submit username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he search for \"hp laptop\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 8401019900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.he_submit_username_and_password()"
});
formatter.result({
  "duration": 2426030600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hp laptop",
      "offset": 15
    }
  ],
  "location": "Steps.heSearchFor(String)"
});
formatter.result({
  "duration": 2504352200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.chooseToBuyTheFirstItem()"
});
formatter.result({
  "duration": 2621973400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.addsProductToShoppingCart()"
});
formatter.result({
  "duration": 4530837200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userClicksOnProceedCheckOut()"
});
formatter.result({
  "duration": 7842076400,
  "status": "passed"
});
});