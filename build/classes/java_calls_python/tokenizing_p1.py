from nltk import word_tokenize, sent_tokenize

sentence = """
hellloo.... Mr Ashutosh, my name is ashutosh mishra. I am well.
currently doing some awesome stuffs with natural language processing.Isn't it fun?? Yes it is.HAHAHA
Nice.I hope to get more acquanted with it. Today is 5/3/2017 i hope i'll be a pro in NLTK in next 4 to 5 days
Thanks....HAHA ha
"""

for i in sent_tokenize(sentence):
    print(i)
