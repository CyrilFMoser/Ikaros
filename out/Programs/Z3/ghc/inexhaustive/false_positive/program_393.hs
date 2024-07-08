module Program_17 () where 

 main = print $ show v_b
data B_A = C_A B_B
data B_B = C_B | C_C B_A B_B | C_D B_A B_A | C_E

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_D (C_A C_E) _ -> 1 
  C_D (C_A (C_D _ _)) (C_A C_B) -> 2 
  C_D _ (C_A _) -> 3 
  C_D (C_A _) (C_A (C_D _ _)) -> 4 
  C_D (C_A C_B) (C_A (C_D _ _)) -> 5 
  C_D (C_A _) (C_A C_E) -> 6 
  C_D (C_A (C_C _ _)) (C_A C_B) -> 7 
  C_D _ (C_A C_B) -> 8 
  C_D _ (C_A (C_C _ _)) -> 9 
  C_D (C_A (C_C _ _)) (C_A _) -> 10 
  C_D (C_A C_E) (C_A _) -> 11 
  C_D (C_A C_E) (C_A C_B) -> 12 
  C_C (C_A C_E) (C_C _ (C_D _ _)) -> 13 
  C_C _ (C_C (C_A _) (C_D _ _)) -> 14 
  C_C (C_A _) (C_C _ C_B) -> 15 
  C_C (C_A (C_D _ _)) (C_C _ C_E) -> 16 
  C_C (C_A C_B) (C_C (C_A _) C_E) -> 17 
  C_C (C_A C_B) (C_C (C_A _) (C_D _ _)) -> 18 
  C_C (C_A C_E) (C_C (C_A _) C_E) -> 19 
  C_C _ (C_C _ (C_D _ _)) -> 20 
  C_C (C_A (C_D _ _)) (C_D _ (C_A _)) -> 21 
  C_C (C_A C_E) C_B -> 22 
  C_C (C_A _) (C_C (C_A _) C_B) -> 23 
  C_C _ (C_C (C_A _) C_E) -> 24 
  C_C (C_A (C_C _ _)) (C_C _ C_B) -> 25 
  C_C (C_A C_B) (C_C _ (C_D _ _)) -> 26 
  C_C _ (C_C _ (C_C _ _)) -> 27 
