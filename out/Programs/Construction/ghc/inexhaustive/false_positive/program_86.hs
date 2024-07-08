module Program_29 () where 

 main = print $ show v_b
data B_A a b = C_A ((B_C,B_C)) | C_B (((Char,Char),B_C)) (B_B b)
data B_C = C_F Char | C_G (((Int,Int),B_C)) ((Bool,B_C)) | C_H (B_D Int B_C) | C_I (B_B B_C) | C_J (B_B Bool)
data B_B c = C_C (((Char,Int),B_C)) | C_D | C_E (B_A c c) Int
data B_D d e = C_K (B_B d) (B_D d e)

v_a :: B_A B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
