SUMMARY = "QtArmax is an addons project for Qt5"
HOMEPAGE = "https://github.com/ThomArmax/QtXBee"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

PROVIDES = "qtxbee"

inherit qmake5

FILESEXTRAPATHS_append := "${THISDIR}/files"

DEPENDS = "qtbase qtserialport"
RDEPENDS_${PN} = "qtserialport qtdeclarative"

SRC_URI = " \
    git://github.com/ThomArmax/QtXbee.git;protocol=http;branch=develop \
    file://QA-Issue.patch"

SRCREV = "${AUTOREV}"

PACKAGES += " ${PN}-examples ${PN}-examples-dbg"

FILES_${PN}-examples = " \
    /opt/example_temp_monitor/bin/example_temp_monitor \
    "

FILES_${PN}-examples-dbg = " \
    /opt/example_temp_monitor/bin/.debug \
    /opt/example_temp_monitor/bin/.debug/example_temp_monitor \
    "

S = "${WORKDIR}/git"
