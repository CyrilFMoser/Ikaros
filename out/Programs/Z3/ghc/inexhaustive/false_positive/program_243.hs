module Program_26 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_A _ _) (C_A _ _)) (C_C _ (C_A _ _)) -> 0 
  C_C (C_C (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_B)) -> 1 
  C_C _ (C_C _ (C_B)) -> 2 
  C_C (C_A (C_C _ _) (C_D _ _)) (C_A (C_D _ _) (C_A _ _)) -> 3 
  C_C (C_C (C_C _ _) (C_B)) (C_D _ _) -> 4 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_A (C_A _ _) (C_B)) -> 5 
  C_C (C_C (C_A _ _) _) (C_A (C_A _ _) (C_A _ _)) -> 6 
