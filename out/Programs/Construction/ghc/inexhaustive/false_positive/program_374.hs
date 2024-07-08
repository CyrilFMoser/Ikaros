module Program_29 () where 

 main = print $ show v_b
data B_B = C_F B_B | C_G B_C
data B_C = C_H (B_A B_B ((Bool,Int))) | C_I (B_A B_B B_C) B_C | C_J (B_A B_B Char) ((Bool,B_B)) | C_K | C_L Int
data B_A a b = C_A ((Char,B_C)) | C_B (B_A ((Bool,Char)) ((Bool,Char))) B_C | C_C B_B | C_D B_B | C_E

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C _ -> 2 
  C_E -> 3 
