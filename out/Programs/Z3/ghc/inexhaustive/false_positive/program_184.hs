module Program_30 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B ((Char,Int)) | C_C (B_A a) ((Int,Bool)) | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _) ((_,_)) -> 0 
