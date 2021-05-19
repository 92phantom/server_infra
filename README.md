# server_infra

# install microk8s

$ sudo snap install microk8s --classic --channel=1.13/stable
$ microk8s.enable dns dashboard storage

sudo snap alias microk8s.kubectl kubectl

dashboard 설치 확인 
$ kubectl get all --all-namespaces

dashboard 접속
$ token=$(kubectl -n kube-system get secret | grep default-token | cut -d " " -f1)
$ kubectl -n kube-system describe secret $token


port forward
https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands#port-forward
kubectl port-forward --address 0.0.0.0 -n devops-tools service/jenkins-service 8889:32000
$ kubectl port-forward -n kube-system service/kubernetes-dashboard 10443:443


# 5/15 Jenkins 설치
참고링크 : https://devopscube.com/setup-jenkins-on-kubernetes-cluster/
kubectl port-forward --address 0.0.0.0 -n devops-tools service/jenkins-service 8889:8080



***************************
microk8s 는 자료가 너무없다 
minikube로 환승


Minikube 192.168.99.100으로 고정으로 키는 방법

VirtualBox 다 끈채로
mkdir ~/.config/VirtualBox/leasebackup/
mv ~/.config/VirtualBox/*.leases ~/.config/VirtualBox/leasebackup/
mv ~/.config/VirtualBox/*.leases-prev ~/.config/VirtualBox/leasebackup/
VBoxManage hostonlyif remove vboxnet0
0%...10%...20%...30%...40%...50%...60%...70%...80%...90%...100%
minikube start --memory 8000 --cpus 2 --kubernetes-version v1.10.0



# MariaDB 설치

# GateWay 설정
