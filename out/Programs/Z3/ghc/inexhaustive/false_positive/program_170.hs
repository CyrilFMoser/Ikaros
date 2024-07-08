module Program_18 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_A a) | C_C (B_A Int) | C_D (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_C _)) -> 0 
