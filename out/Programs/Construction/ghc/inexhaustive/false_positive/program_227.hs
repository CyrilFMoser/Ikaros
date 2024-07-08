module Program_11 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C
data B_B c = C_D

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
