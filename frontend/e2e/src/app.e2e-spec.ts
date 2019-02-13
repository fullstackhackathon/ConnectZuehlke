import {AppPage} from './pages/app.po';
import {browser, logging} from 'protractor';

describe('Main App Page', () => {
  let appPage: AppPage;

  beforeEach(() => {
    appPage = new AppPage();
  });

  it('should display welcome message', () => {
    appPage.navigateTo();
    expect(appPage.getTitleText()).toEqual('Welcome to Zühlke Connect!');
  });

  it('should show sidebar when clicking on navigation header', () => {
    appPage.navigateTo();
    expect(appPage.sidebar().isDisplayed()).toBeFalsy();
    appPage.toolbar().toggleSidebar();
    expect(appPage.sidebar().isDisplayed()).toBeTruthy();
  });

  it('should go to employees list', () => {
    appPage.navigateTo();
    appPage.toolbar().toggleSidebar();
    expect(appPage.sidebar().isDisplayed()).toBeTruthy();

    appPage.sidebar().clickOn("Employees");
    const employeeListPage = appPage.employeeList();

    expect(employeeListPage.isDisplayed()).toBeTruthy();
  });


  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    }));
  });
});
