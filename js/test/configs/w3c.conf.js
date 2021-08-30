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

// ============
// Capabilities
// ============
var common = {'build': 'W3C WDIO - ' + Date.now()}

var chromeLatestWin10 = {
    browserName: 'chrome',
    browserVersion: 'latest',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var chromeLateWin10 = {
    browserName: 'chrome',
    browserVersion: '92',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var chromeEarlyWin10 = {
    browserName: 'chrome',
    browserVersion: '75',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var chromeLatestWin7 = {
    browserName: 'chrome',
    browserVersion: 'latest',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var chromeLateWin7 = {
    browserName: 'chrome',
    browserVersion: '92',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var chromeEarlyWin7 = {
    browserName: 'chrome',
    browserVersion: '75',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var chromeLateYosemite = {
    browserName: 'chrome',
    browserVersion: '87',
    platformName: 'OS X 10.10',
    'sauce:options': { common
    }
}
var chromeEarlyYosemite = {
    browserName: 'chrome',
    browserVersion: '75',
    platformName: 'OS X 10.10',
    'sauce:options': { common
    }
}
var chromeLatestBigSur = {
    browserName: 'chrome',
    browserVersion: 'latest',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var chromeLateBigSur = {
    browserName: 'chrome',
    browserVersion: '92',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var chromeEarlyBigSur = {
    browserName: 'chrome',
    browserVersion: '75',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var edgeLatestWin10 = {
    browserName: 'MicrosoftEdge',
    browserVersion: 'latest',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var edgeLateWin10 = {
    browserName: 'MicrosoftEdge',
    browserVersion: '92',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var edgeEarlyWin10 = {
    browserName: 'MicrosoftEdge',
    browserVersion: '79',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var edgeLateYosemite = {
    browserName: 'MicrosoftEdge',
    browserVersion: '81',
    platformName: 'OS X 10.10',
    'sauce:options': { common
    }
}
var edgeEarlyYosemite = {
    browserName: 'MicrosoftEdge',
    browserVersion: '79',
    platformName: 'OS X 10.10',
    'sauce:options': { common
    }
}
var edgeLatestBigSur = {
    browserName: 'MicrosoftEdge',
    browserVersion: 'latest',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var edgeLateBigSur = {
    browserName: 'MicrosoftEdge',
    browserVersion: '92',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var edgeEarlyBigSur = {
    browserName: 'MicrosoftEdge',
    browserVersion: '79',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var firefoxLatestWin10 = {
    browserName: 'firefox',
    browserVersion: 'latest',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var firefoxLateWin10 = {
    browserName: 'firefox',
    browserVersion: '91',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var firefoxEarlyWin10 = {
    browserName: 'firefox',
    browserVersion: '60',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var firefoxLatestWin7 = {
    browserName: 'firefox',
    browserVersion: 'latest',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var firefoxLateWin7 = {
    browserName: 'firefox',
    browserVersion: '91',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var firefoxEarlyWin7 = {
    browserName: 'firefox',
    browserVersion: '60',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var firefoxLatestBigSur = {
    browserName: 'firefox',
    browserVersion: 'latest',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var firefoxLateBigSur = {
    browserName: 'firefox',
    browserVersion: '91',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var firefoxEarlyBigSur = {
    browserName: 'firefox',
    browserVersion: '60',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}
var ieWin10 = {
    browserName: 'internet explorer',
    browserVersion: '11',
    platformName: 'Windows 10',
    'sauce:options': { common
    }
}
var ieLateWin7 = {
    browserName: 'internet explorer',
    browserVersion: '11',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var ieEarlyWin7 = {
    browserName: 'internet explorer',
    browserVersion: '10',
    platformName: 'Windows 7',
    'sauce:options': { common
    }
}
var safariBigSur = {
    browserName: 'safari',
    browserVersion: '14',
    platformName: 'macOS 11.00',
    'sauce:options': { common
    }
}

config.capabilities = [
    chromeLatestWin10,
    chromeLateWin10,
    chromeEarlyWin10,
    chromeLatestWin7,
    chromeLateWin7,
    chromeEarlyWin7,
    chromeLateYosemite,
    chromeEarlyYosemite,
    chromeLatestBigSur,
    chromeLateBigSur,
    chromeEarlyBigSur,
    edgeLatestWin10,
    edgeLateWin10,
    edgeEarlyWin10,
    edgeLateYosemite,
    edgeEarlyYosemite,
    edgeLatestBigSur,
    edgeLateBigSur,
    edgeEarlyBigSur,
    firefoxLatestWin10,
    firefoxLateWin10,
    firefoxEarlyWin10,
    firefoxLatestWin7,
    firefoxLateWin7,
    firefoxEarlyWin7,
    firefoxLatestBigSur,
    firefoxLateBigSur,
    firefoxEarlyBigSur,
    ieWin10,
    ieLateWin7,
    ieEarlyWin7,
    safariBigSur
];

config.services = config.services.concat('sauce');

exports.config = config;
