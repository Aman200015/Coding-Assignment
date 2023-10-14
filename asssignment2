// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

function reverseWordsInSentence(sentence) {
    // Split the sentence into words using spaces as the delimiter
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Example usage:
const inputSentence = 'This is a sunny day';
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);


// Perform sorting of an array in descending order.

const numbers = [5, 2, 9, 1, 5, 6];

// Use the sort method with a custom comparison function
numbers.sort(function(a, b) {
    return b - a; // Compare in descending order
});

console.log(numbers); // The array is now sorted in descending order
