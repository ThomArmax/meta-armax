SUMMARY = "QtArmax is an addons project for Qt5"
HOMEPAGE = "https://github.com/ThomArmax/QtArmax"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0;md5=bfccfe952269fff2b407dd11f2f3083b"

PROVIDES = "qt-armax"

inherit qmake5

DEPENDS = "qtbase qtquick1 qtdeclarative"
RDEPENDS_${PN} = "qtquick1 qtdeclarative"

SRC_URI = "git://github.com/ThomArmax/QtArmax.git;protocol=http;branch=develop"
SRCREV = "${AUTOREV}"

FILES_${PN}_append = " \
    ${libdir}/qt5/qml/com/armax/controls \
    ${libdir}/qt5/qml/com/armax/datamodels \
    ${libdir}/qt5/qml/com/armax/styles \
    "

FILES_${PN}-dbg_append = " \
    ${libdir}/qt5/qml/com/armax/controls/.debug/* \
    ${libdir}/qt5/qml/com/armax/datamodels/.debug/* \
    ${libdir}/qt5/qml/com/armax/styles/.debug/* \
    "

S = "${WORKDIR}/git/src"
