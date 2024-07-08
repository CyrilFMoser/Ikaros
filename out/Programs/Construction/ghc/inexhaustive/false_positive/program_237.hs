module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A a a) | C_B (B_B a) (B_B b) | C_C | C_D | C_E (B_C b) (B_A b b)
data B_B c = C_F c
data B_C d = C_G (B_C d) | C_H (B_B d) (B_B d) | C_I | C_J (B_A d d) | C_K (B_C d)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C -> 1 
  C_D -> 2 
  C_E _ (C_A _) -> 3 
  C_E _ (C_B (C_F _) _) -> 4 
  C_E _ (C_C) -> 5 
  C_E _ (C_D) -> 6 
  C_E _ (C_E _ _) -> 7 
