module Program_20 () where 

 main = print $ show v_b
data B_A a = C_A | C_B B_B Bool | C_C B_B
data B_B = C_D (B_A B_B) Bool | C_E

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_D (C_C _) _) _ -> 0 
