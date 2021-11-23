file = open("user.txt",mode="r",)
file1 = open("hello.txt",mode="w",encoding="utf-8")
# s = "sssss    ssss sss"
# d = s.split()
# print(d)
for line in file:
    print(line)
    print("********************************")
    ans = 0
    for l in line.split():
        if(ans>3):
            file1.write(l)
            file1.write("\n")
        ans = ans + 1



        