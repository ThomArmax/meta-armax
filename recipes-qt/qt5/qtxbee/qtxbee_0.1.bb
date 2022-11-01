SUMMARY = "QtXBee is a library based on Qt5 for XBee modules"
HOMEPAGE = "https://github.com/ThomArmax/QtXBee"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0-or-later;md5=c51d3eef3be114124d11349ca0d7e117"

PROVIDES = "qtxbee"

inherit qmake5

FILESEXTRAPATHS:append:${PN} := "${THISDIR}/files"

DEPENDS = "qtbase qtdeclarative qtserialport"
RDEPENDS:${PN} = "qtserialport qtdeclarative"
RDEPENDS:${PN}-examples = "qtbase"

SRC_URI = " \
    git://github.com/ThomArmax/QtXbee.git;protocol=http;branch=develop \
    file://QA-Issue.patch"

SRCREV = "${AUTOREV}"

PACKAGES += " ${PN}-examples ${PN}-examples-dbg"

FILES:${PN}-examples = " \
    /opt/example_temp_monitor/bin/example_temp_monitor \
    "

FILES:${PN}-examples-dbg = " \
    /opt/example_temp_monitor/bin/.debug \
    /opt/example_temp_monitor/bin/.debug/example_temp_monitor \
    "

S = "${WORKDIR}/git"
