module Program_7 () where 

 main = print $ show v_b
data B_A a = C_A | C_B ((Char,Bool)) | C_C | C_D Bool | C_E (B_A a) (B_A a)
data B_B b c = C_F | C_G
data B_C d e = C_H e

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
  C_D _ -> 2 
  C_E _ _ -> 3 
