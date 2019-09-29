# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
#   conda/_vendor/tqdm/LICENSE
#   conda/_vendor/boltons/LICENSE
#   conda/_vendor/auxlib/LICENSE
#   conda/_vendor/toolz/LICENSE.txt
#   conda/_vendor/urllib3/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/cheroot-6.4.0.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/Django-2.1.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/zope.interface-4.5.0.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pyasn1-0.4.4.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/idna-2.7.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pyasn1_modules-0.2.2.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/requests-2.19.1.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/CherryPy-17.2.0.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/Babel-2.6.0.dist-info/LICENSE.txt
#   test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/urllib3-1.23.dist-info/LICENSE.txt
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=61fd3ef748e4abe385e34779f875546b \
                    file://conda/_vendor/tqdm/LICENSE;md5=2f8c07ee459b9e48989cdd07d4577600 \
                    file://conda/_vendor/boltons/LICENSE;md5=6076e590433e0b8b0aeef783ca12a7b5 \
                    file://conda/_vendor/auxlib/LICENSE;md5=c09a1235f801e1494fca9ac88102cd86 \
                    file://conda/_vendor/toolz/LICENSE.txt;md5=ca09cab178326d18433aae982d1edf5d \
                    file://conda/_vendor/urllib3/LICENSE.txt;md5=ea114851ad9a8c311aac8728a681a067 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/cheroot-6.4.0.dist-info/LICENSE.txt;md5=beeffd9dfcc746ed5a91921f1acc2746 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/py-1.6.0.dist-info/LICENSE.txt;md5=a6bb0320b04a0a503f12f69fea479de9 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/Django-2.1.dist-info/LICENSE.txt;md5=f09eb47206614a4954c51db8a94840fa \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/zope.interface-4.5.0.dist-info/LICENSE.txt;md5=78ccb3640dc841e1baecb3e27a6966b2 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pyasn1-0.4.4.dist-info/LICENSE.txt;md5=815ac3f9ca693006349094b358ab3155 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pyOpenSSL-18.0.0.dist-info/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/portend-2.3.dist-info/LICENSE.txt;md5=a33f38bbf47d48c70fe0d40e5f77498e \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/idna-2.7.dist-info/LICENSE.txt;md5=782775b32f96098512e283fb5d4546cd \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pytz-2018.5.dist-info/LICENSE.txt;md5=4878a915709225bceab739bdc2a18e8d \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pyasn1_modules-0.2.2.dist-info/LICENSE.txt;md5=815ac3f9ca693006349094b358ab3155 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/requests-2.19.1.dist-info/LICENSE.txt;md5=bfbeafb85a2cee261510d65d5ec19156 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/entrypoints-0.2.3.dist-info/LICENSE;md5=b6f7f5bd22a5dc0397c806c4e5f8cbd3 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/CherryPy-17.2.0.dist-info/LICENSE.txt;md5=beeffd9dfcc746ed5a91921f1acc2746 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/pluggy-0.7.1.dist-info/LICENSE.txt;md5=338dad807ed9337bfaeb9979c3bfe20f \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/attrs-18.1.0.dist-info/LICENSE.txt;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/Babel-2.6.0.dist-info/LICENSE.txt;md5=eebdc057dc12abcc2d6c4453628bfcd4 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/backports.functools_lru_cache-1.5.dist-info/LICENSE.txt;md5=a33f38bbf47d48c70fe0d40e5f77498e \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/tempora-1.13.dist-info/LICENSE.txt;md5=a33f38bbf47d48c70fe0d40e5f77498e \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/jaraco.functools-1.20.dist-info/LICENSE.txt;md5=a33f38bbf47d48c70fe0d40e5f77498e \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/urllib3-1.23.dist-info/LICENSE.txt;md5=ea114851ad9a8c311aac8728a681a067 \
                    file://test_data/env_metadata/py36-osx-whl/lib/python3.6/site-packages/keyring-13.2.1.dist-info/LICENSE.txt;md5=a33f38bbf47d48c70fe0d40e5f77498e"

FILESEXTRAPATHS_append := ":${THISDIR}/example"

