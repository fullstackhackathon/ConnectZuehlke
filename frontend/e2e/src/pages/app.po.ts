import {browser, by, element} from 'protractor';
import {ToolbarFragment} from '../fragments/toolbar.fragment';
import {SidebarFragment} from '../fragments/sidebar.fragment';
import {EmployeeListPo} from './employeeList.po';

export class AppPage {
  private toolbarFragment = new ToolbarFragment();
  private sidebarFragment = new SidebarFragment();
  private employeeListPage = new EmployeeListPo();

  navigateTo() {
    return browser.get(browser.baseUrl) as Promise<any>;
  }

  getTitleText() {
    return element(by.css('app-root h1')).getText() as Promise<string>;
  }

  toolbar() {
    return this.toolbarFragment;
  }

  sidebar() {
    return this.sidebarFragment;
  }

  employeeList() {
    return this.employeeListPage;
  }
}
