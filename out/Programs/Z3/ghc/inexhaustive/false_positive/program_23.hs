module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) Char | C_B | C_C

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_C) _) _ -> 0 
  C_A (C_A (C_A _ _) _) _ -> 1 
  C_A (C_A _ _) _ -> 2 
