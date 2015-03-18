class Solution:
    # @param version1, a string
    # @param version2, a string
    # @return an integer
    def compareVersion(self, version1, version2):
        versions1=version1.split(".")
        versions2=version2.split(".")
        for i in range(0,max(len(versions1),len(versions2))):
            if int(versions1[i])>int(versions2[i]):
                return 1
            elif int(versions1[i])<int(versions2[i]):
                return -1
            else:
                if len(versions1)==i+1 and len(versions2)==i+1:
                    return 0
                elif len(versions1)==i+1 or len(versions2)==i+1:
                    if len(versions1)==i+1 and int(versions2[i+1])!=0:
                        return -1
                    elif len(versions2)==i+1 and int(versions1[i+1])!=0:
                        return 1
                    else:
                        return 0