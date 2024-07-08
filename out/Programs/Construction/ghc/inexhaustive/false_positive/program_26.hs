module Program_4 () where 

 main = print $ show v_b
data B_A a = C_A Int | C_B (B_A a) a | C_C

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_B (C_A _) _) _ -> 1 
  C_B (C_B (C_B _ _) _) _ -> 2 
  C_B (C_B (C_C) _) _ -> 3 
  C_B (C_C) _ -> 4 
  C_C -> 5 
