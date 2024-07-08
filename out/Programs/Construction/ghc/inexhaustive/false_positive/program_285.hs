module Program_7 () where 

 main = print $ show v_b
data B_A = C_A B_A Bool | C_B B_B B_A | C_C B_B B_B
data B_B = C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ _ -> 1 