SRC_URI = "https://github.com/conda/conda/archive/4.7.12.tar.gz;branch=4.7.12 \
file://examplecondasetuppy.patch"

SRC_URI[md5sum] = "6e6b7f101b88bebb1f31e755ce27fe78"
SRC_URI[sha256sum] = "a1756b697af8416b75d1ebdeabf10f1f45fdd3955963af56b6acf3f745edb0a2"

S = "${WORKDIR}/conda-4.7.12"

inherit setuptools

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-core"

python do_patch() {
    bb.build.exec_func('patch_do_patch', d)
}

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    ConfigParser
#    Crypto.Cipher
#    StringIO
#    UserDict
#    UserList
#    __builtin__
#    __future__
#    _winreg
#    abc
#    argparse
#    ast
#    base64
#    binstar_client
#    binstar_client.utils
#    bisect
#    boto
#    boto3
#    botocore.exceptions
#    bz2
#    cPickle
#    cgi
#    chardet
#    codecs
#    collections
#    collections.abc
#    colorama
#    concurrent.futures
#    concurrent.futures.thread
#    conda_build
#    conda_package_handling.api
#    configparser
#    contextlib
#    copy
#    csv
#    ctypes
#    ctypes.util
#    ctypes.wintypes
#    cytoolz
#    cytoolz.dicttoolz
#    cytoolz.functoolz
#    cytoolz.itertoolz
#    datetime
#    difflib
#    distutils.command.build_py
#    distutils.command.sdist
#    distutils.spawn
#    distutils.sysconfig
#    distutils.util
#    doctest
#    email.parser
#    email.utils
#    enum
#    fnmatch
#    ftplib
#    functools
#    genericpath
#    getpass
#    glob
#    hashlib
#    heapq
#    hmac
#    imp
#    importlib
#    importlib.machinery
#    importlib.util
#    inspect
#    io
#    json
#    locale
#    logging
#    menuinst
#    menuinst.knownfolders
#    menuinst.win32
#    menuinst.winshortcut
#    mimetypes
#    mmap
#    mock
#    multiprocessing
#    multiprocessing.forking
#    multiprocessing.popen_fork
#    multiprocessing.popen_spawn_win32
#    nbformat
#    ntpath
#    numbers
#    operator
#    ordereddict
#    os
#    os.environ
#    pandas
#    pandas.core.frame
#    pandas.core.groupby
#    pandas.core.series
#    pexpect.popen_spawn
#    pickle
#    pip._vendor.requests
#    pip._vendor.requests.adapters
#    pip._vendor.requests.auth
#    pip._vendor.requests.cookies
#    pip._vendor.requests.exceptions
#    pip._vendor.requests.hooks
#    pip._vendor.requests.models
#    pip._vendor.requests.packages.chardet
#    pip._vendor.requests.packages.urllib3.exceptions
#    pip._vendor.requests.structures
#    pip._vendor.requests.utils
#    pkg_resources
#    platform
#    posixpath
#    pprint
#    py
#    pycosat
#    pycryptosat
#    pysat.solvers
#    pytest
#    random
#    re
#    requests
#    requests.adapters
#    requests.auth
#    requests.cookies
#    requests.exceptions
#    requests.hooks
#    requests.models
#    requests.packages.chardet
#    requests.packages.urllib3.exceptions
#    requests.structures
#    requests.utils
#    responses
#    ruamel.yaml
#    ruamel.yaml.comments
#    ruamel.yaml.reader
#    ruamel.yaml.scanner
#    ruamel_yaml
#    ruamel_yaml.comments
#    ruamel_yaml.reader
#    ruamel_yaml.scanner
#    shlex
#    shutil
#    signal
#    socket
#    stat
#    struct
#    subprocess
#    sysconfig
#    tarfile
#    tempfile
#    termios
#    textwrap
#    threading
#    traceback
#    types
#    typeutils
#    unittest
#    unittest.mock
#    urllib
#    urllib.parse
#    urlparse
#    uuid
#    warnings
#    weakref
#    win32api
#    win32com.shell
#    winreg
#    yaml


