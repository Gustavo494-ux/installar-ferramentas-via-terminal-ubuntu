# Atualizar os pacotes
sudo apt update

# Instalar o Java 11
sudo apt install openjdk-11-jdk

# Instalar o Java 17
sudo apt install openjdk-17-jdk

# Verificar as instalações
java -version

# Definir o Java 17 como padrão
sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-17-openjdk-amd64/bin/java 1717
sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac 1717
sudo update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java
sudo update-alternatives --set javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac

# Alternar entre versões do Java
sudo update-alternatives --config java
sudo update-alternatives --config javac

# Adicionar Variáveis de Ambiente para Java 11 ao final do arquivo ~/.bashrc ou ~/.zshrc
echo 'export JAVA_HOME_11=/usr/lib/jvm/java-11-openjdk-amd64' >> ~/.bashrc
echo 'export PATH_11=$JAVA_HOME_11/bin:$PATH' >> ~/.bashrc

# Adicionar Variáveis de Ambiente para Java 17 ao final do arquivo ~/.bashrc ou ~/.zshrc
echo 'export JAVA_HOME_17=/usr/lib/jvm/java-17-openjdk-amd64' >> ~/.bashrc
echo 'export PATH_17=$JAVA_HOME_17/bin:$PATH' >> ~/.bashrc

# Recarregar o arquivo .bashrc ou .zshrc
source ~/.bashrc
# ou
source ~/.zshrc
