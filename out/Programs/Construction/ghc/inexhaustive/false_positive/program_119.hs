module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A | C_B ((B_B,B_B)) Int | C_C
data B_D c d = C_G Int ((Bool,B_B)) | C_H (B_C c) B_B | C_I c (B_D c c) | C_J ((B_B,B_B)) | C_K
data B_C b = C_F
data B_B = C_D B_B | C_E Char B_B

v_a :: B_A B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((C_D _,C_D _)) _ -> 0 
  C_B ((C_D _,C_E _ _)) _ -> 1 
  C_B ((C_E _ _,C_D _)) _ -> 2 
  C_B ((C_E _ _,C_E _ _)) _ -> 3 
  C_C -> 4 
