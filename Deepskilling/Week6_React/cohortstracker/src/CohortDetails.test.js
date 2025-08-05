import React from 'react';
import { mount, shallow } from 'enzyme';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';

describe("Cohort Details Component", () => {
  // Test 1
  test("should create the component", () => {
    const wrapper = shallow(<CohortDetails />);
    expect(wrapper.exists()).toBe(true);
  });

  // Test 2
  test("should initialize the props", () => {
    const cohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={cohort} />);
    expect(wrapper.props().cohort).toEqual(cohort);
  });

  // Test 3
  test("should display cohort code in h3", () => {
    const cohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={cohort} />);
    expect(wrapper.find('h3').text()).toContain(cohort.code);
  });

  // Test 4 (Snapshot test)
  test("should always render same html", () => {
    const cohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={cohort} />);
    expect(wrapper.html()).toMatchSnapshot();
  });
});
