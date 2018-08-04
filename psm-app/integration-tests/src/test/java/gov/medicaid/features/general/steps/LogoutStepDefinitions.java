/*
 * Copyright 2018 The MITRE Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gov.medicaid.features.general.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.medicaid.features.general.ui.AllEnrollmentsPage;
import gov.medicaid.features.general.ui.LoginPage;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("unused")
public class LogoutStepDefinitions {
    @Steps
    GeneralSteps generalSteps;

    // These properties are set by serenity at test time.
    private LoginPage loginPage;
    private AllEnrollmentsPage allEnrollmentsPage;

    @Given("I am logged in as a provider$")
    public void i_am_logged_in_as_a_provider() {
        generalSteps.login("p1", "p1");
    }

    @When("^I click on Logout$")
    public void clickLogout() {
        allEnrollmentsPage.logout();
    }

    @Then("^I should see the login page$")
    public void checkLogout() {
        loginPage.checkUserLoggedOut();
    }

}
