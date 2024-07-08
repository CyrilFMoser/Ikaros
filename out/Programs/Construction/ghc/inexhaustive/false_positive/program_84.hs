module Program_27 () where 

 main = print $ show v_b
data B_B c d = C_E (B_A d c) d | C_F
data B_A a b = C_A (B_B b b) (B_B a a) | C_B (B_B b a) (B_A a a) | C_C (B_B a b) | C_D (B_B Char a) (B_A a Bool)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_C (C_E _ _) -> 1 
  C_C (C_F) -> 2 
  C_D _ _ -> 3 
