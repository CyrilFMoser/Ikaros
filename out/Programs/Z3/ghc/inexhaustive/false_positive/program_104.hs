module Program_16 () where 

 main = print $ show v_b
data B_B = C_D (B_A B_B) Bool | C_E
data B_A a = C_A | C_B B_B Bool | C_C B_B

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D (C_C _) _) -> 0 
  C_C (C_D (C_A) _) -> 1 
