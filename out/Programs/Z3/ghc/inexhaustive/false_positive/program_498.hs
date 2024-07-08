module Program_2 () where 

main = print $ show v_b
data B_A a b = C_A (B_A b b) (B_A Int b) | C_B a | C_C
data B_B c d = C_D (B_B c d) | C_E Char (B_A d d) | C_F (B_A d d) | C_G

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_A (C_B _) (C_B _)) -> 0 
  C_F (C_A (C_C) (C_B _)) -> 1 
  C_F (C_B _) -> 2 
  C_F (C_A (C_A _ _) (C_A _ _)) -> 3 
  C_F (C_A (C_B _) _) -> 4 
  C_F (C_A (C_C) _) -> 5 
  C_F (C_A _ (C_C)) -> 6 
  C_D (C_D (C_D _)) -> 7 
  C_D (C_G) -> 8 
  C_E _ (C_A (C_B _) (C_C)) -> 9 
  C_E _ (C_A (C_C) (C_A _ _)) -> 10 
  C_E _ (C_A (C_A _ _) (C_A _ _)) -> 11 
  C_E _ (C_A (C_A _ _) (C_C)) -> 12 
