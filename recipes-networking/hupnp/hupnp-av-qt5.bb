SUMMARY = "Herqq UPnP A/V (HUPnPAv) is a software library for building UPnP A/V devices and control points conforming to the UPnP A/V specifications available at the UPnP Forum"
HOMEPAGE = "https://github.com/ThomArmax/HUPnP"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

PROVIDES += "hupnp-av-qt5"
PV = "0.0.2"

inherit qmake5

DEPENDS = "qtbase hupnp-qt5"

SRC_URI = "git://github.com/ThomArmax/HUPnP.git;protocol=http;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/herqq"

EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_AVTESTAPP"
EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_TESTAPP"
EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_CORE"
EXTRA_QMAKEVARS_PRE += "PREFIX=/usr"

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir} \
                   ${libdir}/libHUpnpAv.so"

do_install () {
    oe_runmake INSTALL_ROOT=${D} install
}
