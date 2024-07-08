module Program_27 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_A (C_B) (C_D _ _)) (C_D (C_C _ _) _) -> 0 
