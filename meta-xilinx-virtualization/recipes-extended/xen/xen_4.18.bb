# tag: RELEASE-4.18.0
SRCREV ?= "7cb7aac7f570757b67bcd43aec67e0cda9f58b14"

XEN_URI ?= "git://xenbits.xen.org/xen.git"
XEN_REL ?= "4.18"
XEN_BRANCH ?= "stable-4.18"

SRC_URI = " \
    ${XEN_URI};branch=${XEN_BRANCH} \
    file://0001-menuconfig-mconf-cfg-Allow-specification-of-ncurses-location.patch \
    "

LIC_FILES_CHKSUM ?= "file://COPYING;md5=d1a1e216f80b6d8da95fec897d0dbec9"

S = "${WORKDIR}/git"

require xen.inc
require xen-hypervisor.inc
