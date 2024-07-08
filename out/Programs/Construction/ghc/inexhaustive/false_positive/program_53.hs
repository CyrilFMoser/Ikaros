module Program_28 () where 

 main = print $ show v_b
data B_C = C_H B_C | C_I B_C Int | C_J (B_B ((Char,Bool))) (B_B B_C) | C_K (B_A Char) (((Char,Bool),(Bool,Bool)))
data B_A a = C_A Int Char | C_B | C_C Bool | C_D
data B_B b = C_E | C_F (((Char,Bool),Bool)) | C_G Char

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (((_,_),_)) -> 0 
  C_G _ -> 1 
