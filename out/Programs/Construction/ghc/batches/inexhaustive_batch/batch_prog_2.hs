module Program_2 () where 

 main = print $ show v_b
data B_C = C_I
data B_B b c = C_E B_C (B_D Int b) | C_F ((Bool,B_C)) (B_A b) | C_G (B_B b c) ((B_C,B_C)) | C_H
data B_D d e = C_J B_C | C_K | C_L (B_A B_C) (B_D d d) | C_M
data B_A a = C_A (B_B a ((Int,Char))) (B_D a a) | C_B | C_C ((B_C,B_C)) (B_A a) | C_D (B_A a)

v_a :: B_D Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_L _ _ -> 1 
  C_M -> 2 
