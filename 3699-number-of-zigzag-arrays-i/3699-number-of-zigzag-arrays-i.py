class Solution:
    def zigZagArrays(self, n: int, l: int, r: int) -> int:
        MOD = 10**9 + 7
        m = r - l + 1
        dp = [1] * m
        for i in range(1, n):
            new_dp = [0] * m
            total = 0
            if i & 1:
                for j in range(m - 1, -1, -1):
                    x = dp[j]
                    new_dp[j] = total
                    total = (total + x) % MOD
            else:
                for j in range(m):
                    x = dp[j]
                    new_dp[j] = total
                    total = (total + x) % MOD
            dp = new_dp
        return (2 * sum(dp)) % MOD