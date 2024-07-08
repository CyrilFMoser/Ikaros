module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A | C_B (B_A a) (B_A a) | C_C | C_D
data B_B = C_E (B_A B_B) | C_F ((B_B,B_B)) | C_G (B_C B_B B_B) | C_H (B_A B_B) ((B_B,Int))
data B_C b c = C_I (B_C b b) (B_C B_B B_B)

v_a :: B_C Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ _ -> 0 
