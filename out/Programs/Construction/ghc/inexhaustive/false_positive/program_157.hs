module Program_7 () where 

 main = print $ show v_b
data B_A a b = C_A ((B_B,B_D)) (B_C b) | C_B | C_C (B_A a a) | C_D B_D | C_E Char Char
data B_D = C_J (B_C B_B) ((Bool,B_D)) | C_K (((Char,Int),Bool)) | C_L | C_M B_B | C_N ((B_D,B_D))
data B_B = C_F
data B_C c = C_G ((B_D,Char)) ((B_B,B_D)) | C_H (B_A c c) | C_I

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C _ -> 2 
  C_D (C_J _ ((_,_))) -> 3 
  C_D (C_K _) -> 4 
  C_D C_L -> 5 
  C_D (C_M C_F) -> 6 
  C_D (C_N ((_,_))) -> 7 
