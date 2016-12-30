SUMMARY = "Init script for QtXBee temperature monitor demo"
HOMEPAGE = "https://github.com/ThomArmax/QtXBee"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_append := "${THISDIR}/files"

SRC_URI = "file://temp-monitor.sh"

RDEPENDS_${PN} = " \
    qtxbee-examples \
    bash \
    procps \
    "

inherit update-rc.d

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "temp-monitor.sh"
INITSCRIPT_PARAMS_${PN} = "defaults 98 02"

do_install() {
    install -d ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/temp-monitor.sh ${D}${sysconfdir}/init.d
}
