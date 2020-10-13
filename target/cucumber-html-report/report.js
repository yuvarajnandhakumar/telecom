$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Feature/telecom.feature");
formatter.feature({
  "name": "telecom site",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "teleconsteps.launch_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "onedimmap and twodimmap",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mapconcept"
    }
  ]
});
formatter.step({
  "name": "user enter firstname",
  "rows": [
    {
      "cells": [
        "fname",
        "bhuvanesh"
      ]
    },
    {
      "cells": [
        "lname",
        "kumar"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "teleconsteps.user_enter_firstname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email",
  "rows": [
    {
      "cells": [
        "email",
        "lname"
      ]
    },
    {
      "cells": [
        "bhuvanesh@gmail.com",
        "kumar"
      ]
    },
    {
      "cells": [
        "bhuvanesh@yahoo.com",
        "kumaar"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "teleconsteps.user_enter_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close chrome",
  "keyword": "And "
});
formatter.match({
  "location": "teleconsteps.close_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});