# Autor: Andres
@stories
Feature: Challenge choucair
  As a use, I want to learn how to automate in screamplay at the choucair challenge with the automation course
  @scenario
  Scenario: Search for automation course
    Given than brandon wants to learns automation at the academy Choucair
      | strFirstName | strLastName |  | strEmail | | strMonth | | strDay |  | strYear |  | strSpoken |
      | <strFirstName> | <strLastName> |  | <strEmail> | | <strMonth> |  | <strDay> | | <strYear> |   | <strSpoken> |
    When he search for the course Recursos Automation Bancolombia on the choucair academy platform
      | strCity | strZip |  | strCountry |  | strComputer | strLanguage |  | strVersion | | strMobileDevices | | strModel |  | strSystem |
       | <strCity> | <strZip> |  | <strCountry> | | <strComputer> | <strLanguage> |  | <strVersion> | | <strMobileDevices> |  | <strModel> | | <strSystem> |

    Then he finds the course called resources Recursos Automation Bancolombiax
      | strPassword  |   | strConfirmPassword  |
      | <strPassword>|  | <strConfirmPassword>|

    Examples:
      | strFirstName | strLastName || strEmail  |   | strMonth | strDay || strYear  | | strSpoken  |    | strCity | strZip || strCountry  | | strComputer | strVersion  | | strLanguage | | strMobileDevices | strModel || strSystem  |   | strPassword | strConfirmPassword |
      | Andres| Bedoya | | andres.acedl@gmail.com | | December| 15 | | 1995 | | English| San Antonio de Prado | | 050029| | Colombia| Windows | | 10| | 1128461654| Spanish | | Nokia | | N73| Symbia OS 6.0 | | Contraseña123@__123| | Contraseña123@__123|
