module Program_1 () where 

 main = print $ show v_b
data B_B = C_C | C_D
data B_A a b = C_A | C_B (B_A a b) B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
