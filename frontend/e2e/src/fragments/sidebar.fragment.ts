import {by, element, ElementFinder} from 'protractor';

export class SidebarFragment {

  private root: ElementFinder;
  private rootSelector = by.css('[data-id="sidebar"]');

  constructor() {
    this.root = element(this.rootSelector);
  }

  isDisplayed() {
    return this.root.isDisplayed()
  }

  clickOn(linkText: string) {
    this.root.element(by.linkText(linkText)).click();
  }
}
