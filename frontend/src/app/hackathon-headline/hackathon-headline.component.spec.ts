import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {HackathonHeadlineComponent} from './hackathon-headline.component';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';

describe('HackathonHeadlineComponent', () => {
  let component: HackathonHeadlineComponent;
  let fixture: ComponentFixture<HackathonHeadlineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [HackathonHeadlineComponent],
      imports: [
        FontAwesomeModule,
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HackathonHeadlineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it(`should have as title 'Zühlke Connect'`, () => {
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('Zühlke Connect');
  });

  it('should render title in a h1 tag', () => {
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to Zühlke Connect!');
  });
});
