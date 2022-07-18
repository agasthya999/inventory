# inventory

/readexceldata : This will read the data from excel and dump into to the db.
Given a supplier id or name, list all the products that the supplier has with stock and Accept a search param for the above filter based on the product name.
For the above two cases I have implemented single end point /getproduct?sup=abc&productname=def 
