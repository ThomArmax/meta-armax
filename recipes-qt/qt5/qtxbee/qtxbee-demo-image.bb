DESCRIPTION = "A console-only with QtXBee temperature monitor demo installed"

# customize IMAGE_FEATURES as follows
IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-openssh \
    "
  
# packagegroup-core-tools-profile will build and install tracing and profiling tools to the target image.
# packagegroup-core-buildessential will build and install autotools, gcc, etc. to the target image.
# kernel-modules for install of the kernel modules.
# kernel-devsrc for building out of tree modules.
# IMAGE_ROOTFS_EXTRA_SPACE_append for adding extra space to the target rootfs image.

# customize IMAGE_INSTALL as follows
IMAGE_INSTALL = "\
    packagegroup-core-boot \
    kernel-modules \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    qtxbee-examples \
    qtxbee-temp-monitor-init-script \
    kernel-module-ftdi-sio \
    "
inherit core-image

# Add extra space to the rootfs image
IMAGE_ROOTFS_EXTRA_SPACE:append:qtxbee-demo-image += "+ 30000"
