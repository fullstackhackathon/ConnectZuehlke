import {browser, by, element, ElementFinder} from 'protractor';

export class EmployeeListPo {
  private rootSelector = by.css('[data-id="employee-list"]')
  private root: ElementFinder;

  constructor() {
    this.root = element(this.rootSelector);
  }

  navigateTo() {
    return browser.get(`${browser.baseUrl}/employees`) as Promise<any>;
  }

  isDisplayed() {
    return this.root.isDisplayed();
  }
}
