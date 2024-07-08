module Program_14 () where 

 main = print $ show v_b
data B_B = C_F
data B_C b c = C_G | C_H B_B | C_I | C_J (B_C B_B b)
data B_A a = C_A B_B (B_D a a) | C_B (B_C a B_B) | C_C (B_A a) | C_D | C_E a
data B_D d e = C_K d ((B_B,B_B)) | C_L Int | C_M | C_N Bool | C_O

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_G) -> 1 
  C_B (C_H _) -> 2 
  C_B (C_J _) -> 3 
  C_C _ -> 4 
  C_D -> 5 
  C_E _ -> 6 
