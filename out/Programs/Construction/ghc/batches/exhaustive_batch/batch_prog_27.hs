module Program_27 () where 

 main = print $ show v_b
data B_A a = C_A
data B_C = C_E ((B_C,B_C)) | C_F B_C | C_G (B_D B_C) | C_H Int
data B_B b = C_B B_C (B_D b) | C_C b b | C_D (B_D B_C)
data B_D c = C_I | C_J B_C (B_A c) | C_K

v_a :: B_D Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_J _ _ -> 1 
  C_K -> 2 
