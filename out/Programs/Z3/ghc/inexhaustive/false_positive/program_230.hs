module Program_14 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A | C_C B_A B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_C C_A (C_D _ _)) -> 0 
  C_C (C_D (C_C _ _) (C_D _ _)) (C_D _ (C_B _)) -> 1 
  C_C (C_D (C_D _ _) _) (C_B _) -> 2 
  C_C (C_C _ (C_B _)) (C_C (C_B _) (C_C _ _)) -> 3 
  C_C (C_B C_A) (C_C (C_C _ _) (C_C _ _)) -> 4 
  C_D (C_D C_A _) (C_C (C_B _) (C_B _)) -> 5 
  C_D (C_C _ _) (C_D (C_C _ _) (C_D _ _)) -> 6 
  C_D (C_D (C_C _ _) (C_C _ _)) (C_D C_A (C_B _)) -> 7 
  C_D (C_B C_A) (C_D (C_B _) (C_B _)) -> 8 
  C_D (C_D (C_D _ _) C_A) (C_B (C_D _ _)) -> 9 
  C_D (C_D (C_B _) (C_C _ _)) (C_C (C_B _) _) -> 10 
  C_D (C_C C_A _) (C_C _ (C_D _ _)) -> 11 
