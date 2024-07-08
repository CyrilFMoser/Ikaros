module Program_1 () where 

main = print $ show v_b
data B_B c d = C_D (B_B c d) | C_E Char (B_A d d) | C_F (B_A d d) | C_G
data B_A a b = C_A (B_A b b) (B_A Int b) | C_B a | C_C

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_A _ _) -> 0 
  C_F (C_A (C_B _) (C_C)) -> 1 
  C_F (C_A (C_C) (C_C)) -> 2 
  C_F (C_A (C_A _ _) _) -> 3 
  C_F (C_A (C_A _ _) (C_C)) -> 4 
  C_F (C_A (C_C) (C_A _ _)) -> 5 
  C_F (C_A (C_B _) (C_A _ _)) -> 6 
  C_F _ -> 7 
  C_F (C_C) -> 8 
  C_F (C_A _ (C_B _)) -> 9 
  C_D (C_D (C_F _)) -> 10 
  C_D (C_E _ (C_C)) -> 11 
  C_D (C_E _ (C_B _)) -> 12 
  C_D (C_F (C_B _)) -> 13 
  C_D _ -> 14 
  C_E _ (C_A (C_B _) (C_A _ _)) -> 15 
  C_E _ (C_C) -> 16 
  C_E _ (C_A _ (C_B _)) -> 17 
  C_E _ (C_B _) -> 18 
  C_E _ (C_A (C_C) (C_B _)) -> 19 
  C_E _ (C_A (C_C) _) -> 20 
  C_E _ (C_A _ _) -> 21 
  C_E _ _ -> 22 
