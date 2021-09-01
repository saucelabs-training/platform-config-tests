describe('Mobile App Test', () => {
    it('Opens App', async () => {
        await $('~test-Login').waitForDisplayed();
    });
});
