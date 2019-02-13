import {by, element, ElementFinder} from 'protractor';

export class ToolbarFragment {
  private root: ElementFinder;
  private sidebarToggleSelector = by.css('[data-id="toggle-sidebar"]');
  private rootSelector = by.css('app-topbar mat-toolbar');

  constructor() {
    this.root = element(this.rootSelector);
  }

  toggleSidebar() {
    return this.getToggleSidebarButton().click();
  }

  private getToggleSidebarButton() {
    return this.root.element(this.sidebarToggleSelector);
  }
}
