describe('Simple Test', () => {
    it('Navigates', () => {
        browser.url('http://google.com')
        expect(browser.getTitle()).toEqual(
            'Google',
            'Wrong Page Title',
        );
    });
});
