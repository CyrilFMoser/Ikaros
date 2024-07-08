module Program_4 () where 

 main = print $ show v_b
data B_A a b = C_A Char | C_B | C_C (B_A a b) (B_B a b) | C_D | C_E Int (B_B Char b)
data B_B c d = C_F
data B_C e = C_G | C_H Int (B_C e) | C_I (B_B e e)

v_a :: B_A Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C _ _ -> 2 
  C_D -> 3 
