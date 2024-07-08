module Program_15 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A | C_C B_A B_A | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C (C_D _ _) (C_B _)) (C_B _) -> 0 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C (C_B _) C_A) -> 1 
  C_C C_A (C_C (C_D _ _) (C_D _ _)) -> 2 
  C_C (C_C C_A C_A) (C_C _ _) -> 3 
  C_C (C_D (C_C _ _) (C_B _)) (C_C (C_D _ _) (C_C _ _)) -> 4 
  C_C (C_C (C_B _) C_A) (C_D (C_D _ _) (C_B _)) -> 5 
  C_C (C_D _ _) (C_D C_A (C_D _ _)) -> 6 
  C_C (C_B (C_B _)) (C_B _) -> 7 
  C_C (C_C (C_D _ _) (C_C _ _)) (C_D (C_C _ _) (C_B _)) -> 8 
  C_C (C_C C_A (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 9 
  C_C (C_D C_A C_A) (C_D _ (C_D _ _)) -> 10 
  C_C (C_C _ (C_D _ _)) (C_C (C_C _ _) (C_D _ _)) -> 11 
  C_C (C_D (C_D _ _) (C_B _)) (C_C _ (C_D _ _)) -> 12 
  C_C (C_C (C_D _ _) (C_B _)) (C_C C_A (C_B _)) -> 13 
  C_C (C_D C_A (C_C _ _)) (C_C _ (C_B _)) -> 14 
  C_C (C_D C_A (C_D _ _)) (C_B (C_B _)) -> 15 
  C_C (C_C (C_C _ _) (C_B _)) (C_D (C_C _ _) (C_D _ _)) -> 16 
  C_C (C_C C_A (C_B _)) (C_C (C_B _) (C_C _ _)) -> 17 
  C_C (C_C C_A (C_C _ _)) C_A -> 18 
  C_C (C_D _ _) (C_C (C_D _ _) _) -> 19 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_D C_A (C_C _ _)) -> 20 
  C_C (C_D (C_D _ _) (C_C _ _)) (C_C C_A C_A) -> 21 
  C_C (C_D (C_D _ _) (C_B _)) (C_D (C_C _ _) (C_C _ _)) -> 22 
  C_C (C_C _ _) (C_C C_A (C_D _ _)) -> 23 
  C_C (C_C _ (C_B _)) (C_D (C_C _ _) C_A) -> 24 
  C_C (C_B _) (C_D (C_B _) (C_C _ _)) -> 25 
  C_C (C_C _ (C_D _ _)) (C_C (C_D _ _) (C_D _ _)) -> 26 
  C_C (C_C _ (C_C _ _)) (C_C _ _) -> 27 
  C_C (C_D _ (C_C _ _)) (C_C (C_B _) _) -> 28 
  C_C (C_D (C_C _ _) C_A) (C_C (C_B _) (C_C _ _)) -> 29 
  C_D C_A (C_C (C_C _ _) (C_C _ _)) -> 30 
  C_D (C_C (C_D _ _) (C_B _)) (C_D _ _) -> 31 
  C_D (C_D (C_B _) _) (C_B C_A) -> 32 
  C_D (C_D _ C_A) (C_C (C_B _) (C_D _ _)) -> 33 
  C_D (C_B _) (C_C (C_C _ _) _) -> 34 
  C_D (C_B (C_D _ _)) (C_D (C_B _) (C_C _ _)) -> 35 
  C_D (C_D (C_B _) _) (C_C (C_D _ _) (C_B _)) -> 36 
  C_D (C_D _ _) (C_D (C_D _ _) (C_D _ _)) -> 37 
  C_D (C_D C_A _) (C_D C_A _) -> 38 
  C_D (C_D (C_B _) (C_D _ _)) (C_D (C_B _) (C_C _ _)) -> 39 
  C_D (C_B (C_D _ _)) (C_D _ (C_C _ _)) -> 40 
