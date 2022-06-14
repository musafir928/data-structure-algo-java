var lengthOfLongestSubstring = function(s) {

    if(s.length < 2) return s.length;

    let left = 0, right = 1;
    let result = 0;

    while(right < s.length-1) {
        if(left == right) {right++}

        if(s[right] != s[left]) {
            right++
        } else {
            result = result > right - left ? result : right - left;
            while(left<=right) {
                left++;
                if(s[right] == s[left]) {
                    left++

                    break;
                }
            }

        }

    }

    return Math.max(result, right-left);


};

console.log(lengthOfLongestSubstring("abcdabc"))