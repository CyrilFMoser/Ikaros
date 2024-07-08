module Program_14 () where 

 main = print $ show v_b
data B_C = C_H Bool | C_I (B_D B_C) ((B_C,Char)) | C_J (B_B B_C) B_C
data B_A a = C_A Bool | C_B | C_C | C_D | C_E
data B_D c = C_K c ((B_C,B_C))
data B_B b = C_F | C_G

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D -> 3 
