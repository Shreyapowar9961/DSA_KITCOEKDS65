class Solution:
    def romanToInt(self, s: str) -> int:
        romanToInt = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        int_val = 0
        for i in range(len(s)):
            if i > 0 and  romanToInt[s[i]] >  romanToInt[s[i - 1]]:
                int_val +=  romanToInt[s[i]] - 2 *  romanToInt[s[i - 1]]
            else:
                int_val +=  romanToInt[s[i]]
        return int_val


        