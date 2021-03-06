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

package gov.medicaid.features.general.ui;

import gov.medicaid.features.PsmPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AllApplicationsPage extends PsmPage {
    public void clickOnNewApplication() {
        click($("#createNewApplication"));
        assertThat(getTitle()).isEqualTo("Provider Type Page");
    }

    public void selectProviderType(String aProviderType) {
        $("[name=_01_providerType]").selectByVisibleText(aProviderType);
    }

    public void clickNext() {
        click($(".nextBtn"));
    }

    public void logout() {
        click($(".logoutButton"));
    }

    public void clickMyProfile() {
        click($("#my_profile_tab"));
    }

    public void checkOnAllApplicationsPage() {
        assertThat(getTitle()).isEqualTo("All Applications");
    }

    public void quickSearch(String npi) {
        $(".quickSearchNpi").sendKeys(npi);
        $(".quickSearchForm").submit();
    }
}
