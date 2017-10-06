FROM yiha051975/jboss7

COPY modules/ $JBOSS_HOME/modules/system/layers/base/

COPY configuration/ $JBOSS_HOME/standalone/configuration/

COPY *EAR/build/libs/*.ear $JBOSS_HOME/standalone/deployments/