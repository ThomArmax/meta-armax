SUMMARY = "HUpnp is a software library for building UPnP devices and control points conforming to the UPnP Device Architecture version 1.1"
HOMEPAGE = "https://github.com/ThomArmax/HUPnP"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0;md5=bfccfe952269fff2b407dd11f2f3083b"

PROVIDES += "hupnp-qt5"
PV = "2.0.0"

inherit qmake5

DEPENDS = "qtbase"

SRC_URI = "git://github.com/ThomArmax/HUPnP.git;protocol=http;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/herqq"

EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_AV"
EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_AVTESTAPP"
EXTRA_QMAKEVARS_PRE += "CONFIG+=DISABLE_TESTAPP"
EXTRA_QMAKEVARS_PRE += "PREFIX=/usr"

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir} \
                   ${libdir}/libHUpnp.so \
                   ${libdir}/libQtSolutions_SOAP-2.7.so \
                  "

do_install () {
    oe_runmake INSTALL_ROOT=${D} install
}
