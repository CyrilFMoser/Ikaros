module Program_13 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_C a b) | C_C (B_A a b) | C_D (B_A a a) ((Char,Bool)) | C_E (B_B a a)
data B_B c d = C_F (B_C c c) (B_C d c) | C_G | C_H Bool (((Bool,Bool),Char))
data B_C e f = C_I (B_B f f) (B_A Int e) | C_J | C_K Char

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_H _ (((_,_),_)) -> 1 
