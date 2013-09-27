from pymongo import Connection
import time

db = Connection().test
coll = db.my_messages
cursor = coll.find(tailable=True)
while cursor.alive:
    try:
        doc = cursor.next()
        print doc
    except StopIteration:
        time.sleep(1)