module Program_28 () where 

 main = print $ show v_b
data B_A = C_A
data B_B a = C_B B_A | C_C | C_D

v_a :: B_B B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
