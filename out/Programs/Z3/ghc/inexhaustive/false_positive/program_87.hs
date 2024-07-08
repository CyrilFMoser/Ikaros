module Program_3 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_B | C_C B_B
data B_B = C_D Int | C_E ((B_A,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E ((C_C (C_D _),C_D _)) -> 0 
