module Program_27 () where 

 main = print $ show v_b
data B_C e f = C_I f (B_C e e) | C_J e e
data B_A a b = C_A | C_B ((Char,Bool)) | C_C a (B_B ((Bool,Bool)) b) | C_D (B_B a a) | C_E (B_A b b) Char
data B_B c d = C_F (B_C Char d) Int | C_G (B_A c d) (B_C c c) | C_H ((Int,(Char,Char))) (((Char,Int),Bool))

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_H ((_,(_,_))) (((_,_),_)) -> 1 
