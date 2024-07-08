module Program_19 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) Char | C_B (B_A a) a | C_C (B_A a) (B_A a)

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_B _ _) _) (C_C (C_A _ _) (C_C _ _)) -> 0 
  C_C (C_C _ (C_A _ _)) (C_C (C_C _ _) (C_B _ _)) -> 1 
