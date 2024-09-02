# 執行docker環境
```bash=
docker compose run --rm sheet
```
# 表單功能說明

```
---------------Menu---------------
1. Create a user
2. Create a sheet
3. Check a sheet
4. Change a value in a sheet
5. Change a sheet's access right.
6. Collaborate with an other user
----------------------------------
> 
```

### 1. Create a user (新增使用者)
```bash=
> Louis # 新增 Louis 使用者
```
### 2. Create a sheet (建立表單)
```bash=
> Louis SheetA # 為 Louis 新增 SheetA 表單
```
### 3. Check a sheet (查看表單)
```bash=
> Louis SheetA # 查看 Louis 的 SheetA 表單
```
### 4. Change a value in a sheet (修改表單值)
```bash=
> Louis SheetA # 選擇要修改的表單
> 1 1 10 # 修改第一列第一行的值為 10
> 1 1 1.5+2 # 也可執行加法運算
```
### 5. Change a sheet's access right. (修改表單權限)
```bash=
> Louis SheetA ReadOnly # 修改 SheetA 表單的權限為 ReadOnly
> Louis SheetA Editable # 修改 SheetA 表單的權限為 Editable
```
### 6. Collaborate with an other user (與其他使用者合作)
```bash=
> Louis SheetA Ray # 將 Ray 設定為表單的共同編輯者
```