module Program_29 () where 

 main = print $ show v_b
data B_A = C_A | C_B | C_C B_A | C_D B_A B_A | C_E B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C C_A -> 2 
  C_C C_B -> 3 
  C_C (C_C C_A) -> 4 
  C_C (C_C C_B) -> 5 
  C_C (C_C (C_C _)) -> 6 
  C_C (C_C (C_D _ _)) -> 7 
  C_C (C_C (C_E _ _)) -> 8 
  C_C (C_D _ _) -> 9 
  C_C (C_E _ _) -> 10 
  C_D _ C_A -> 11 
  C_D _ C_B -> 12 
  C_D _ (C_C C_A) -> 13 
  C_D _ (C_C C_B) -> 14 
  C_D _ (C_C (C_C _)) -> 15 
  C_D _ (C_C (C_D _ _)) -> 16 
  C_D _ (C_C (C_E _ _)) -> 17 
  C_D _ (C_D _ _) -> 18 
  C_D _ (C_E _ _) -> 19 
  C_E C_A C_A -> 20 
  C_E C_B C_A -> 21 
  C_E (C_C _) C_A -> 22 
  C_E (C_D _ _) C_A -> 23 
  C_E (C_E _ _) C_A -> 24 
  C_E C_A C_B -> 25 
  C_E C_B C_B -> 26 
  C_E (C_C _) C_B -> 27 
  C_E (C_D _ _) C_B -> 28 
  C_E (C_E _ _) C_B -> 29 
  C_E C_A (C_C C_A) -> 30 
  C_E C_B (C_C C_A) -> 31 
  C_E (C_C _) (C_C C_A) -> 32 
  C_E (C_D _ _) (C_C C_A) -> 33 
  C_E (C_E _ _) (C_C C_A) -> 34 
  C_E C_A (C_C C_B) -> 35 
  C_E C_B (C_C C_B) -> 36 
  C_E (C_C _) (C_C C_B) -> 37 
  C_E (C_D _ _) (C_C C_B) -> 38 
  C_E (C_E _ _) (C_C C_B) -> 39 
  C_E C_A (C_C (C_C _)) -> 40 
  C_E C_B (C_C (C_C _)) -> 41 
  C_E (C_C _) (C_C (C_C _)) -> 42 
  C_E (C_D _ _) (C_C (C_C _)) -> 43 
  C_E (C_E _ _) (C_C (C_C _)) -> 44 
  C_E C_A (C_C (C_D _ _)) -> 45 
  C_E C_B (C_C (C_D _ _)) -> 46 
  C_E (C_C _) (C_C (C_D _ _)) -> 47 
  C_E (C_D _ _) (C_C (C_D _ _)) -> 48 
  C_E (C_E _ _) (C_C (C_D _ _)) -> 49 
  C_E C_A (C_C (C_E _ _)) -> 50 
  C_E C_B (C_C (C_E _ _)) -> 51 
  C_E (C_C _) (C_C (C_E _ _)) -> 52 
  C_E (C_E _ _) (C_C (C_E _ _)) -> 53 
  C_E C_A (C_D _ _) -> 54 
  C_E C_B (C_D _ _) -> 55 
  C_E (C_C _) (C_D _ _) -> 56 
  C_E (C_D _ _) (C_D _ _) -> 57 
  C_E (C_E _ _) (C_D _ _) -> 58 
  C_E C_A (C_E _ _) -> 59 
  C_E C_B (C_E _ _) -> 60 
  C_E (C_C _) (C_E _ _) -> 61 
  C_E (C_D _ _) (C_E _ _) -> 62 
  C_E (C_E _ _) (C_E _ _) -> 63 
