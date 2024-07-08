module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_A _ _) (C_B)) (C_C (C_B) (C_B)) -> 0 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_D (C_B) _) -> 1 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_C (C_B) (C_D _ _)) -> 2 
  C_C (C_C _ (C_A _ _)) (C_C (C_D _ _) (C_B)) -> 3 
  C_C (C_C (C_C _ _) (C_D _ _)) (C_C _ (C_D _ _)) -> 4 
  C_C (C_A _ (C_B)) (C_C (C_A _ _) _) -> 5 
  C_C (C_A (C_A _ _) (C_D _ _)) (C_D (C_D _ _) _) -> 6 
  C_C (C_A _ (C_A _ _)) (C_D (C_B) _) -> 7 
  C_C (C_A (C_C _ _) _) (C_C (C_C _ _) (C_A _ _)) -> 8 
  C_A _ (C_A (C_D _ _) (C_C _ _)) -> 9 
