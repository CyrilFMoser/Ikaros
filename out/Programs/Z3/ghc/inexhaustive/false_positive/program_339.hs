module Program_26 () where 

 main = print $ show v_b
data B_A a = C_A a (((Int,Bool),Bool)) | C_B

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (((_,_),_)) -> 0 
