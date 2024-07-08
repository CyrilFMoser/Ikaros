module Program_0 () where 

 main = print $ show v_b
data B_C = C_J | C_K | C_L Int | C_M Int | C_N
data B_B = C_F | C_G B_D | C_H | C_I
data B_D = C_O B_D | C_P B_D B_D | C_Q (((Int,Bool),B_D)) | C_R B_B B_B
data B_A a = C_A Int | C_B | C_C (((Bool,Char),B_D)) ((Int,B_C)) | C_D B_B | C_E a (((Bool,Bool),(Int,Bool)))

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (((_,_),C_O _)) _ -> 1 
  C_C (((_,_),C_P _ _)) _ -> 2 
  C_C (((_,_),C_Q _)) _ -> 3 
  C_C (((_,_),C_R _ _)) _ -> 4 
  C_D C_F -> 5 
  C_D (C_G _) -> 6 
  C_D C_H -> 7 
  C_D C_I -> 8 
  C_E _ _ -> 9 
