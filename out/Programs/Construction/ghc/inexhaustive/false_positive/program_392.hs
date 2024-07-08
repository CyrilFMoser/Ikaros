module Program_16 () where 

 main = print $ show v_b
data B_C = C_I | C_J ((B_C,B_C)) B_C
data B_B c = C_E | C_F Char | C_G (B_B c) | C_H c Int
data B_A a b = C_A b | C_B | C_C a ((B_C,B_C)) | C_D (B_A a b) B_C

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F _ -> 1 
  C_H _ 12 -> 2 
  C_H _ _ -> 3 
