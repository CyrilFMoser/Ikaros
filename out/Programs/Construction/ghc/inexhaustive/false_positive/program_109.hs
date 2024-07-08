module Program_20 () where 

 main = print $ show v_b
data B_A a = C_A
data B_D b = C_I Int | C_J B_B ((B_C,Int)) | C_K | C_L
data B_C = C_D B_B | C_E | C_F | C_G | C_H
data B_B = C_B (B_D B_C) (B_D B_B) | C_C (B_A B_B) Int

v_a :: B_D Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J _ _ -> 1 
  C_L -> 2 
