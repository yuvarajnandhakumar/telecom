Feature: telecom site

  Background: 
    Given Launch chrome

  #@listconcept
  #Scenario: onedimlist and two dim list
  #Then user enter firstname
  #| yuvaraj | sathana | karikalan |
  #And user enter email
  #| yuvaraj@gmail.com | yuvaraj1@gmail.com |
  #| yuvaraj@yahoo.com |                    |
  #| yuvaraj@live.com  |                    |
  #And close chrome
  @mapconcept
  Scenario: onedimmap and twodimmap
    Then user enter firstname
      | fname | bhuvanesh |
      | lname | kumar     |
    And user enter email
      | email               | lname  |
      | bhuvanesh@gmail.com | kumar  |
      | bhuvanesh@yahoo.com | kumaar |
    And close chrome

  @outline
  Scenario Outline: onedimmap and twodimmap
    Then user enter firstname "<firstname>"
    And user enter lastname "<lastname>","<email>"
    And close chrome

    Examples: 
      | firstname | lastname    | email               |
      | yuvaraj   | nandhakumar | yuvaraj@gmail.com   |
      | yuvaraj   | nandhakumar | yuvarajgmail.com    |
      | sathana   | shree       | sathana@gmail.com   |
      | bhuvanesh | kumar       | bhuvanesh@gmail.com |
