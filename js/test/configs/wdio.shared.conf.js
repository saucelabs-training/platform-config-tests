exports.config = {
    // ====================
    // Runner Configuration
    // ====================
    runner: 'local',
    // ============
    // Capabilities
    // ============
    maxInstances: 20,
    // capabilities can be found in `wdio.sauce.conf.js`
    // ===================
    // Test Configurations
    // ===================
    logLevel: 'silent',
    bail: 0,
    baseUrl: 'http://google.com',
    waitforTimeout: 10000,
    connectionRetryTimeout: 90000,
    connectionRetryCount: 3,
    framework: 'jasmine',
    reporters: ['spec'],
    jasmineOpts: {
        defaultTimeoutInterval: 60000,
    },
    services: []
};
