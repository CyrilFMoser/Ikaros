module Program_4 () where 

 main = print $ show v_b
data B_D f g = C_O ((Bool,Char)) | C_P (((Int,Char),Char)) (B_C g) | C_Q | C_R
data B_C e = C_J | C_K (B_C e) | C_L (B_C Bool) | C_M ((Char,Int)) | C_N e
data B_A a b = C_A (B_B b b) (B_B a a) | C_B (B_B b a) ((Char,Bool)) | C_C | C_D Bool | C_E (B_C b)
data B_B c d = C_F (B_A Int d) | C_G c (B_C c) | C_H (B_C c) | C_I (B_B d d) d

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J -> 0 
  C_K (C_J) -> 1 
  C_K (C_K _) -> 2 
  C_K (C_L _) -> 3 
  C_K (C_M _) -> 4 
  C_K (C_N _) -> 5 
  C_L (C_J) -> 6 
  C_L (C_K (C_J)) -> 7 
  C_L (C_K (C_K _)) -> 8 
  C_L (C_K (C_L _)) -> 9 
  C_L (C_K (C_N _)) -> 10 
  C_L (C_L (C_J)) -> 11 
  C_L (C_L (C_K _)) -> 12 
  C_L (C_L (C_L _)) -> 13 
  C_L (C_L (C_M _)) -> 14 
  C_L (C_L (C_N _)) -> 15 
  C_L (C_M _) -> 16 
  C_L (C_N _) -> 17 
  C_M ((_,_)) -> 18 
  C_N _ -> 19 
