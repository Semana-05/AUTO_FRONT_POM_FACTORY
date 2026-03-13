#author: Matias Nuñez
#language: en
Feature: Filter ticket for priority

  @FilterTicketForPriorityMedium
  Scenario: Filter ticket for selected priority
    Given the operator is in view ticket window
    When select priority "MEDIUM"
    Then only show tickets from priority "Media"