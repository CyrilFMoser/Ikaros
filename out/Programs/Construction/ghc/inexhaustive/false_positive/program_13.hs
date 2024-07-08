module Program_20 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B | C_C B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C (C_A (C_A _)) -> 2 
  C_C (C_A C_B) -> 3 
  C_C (C_A (C_C _)) -> 4 
  C_C (C_A (C_D _ _)) -> 5 
  C_C C_B -> 6 
  C_C (C_D (C_A _) _) -> 7 
  C_C (C_D C_B _) -> 8 
  C_C (C_D (C_C _) _) -> 9 
  C_C (C_D (C_D _ _) _) -> 10 
  C_D _ _ -> 11 
