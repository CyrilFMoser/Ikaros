module Program_5 () where 

 main = print $ show v_b
data B_A a = C_A (B_B Char) | C_B ((Char,Int)) (B_B a) | C_C | C_D a (B_C a a)
data B_B b = C_E b (B_A b) | C_F (B_A b) (B_A b) | C_G (B_C Int b) (B_A b) | C_H Char (B_A b)
data B_C c d = C_I | C_J | C_K Bool (B_A c)

v_a :: B_C Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_K _ _ -> 1 
