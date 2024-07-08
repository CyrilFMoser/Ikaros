module Program_0 () where 

 main = print $ show v_b
data B_A = C_A | C_B | C_C Char
data B_B a = C_D
data B_C = C_E B_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C _ -> 1 
