module Program_1 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B (B_A a) a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B (C_B _ _) _) -> 0 
  C_A (C_B _ _) -> 1 
