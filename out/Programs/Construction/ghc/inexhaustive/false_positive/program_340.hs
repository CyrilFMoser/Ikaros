module Program_27 () where 

 main = print $ show v_b
data B_C b = C_G
data B_B = C_E (B_C ((Char,Char))) (B_A B_B) | C_F (B_C B_B)
data B_A a = C_A (B_A B_B) ((Char,B_B)) | C_B a | C_C | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B _ -> 1 
  C_D -> 2 
