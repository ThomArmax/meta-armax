SUMMARY = "Init script for QtXBee temperature monitor demo"
HOMEPAGE = "https://github.com/ThomArmax/QtXBee"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS:append:qtxbee-temp-monitor-init-script := "${THISDIR}/files"

SRC_URI = "file://temp-monitor.sh"

RDEPENDS:qtxbee-temp-monitor-init-script = " \
    qtxbee-examples \
    bash \
    procps \
    "

inherit update-rc.d

INITSCRIPT_PACKAGES = "qtxbee-temp-monitor-init-script"
INITSCRIPT_NAME:qtxbee-temp-monitor-init-script = "temp-monitor.sh"
INITSCRIPT_PARAMS:qtxbee-temp-monitor-init-script = "defaults 98 02"

do_install() {
    install -d ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/temp-monitor.sh ${D}${sysconfdir}/init.d
}
