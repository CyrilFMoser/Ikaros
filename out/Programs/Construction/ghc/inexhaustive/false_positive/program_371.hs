module Program_26 () where 

 main = print $ show v_b
data B_D e = C_I | C_J (B_B e Char)
data B_A a = C_A ((Char,Bool)) | C_B | C_C (B_A a) | C_D
data B_C d = C_F | C_G (((Bool,Char),Int)) (((Bool,Int),Bool)) | C_H (B_C d) Int
data B_B b c = C_E (B_D b)

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ _ -> 1 
  C_H (C_G _ ((_,_))) _ -> 2 
  C_H (C_H _ _) _ -> 3 
