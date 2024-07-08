module Program_3 () where 

main = print $ show v_b
data B_A a b = C_A (B_A b b) (B_A Int b) | C_B a | C_C
data B_B c d = C_D (B_B c d) | C_E Char (B_A d d) | C_F (B_A d d) | C_G

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_A _ (C_A _ _)) -> 0 
