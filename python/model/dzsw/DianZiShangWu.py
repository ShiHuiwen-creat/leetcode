file = open("user.txt",mode="r",)
file1 = open("hello.txt",mode="w",encoding="utf-8")
print(file.readline())
for line in file:
    for l in line.split("	"):
        if("卡通" in l):
            file1.write(l)
            file1.write("\n")
        print(l)
        print("********************************")
    print("/n")
file.close()
file1.close()