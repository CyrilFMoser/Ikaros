module Program_6 () where 

 main = print $ show v_b
data B_A a = C_A | C_B
data B_B b = C_C ((Bool,Int)) b | C_D | C_E (B_A b)
data B_C c d = C_F Char (B_B d) | C_G c | C_H (B_A d)
data B_D e f = C_I (B_D f f) | C_J (B_C f Char) | C_K (((Bool,Char),Int)) | C_L ((Char,Bool)) | C_M

v_a :: B_D Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I (C_I (C_I _)) -> 0 
  C_I (C_I (C_J _)) -> 1 
  C_I (C_I (C_K _)) -> 2 
  C_I (C_I (C_L _)) -> 3 
  C_I (C_I (C_M)) -> 4 
  C_I (C_J _) -> 5 
  C_I (C_K ((_,_))) -> 6 
  C_I (C_L ((_,_))) -> 7 
  C_I (C_M) -> 8 
  C_J _ -> 9 
  C_L _ -> 10 
  C_M -> 11 
