module Program_24 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a b) (B_A b b) | C_B | C_C (B_A b b) (B_A Int a) | C_D (B_A a a) b

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D (C_C _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 0 
  C_C (C_A (C_D _ _) (C_D _ _)) (C_C (C_A _ _) (C_D _ _)) -> 1 
  C_C (C_A (C_C _ _) (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 2 
  C_C (C_C (C_A _ _) _) (C_C (C_B) (C_D _ _)) -> 3 
  C_C (C_C (C_A _ _) _) (C_C _ (C_B)) -> 4 
  C_C (C_A (C_B) (C_B)) (C_A (C_D _ _) (C_B)) -> 5 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C (C_A _ _) (C_C _ _)) -> 6 
  C_C (C_C _ (C_B)) (C_C _ (C_A _ _)) -> 7 
  C_C (C_C (C_A _ _) (C_D _ _)) (C_A _ _) -> 8 
  C_C (C_D (C_A _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 9 
  C_C (C_A (C_D _ _) _) (C_D (C_A _ _) _) -> 10 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A (C_C _ _) _) -> 11 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_A (C_B) (C_B)) -> 12 
  C_C (C_A (C_D _ _) (C_C _ _)) (C_C (C_B) (C_B)) -> 13 
  C_C (C_C (C_D _ _) _) (C_A (C_D _ _) (C_A _ _)) -> 14 
  C_C (C_A (C_D _ _) (C_B)) (C_A (C_A _ _) _) -> 15 
  C_C (C_C (C_C _ _) _) (C_A (C_A _ _) (C_D _ _)) -> 16 
  C_C (C_A (C_A _ _) _) (C_A (C_B) (C_B)) -> 17 
  C_C _ (C_A (C_A _ _) _) -> 18 
  C_C (C_C (C_C _ _) (C_B)) (C_A (C_B) (C_D _ _)) -> 19 
  C_C (C_A (C_B) _) (C_C _ (C_D _ _)) -> 20 
  C_C (C_C (C_B) (C_C _ _)) (C_C (C_C _ _) (C_D _ _)) -> 21 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_A _ _) (C_A _ _)) -> 22 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_C (C_A _ _) _) -> 23 
  C_C (C_A (C_A _ _) (C_A _ _)) (C_A _ (C_B)) -> 24 
  C_C (C_A (C_B) _) (C_D (C_A _ _) _) -> 25 
  C_C (C_A (C_B) _) (C_A _ (C_A _ _)) -> 26 
  C_C (C_A (C_D _ _) (C_A _ _)) (C_A (C_D _ _) (C_C _ _)) -> 27 
  C_C (C_A (C_A _ _) (C_C _ _)) (C_C (C_B) (C_C _ _)) -> 28 
  C_C (C_A _ (C_D _ _)) (C_D (C_D _ _) _) -> 29 
  C_C (C_C (C_B) (C_A _ _)) (C_C (C_B) (C_B)) -> 30 
  C_A (C_A (C_D _ _) (C_C _ _)) (C_C (C_C _ _) _) -> 31 
  C_A (C_C _ (C_B)) (C_A (C_D _ _) _) -> 32 
  C_A (C_C (C_B) _) (C_C (C_D _ _) (C_C _ _)) -> 33 
  C_A (C_C (C_A _ _) (C_C _ _)) (C_A _ (C_B)) -> 34 
