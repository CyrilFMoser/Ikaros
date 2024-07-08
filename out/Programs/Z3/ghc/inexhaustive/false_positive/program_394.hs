module Program_18 () where 

 main = print $ show v_b
data B_A = C_A B_B
data B_B = C_B | C_C B_A B_B | C_D B_A B_A | C_E

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D (C_A C_B) (C_A C_E) -> 1 
  C_D _ (C_A C_E) -> 2 
  C_D _ _ -> 3 
  C_D (C_A (C_D _ _)) _ -> 4 
  C_D (C_A _) (C_A (C_C _ _)) -> 5 
  C_D (C_A _) (C_A C_B) -> 6 
  C_D (C_A _) _ -> 7 
  C_D (C_A _) (C_A _) -> 8 
  C_D (C_A C_E) (C_A (C_D _ _)) -> 9 
  C_D (C_A C_B) (C_A C_B) -> 10 
  C_D (C_A (C_D _ _)) (C_A (C_D _ _)) -> 11 
  C_D (C_A C_E) (C_A (C_C _ _)) -> 12 
  C_D (C_A (C_C _ _)) (C_A (C_D _ _)) -> 13 
  C_D (C_A C_E) (C_A C_E) -> 14 
  C_C _ (C_C (C_A _) (C_C _ _)) -> 15 
  C_C (C_A (C_C _ _)) (C_C (C_A _) _) -> 16 
  C_C (C_A C_B) (C_C _ C_B) -> 17 
  C_C (C_A C_B) (C_D _ _) -> 18 
  C_C (C_A _) _ -> 19 
  C_C (C_A (C_C _ _)) (C_D (C_A _) (C_A _)) -> 20 
  C_C (C_A (C_C _ _)) (C_C (C_A _) (C_C _ _)) -> 21 
  C_C (C_A _) (C_C (C_A _) C_E) -> 22 
  C_C (C_A C_E) C_E -> 23 
  C_C (C_A (C_D _ _)) (C_C _ (C_D _ _)) -> 24 
  C_C (C_A _) (C_C (C_A _) _) -> 25 
  C_C (C_A (C_C _ _)) _ -> 26 
  C_C (C_A (C_D _ _)) C_E -> 27 
  C_C (C_A (C_D _ _)) (C_C (C_A _) C_E) -> 28 
  C_C (C_A _) C_B -> 29 
  C_C (C_A C_B) C_E -> 30 
  C_C _ C_B -> 31 
  C_C (C_A C_B) (C_C _ C_E) -> 32 
  C_C (C_A (C_C _ _)) (C_C _ (C_C _ _)) -> 33 
  C_C (C_A (C_C _ _)) C_E -> 34 
  C_C (C_A _) (C_D (C_A _) (C_A _)) -> 35 
  C_C (C_A (C_D _ _)) (C_D _ _) -> 36 
  C_C (C_A _) (C_C _ (C_D _ _)) -> 37 
  C_C (C_A (C_C _ _)) (C_C _ (C_D _ _)) -> 38 
  C_C (C_A (C_D _ _)) C_B -> 39 
  C_C (C_A C_E) (C_D (C_A _) _) -> 40 
