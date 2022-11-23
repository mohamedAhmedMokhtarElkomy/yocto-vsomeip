DESCRIPTION= "vsomeip libraries recipe"
LICENSE="CLOSED"
DEPENDS ="boost"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/COVESA/vsomeip.git;protcol=https;branch=master"

S="${WORKDIR}/git"

inherit cmake 


FILES_${PN}+="/usr/etc/*"
FILES_${PN}-dev+="/usr/etc/*"


