$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("digitalPulseWebPage.feature");
formatter.feature({
  "line": 1,
  "name": "PWC Digital Pulse Tests",
  "description": " Description: PWC Digital Pulse Website Validations",
  "id": "pwc-digital-pulse-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1400386687,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Home Page Contents",
  "description": "",
  "id": "pwc-digital-pulse-tests;validate-home-page-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am viewing the ‘Home’ page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am presented with a carousel displaying 3 featured articles",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicking the ‘Next’ button on the carousel will load the next 3 featured articles",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Clicking the ‘Previous’ button on the carousel will load the previous 3 featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToThePwCDigitalPulseWebsite()"
});
formatter.result({
  "duration": 2579493294,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmViewingTheHomePage()"
});
formatter.result({
  "duration": 58295825,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmPresentedWithACarouselDisplayingFeaturedArticles()"
});
formatter.result({
  "duration": 655507468,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clickingTheNextButtonOnTheCarouselWillLoadTheNextFeaturedArticles()"
});
formatter.result({
  "duration": 711348536,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.clickingThePreviousButtonOnTheCarouselWillLoadThePreviousFeaturedArticles()"
});
formatter.result({
  "duration": 688035029,
  "status": "passed"
});
formatter.after({
  "duration": 66224,
  "status": "passed"
});
formatter.after({
  "duration": 183544145,
  "status": "passed"
});
formatter.before({
  "duration": 940537272,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate Contact Us hamburger menu",
  "description": "",
  "id": "pwc-digital-pulse-tests;validate-contact-us-hamburger-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select ‘Contact us’ from the hamburger menu Then I am taken to the ‘Contact us’ page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I am presented with the below options for contacts",
  "rows": [
    {
      "cells": [
        "Heading",
        "Contact Link"
      ],
      "line": 15
    },
    {
      "cells": [
        "PwC Digital Services",
        "https://digital.pwc.com/en/contact-us.html"
      ],
      "line": 16
    },
    {
      "cells": [
        "Digital Pulse editorial team",
        ""
      ],
      "line": 17
    },
    {
      "cells": [
        "Careers at PwC",
        "https://www.pwc.com/gx/en/careers.html"
      ],
      "line": 18
    },
    {
      "cells": [
        "General enquiries",
        "https://www.pwc.com/gx/en.html"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToThePwCDigitalPulseWebsite()"
});
formatter.result({
  "duration": 2955513164,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsPageSteps.iSelectContactUsFromTheHamburgerMenuThenIAmTakenToTheContactUsPage()"
});
formatter.result({
  "duration": 1298030373,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsPageSteps.iAmPresentedWithTheBelowOptionsForContacts(DataTable)"
});
formatter.result({
  "duration": 156640933,
  "status": "passed"
});
formatter.after({
  "duration": 27903,
  "status": "passed"
});
formatter.after({
  "duration": 161726558,
  "status": "passed"
});
formatter.before({
  "duration": 967681221,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate Search Page",
  "description": "",
  "id": "pwc-digital-pulse-tests;validate-search-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on the ‘Magnifying glass’ icon to perform a search And I enter the text \"Single page applications\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I am presented with at least 1 search result",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iNavigateToThePwCDigitalPulseWebsite()"
});
formatter.result({
  "duration": 2945256751,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single page applications",
      "offset": 81
    }
  ],
  "location": "SearchPageSteps.iClickOnTheMagnifyingGlassIconToPerformASearchAndIEnterTheText(String)"
});
formatter.result({
  "duration": 378696112,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.iSubmitTheSearch()"
});
formatter.result({
  "duration": 1275585021,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.iAmTakenToTheSearchResultsPage()"
});
formatter.result({
  "duration": 41758093,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.iAmPresentedWithAtLeastSearchResult()"
});
formatter.result({
  "duration": 34856635,
  "status": "passed"
});
formatter.after({
  "duration": 54133,
  "status": "passed"
});
formatter.after({
  "duration": 163435807,
  "status": "passed"
});
});