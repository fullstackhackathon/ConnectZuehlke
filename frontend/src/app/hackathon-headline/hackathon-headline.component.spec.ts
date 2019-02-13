import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {HackathonHeadlineComponent} from './hackathon-headline.component';

describe('HackathonHeadlineComponent', () => {
  let component: HackathonHeadlineComponent;
  let fixture: ComponentFixture<HackathonHeadlineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [HackathonHeadlineComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HackathonHeadlineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
