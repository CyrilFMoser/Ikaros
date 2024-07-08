module Program_19 () where 

 main = print $ show v_b
data B_A = C_A B_B
data B_B = C_B | C_C B_A B_B | C_D B_A B_A | C_E

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A (C_D _ _)) (C_A _) -> 0 
  C_D (C_A (C_C _ _)) (C_A C_E) -> 1 
  C_D (C_A C_B) (C_A _) -> 2 
  C_D (C_A (C_C _ _)) (C_A (C_C _ _)) -> 3 
  C_C (C_A _) (C_D (C_A _) _) -> 4 
  C_C _ (C_C _ C_B) -> 5 
  C_C (C_A C_B) (C_D (C_A _) _) -> 6 
  C_C (C_A C_E) (C_C (C_A _) (C_D _ _)) -> 7 
  C_C _ _ -> 8 
  C_C (C_A C_E) _ -> 9 
  C_C (C_A (C_D _ _)) (C_C (C_A _) (C_D _ _)) -> 10 
  C_C (C_A (C_C _ _)) (C_C _ C_E) -> 11 
  C_C (C_A _) (C_C (C_A _) (C_C _ _)) -> 12 
  C_C (C_A C_E) (C_D (C_A _) (C_A _)) -> 13 
  C_C (C_A (C_D _ _)) _ -> 14 
  C_C (C_A (C_D _ _)) (C_C _ _) -> 15 
  C_C _ C_E -> 16 
  C_C (C_A (C_D _ _)) (C_C (C_A _) _) -> 17 
  C_C (C_A (C_C _ _)) (C_D _ _) -> 18 
  C_C _ (C_D (C_A _) _) -> 19 
  C_C (C_A (C_D _ _)) (C_C (C_A _) (C_C _ _)) -> 20 
  C_C (C_A _) (C_D _ _) -> 21 
  C_C (C_A C_B) (C_C _ (C_C _ _)) -> 22 
  C_C (C_A C_B) (C_D _ (C_A _)) -> 23 
  C_C (C_A _) (C_C (C_A _) (C_D _ _)) -> 24 
  C_C (C_A C_E) (C_C _ _) -> 25 
  C_C (C_A C_B) (C_C (C_A _) C_B) -> 26 
  C_C (C_A (C_D _ _)) (C_C (C_A _) C_B) -> 27 
  C_C (C_A _) C_E -> 28 
  C_C (C_A C_B) _ -> 29 
  C_C (C_A (C_D _ _)) (C_D (C_A _) _) -> 30 
  C_C (C_A C_E) (C_C _ C_E) -> 31 
  C_C (C_A (C_C _ _)) (C_C (C_A _) C_B) -> 32 
  C_C _ (C_C (C_A _) C_B) -> 33 
  C_C _ (C_D _ (C_A _)) -> 34 
  C_C (C_A _) (C_C _ C_E) -> 35 
  C_C (C_A (C_D _ _)) (C_C _ (C_C _ _)) -> 36 
  C_C (C_A C_B) (C_C (C_A _) (C_C _ _)) -> 37 
  C_C (C_A (C_C _ _)) (C_C _ _) -> 38 
  C_C (C_A _) (C_C _ (C_C _ _)) -> 39 
  C_C (C_A _) (C_C _ _) -> 40 
  C_C (C_A C_B) (C_C _ _) -> 41 
  C_C (C_A (C_C _ _)) (C_D _ (C_A _)) -> 42 
  C_C (C_A C_B) C_B -> 43 
  C_C (C_A (C_D _ _)) (C_C _ C_B) -> 44 
  C_C (C_A (C_C _ _)) (C_D (C_A _) _) -> 45 
  C_C (C_A C_E) (C_C _ (C_C _ _)) -> 46 
  C_C _ (C_D _ _) -> 47 
  C_C (C_A (C_C _ _)) (C_C (C_A _) C_E) -> 48 
  C_C _ (C_C _ _) -> 49 
  C_C _ (C_C _ C_E) -> 50 
  C_C (C_A _) (C_D _ (C_A _)) -> 51 
  C_C (C_A C_E) (C_C (C_A _) (C_C _ _)) -> 52 
  C_C (C_A (C_C _ _)) (C_C (C_A _) (C_D _ _)) -> 53 
  C_C _ (C_D (C_A _) (C_A _)) -> 54 
  C_C (C_A (C_D _ _)) (C_D (C_A _) (C_A _)) -> 55 
