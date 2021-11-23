file0 = open("F:\\File\\Class Study Material\\大三上\\电子商务\\电子商务与电子政务实验数据\\dataForTrain.txt",mode="r",encoding="utf-8")
file1 = open("F:\File\Class Study Material\大三上\电子商务\电子商务与电子政务实验数据\\result\\result3.txt",mode="w",encoding="utf-8")
count = 0
for line in file0:
    count += 1
    if count == 300:
        count = 0
        file1.write(line)
