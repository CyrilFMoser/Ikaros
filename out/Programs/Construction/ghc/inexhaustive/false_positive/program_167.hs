module Program_15 () where 

 main = print $ show v_b
data B_B b c = C_C | C_D B_C | C_E (B_D B_C) | C_F b
data B_C = C_G (B_A ((Char,Int))) | C_H
data B_D d = C_I | C_J (B_D d)
data B_A a = C_A (((Bool,Int),B_C)) | C_B a (B_D a)

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_E (C_I) -> 1 
  C_E (C_J _) -> 2 
  C_F _ -> 3 
