# common sub module for android

## How to Use it
1. library plugin 을 따로 포함하고 있기 때문에 buildSrc || buildLogic 모듈이 필요합니다.
2. git submodule 로 사용하기 때문에 <참고> 에 기재되어 있는 스크립트가 필요합니다.
3. common 을 수정하는 경우, 메인 repo 에서도 같은 수정이 필요합니다. 
   1. 2개 이상의 submodule 을 사용하는 경우 아래 스크립트가 오류가 발생할 수 있습니다.

## 참고
```shell
git submodule foreach git checkout -b newfeature
git submodule foreach git add -A .
git submodule foreach git commit -am "update common module"
git submodule foreach git checkout master
git submodule foreach git merge newfeature
git submodule foreach git push
git submodule foreach git branch -d newfeature
cd ..
git add .
git commit -m "update sub module"
```
