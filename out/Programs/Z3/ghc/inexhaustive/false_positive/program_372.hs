module Program_27 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C | C_D

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D -> 1 
