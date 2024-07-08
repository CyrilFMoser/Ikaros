module Program_17 () where 

 main = print $ show v_b
data B_D d = C_G | C_H | C_I
data B_C = C_E Char B_C | C_F
data B_A a b = C_A Int (B_D b) | C_B (B_B b) (B_A b b) | C_C
data B_B c = C_D (B_D c) (B_A c c)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ (C_E _ _) -> 0 
  C_E _ C_F -> 1 
  C_F -> 2 
