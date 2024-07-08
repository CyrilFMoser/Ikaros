module Program_6 () where 

main = print $ show v_b
data B_A a = C_A ((B_B,B_B))
data B_B = C_B B_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((C_B (C_B _),C_B (C_B _))) -> 0 
