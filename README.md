# server_infra

# install microk8s

$ sudo snap install microk8s --classic
$ microk8s enable dns dashboard storage

dashboard 설치 확인 
$ microk8s kubectl get all --all-namespaces

dashboard 접속
$ token=$(microk8s kubectl -n kube-system get secret | grep default-token | cut -d " " -f1)
$ microk8s kubectl -n kube-system describe secret $token

sudo snap alias microk8s.kubectl kubectl

port forward
https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands#port-forward

$ microk8s kubectl port-forward -n kube-system service/kubernetes-dashboard 10443:443


# 5/15 Jenkins 설치




# MariaDB 설치

# GateWay 설정
