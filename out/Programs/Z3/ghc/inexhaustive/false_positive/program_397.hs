module Program_20 () where 

 main = print $ show v_b
data B_B = C_B | C_C B_A B_B | C_D B_A B_A | C_E
data B_A = C_A B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A C_B) _ -> 0 
  C_D (C_A (C_C _ _)) _ -> 1 
  C_D _ (C_A (C_D _ _)) -> 2 
  C_D (C_A C_B) (C_A (C_C _ _)) -> 3 
  C_D (C_A (C_D _ _)) (C_A (C_C _ _)) -> 4 
  C_D (C_A (C_D _ _)) (C_A C_E) -> 5 
  C_C (C_A C_E) (C_D _ (C_A _)) -> 6 
  C_C (C_A C_E) (C_C (C_A _) _) -> 7 
  C_C (C_A C_B) (C_D (C_A _) (C_A _)) -> 8 
  C_C (C_A C_B) (C_C (C_A _) _) -> 9 
  C_C (C_A C_E) (C_C _ C_B) -> 10 
  C_C (C_A C_E) (C_C (C_A _) C_B) -> 11 
  C_C (C_A (C_C _ _)) C_B -> 12 
