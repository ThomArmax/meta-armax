SUMMARY = "QtArmax is an addons project for Qt5"
HOMEPAGE = "https://github.com/ThomArmax/QtArmax"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=75a04931b94d7a24050ded74ab3cf0c2"

PROVIDES = "qt-armax"

inherit qmake5

DEPENDS = "qtbase qtdeclarative"
RDEPENDS:${PN} = "qtdeclarative"

SRC_URI = "git://github.com/ThomArmax/QtArmax.git;protocol=http;branch=develop"
SRCREV = "${AUTOREV}"

FILES:${PN} += " \
    ${libdir}/qml/com/armax/QtArmaxPlugin.qmltypes \
    ${libdir}/qml/com/armax/qmldir \
    ${libdir}/qml/com/armax/libQtArmaxPlugin.so \
    ${libdir}/qml/com/armax/controls/qmldir \
    ${libdir}/qml/com/armax/controls/libQtArmaxControlsPlugin.so \
    ${libdir}/qml/com/armax/controls/QtArmaxControlsPlugin.qmltypes \
    ${libdir}/qml/com/armax/datamodels/qmldir \
    ${libdir}/qml/com/armax/datamodels/libQtArmaxDatamodelsPlugin.so \
    ${libdir}/qml/com/armax/datamodels/QtArmaxDatamodelsPlugin.qmltypes \
    ${libdir}/qml/com/armax/styles/qmldir \
    ${libdir}/qml/com/armax/styles/QtArmaxStylesPlugin.qmltypes \
    ${libdir}/qml/com/armax/styles/libQtArmaxStylesPlugin.so \
    "

FILES:${PN}-dbg = " \
    ${libdir}/qml/com/armax/controls/.debug/* \
    ${libdir}/qml/com/armax/datamodels/.debug/* \
    ${libdir}/qml/com/armax/styles/.debug/* \
    "

S = "${WORKDIR}/git/src"
