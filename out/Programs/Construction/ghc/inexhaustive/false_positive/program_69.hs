module Program_13 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_A B_A)
data B_B a b = C_B | C_C (B_B a b) | C_D | C_E B_A (B_B a a)

v_a :: B_B Char B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_B) -> 1 
  C_C (C_C (C_B)) -> 2 
  C_C (C_C (C_C _)) -> 3 
  C_C (C_C (C_D)) -> 4 
  C_C (C_C (C_E _ _)) -> 5 
  C_C (C_D) -> 6 
  C_C (C_E _ (C_B)) -> 7 
  C_C (C_E _ (C_C _)) -> 8 
  C_C (C_E _ (C_D)) -> 9 
  C_C (C_E _ (C_E _ _)) -> 10 
  C_D -> 11 
  C_E (C_A (C_B)) (C_B) -> 12 
  C_E (C_A (C_C _)) (C_B) -> 13 
  C_E (C_A (C_D)) (C_B) -> 14 
  C_E (C_A (C_E _ _)) (C_B) -> 15 
  C_E (C_A (C_B)) (C_C (C_B)) -> 16 
  C_E (C_A (C_C _)) (C_C (C_B)) -> 17 
  C_E (C_A (C_D)) (C_C (C_B)) -> 18 
  C_E (C_A (C_E _ _)) (C_C (C_B)) -> 19 
  C_E (C_A (C_B)) (C_C (C_C _)) -> 20 
  C_E (C_A (C_C _)) (C_C (C_C _)) -> 21 
  C_E (C_A (C_D)) (C_C (C_C _)) -> 22 
  C_E (C_A (C_E _ _)) (C_C (C_C _)) -> 23 
  C_E (C_A (C_B)) (C_C (C_D)) -> 24 
  C_E (C_A (C_C _)) (C_C (C_D)) -> 25 
  C_E (C_A (C_D)) (C_C (C_D)) -> 26 
  C_E (C_A (C_E _ _)) (C_C (C_D)) -> 27 
  C_E (C_A (C_B)) (C_C (C_E _ _)) -> 28 
  C_E (C_A (C_C _)) (C_C (C_E _ _)) -> 29 
  C_E (C_A (C_D)) (C_C (C_E _ _)) -> 30 
  C_E (C_A (C_E _ _)) (C_C (C_E _ _)) -> 31 
  C_E (C_A (C_B)) (C_D) -> 32 
  C_E (C_A (C_C _)) (C_D) -> 33 
  C_E (C_A (C_D)) (C_D) -> 34 
  C_E (C_A (C_E _ _)) (C_D) -> 35 
  C_E (C_A (C_B)) (C_E _ (C_B)) -> 36 
  C_E (C_A (C_D)) (C_E _ (C_B)) -> 37 
  C_E (C_A (C_E _ _)) (C_E _ (C_B)) -> 38 
  C_E (C_A (C_B)) (C_E _ (C_C _)) -> 39 
  C_E (C_A (C_C _)) (C_E _ (C_C _)) -> 40 
  C_E (C_A (C_D)) (C_E _ (C_C _)) -> 41 
  C_E (C_A (C_E _ _)) (C_E _ (C_C _)) -> 42 
  C_E (C_A (C_B)) (C_E _ (C_D)) -> 43 
  C_E (C_A (C_C _)) (C_E _ (C_D)) -> 44 
  C_E (C_A (C_D)) (C_E _ (C_D)) -> 45 
  C_E (C_A (C_E _ _)) (C_E _ (C_D)) -> 46 
  C_E (C_A (C_B)) (C_E _ (C_E _ _)) -> 47 
  C_E (C_A (C_C _)) (C_E _ (C_E _ _)) -> 48 
  C_E (C_A (C_D)) (C_E _ (C_E _ _)) -> 49 
  C_E (C_A (C_E _ _)) (C_E _ (C_E _ _)) -> 50 
