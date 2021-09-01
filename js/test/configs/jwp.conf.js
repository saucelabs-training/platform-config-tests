const {config} = require('./wdio.shared.conf');

// =========================
// Sauce RDC specific config
// =========================
config.user = process.env.SAUCE_USERNAME;
config.key = process.env.SAUCE_ACCESS_KEY;
// If you run your tests on Sauce Labs you can specify the region you want to run your tests
// in via the `region` property. Available short handles for regions are `us` (default) and `eu`.
// These regions are used for the Sauce Labs VM cloud and the Sauce Labs Real Device Cloud.
// If you don't provide the region, it defaults to `us`.
config.region = process.env.REGION || 'us';

config.specs = ['./test/specs/web.spec.js']

// ============
// Capabilities
// ============
common = {'build': 'Legacy WDIO - ' + Date.now()}

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
chromeLatestWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = '92';
chromeLateWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 10';
caps['version'] = '26';
chromeEarlyWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
edgeLatestWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = '92';
edgeLateWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'Windows 10';
caps['version'] = '13';
edgeEarlyWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = 'latest';
firefoxLatestWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = '91';
firefoxLateWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 10';
caps['version'] = '32'; // Sated: 4
firefoxEarlyWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 10';
caps['version'] = '11';
ieWin10 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = 'latest';
chromeLatestWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = '92';
chromeLateWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Windows 7';
caps['version'] = '26';
chromeEarlyWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = 'latest';
firefoxLatestWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = '91';
firefoxLateWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Windows 7';
caps['version'] = '32'; // Stated: 4
firefoxEarlyWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 7';
caps['version'] = '11';
ieLateWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'internet explorer';
caps['platform'] = 'Windows 7';
caps['version'] = '9';
ieEarlyWin7 = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Linux';
caps['version'] = '48';
chromeLateLinux = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'Linux';
caps['version'] = '26';
chromeEarlyLinux = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Linux';
caps['version'] = '45';
firefoxLateLinux = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'Linux';
caps['version'] = '32'; // Stated: 4
firefoxEarlyLinux = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'OS X 10.10';
caps['version'] = '87';
chromeLateYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'OS X 10.10';
caps['version'] = '37';
chromeEarlyYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'OS X 10.10';
caps['version'] = '81';
edgeLateYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'OS X 10.10';
caps['version'] = '79';
edgeEarlyYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'OS X 10.10';
caps['version'] = '47';
firefoxLateYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'OS X 10.10';
caps['version'] = '32';
firefoxEarlyYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'safari';
caps['platform'] = 'OS X 10.10';
caps['version'] = '8';
safariYosemite = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
chromeLatestBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = '92';
chromeLateBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'chrome';
caps['platform'] = 'macOS 11.00';
caps['version'] = '69';
chromeEarlyBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
edgeLatestBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = '92';
edgeLateBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'MicrosoftEdge';
caps['platform'] = 'macOS 11.00';
caps['version'] = '79';
edgeEarlyBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = 'latest';
firefoxLatestBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = '91';
firefoxLateBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'Firefox';
caps['platform'] = 'macOS 11.00';
caps['version'] = '60';
firefoxEarlyBigSur = {...caps, ...common};

caps = {};
caps['browserName'] = 'safari';
caps['platform'] = 'macOS 11.00';
caps['version'] = '14';
safariBigSur = {...caps, ...common};

config.capabilities = [
    chromeLatestWin10,
    chromeLateWin10,
    chromeEarlyWin10,
    edgeLatestWin10,
    edgeLateWin10,
    edgeEarlyWin10,
    firefoxLatestWin10,
    firefoxLateWin10,
    firefoxEarlyWin10,
    ieWin10,
    chromeLatestWin7,
    chromeLateWin7,
    chromeEarlyWin7,
    firefoxLatestWin7,
    firefoxLateWin7,
    firefoxEarlyWin7,
    ieLateWin7,
    ieEarlyWin7,
    chromeLateLinux,
    chromeEarlyLinux,
    firefoxLateLinux,
    firefoxEarlyLinux,
    chromeLateYosemite,
    chromeEarlyYosemite,
    edgeLateYosemite,
    edgeEarlyYosemite,
    firefoxLateYosemite,
    firefoxEarlyYosemite,
    safariYosemite,
    chromeLatestBigSur,
    chromeLateBigSur,
    chromeEarlyBigSur,
    edgeLatestBigSur,
    edgeLateBigSur,
    edgeEarlyBigSur,
    firefoxLatestBigSur,
    firefoxLateBigSur,
    firefoxEarlyBigSur,
    safariBigSur
];

config.services = config.services.concat('sauce');

exports.config = config;
