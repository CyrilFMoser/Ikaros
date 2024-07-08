module Program_13 () where 

 main = print $ show v_b
data B_A = C_A (((Char,Bool),B_A)) | C_B B_C B_C | C_C | C_D (((Int,Bool),B_C))
data B_B = C_E ((B_C,(Char,Bool))) | C_F B_B (B_D B_A) | C_G
data B_D a = C_K (B_D a) | C_L B_A Char | C_M Int Bool | C_N Int B_B | C_O Int
data B_C = C_H | C_I | C_J B_B ((B_B,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B C_H C_H -> 1 
  C_B C_H C_I -> 2 
  C_B C_H (C_J _ _) -> 3 
  C_B C_I C_H -> 4 
  C_B C_I C_I -> 5 
  C_B C_I (C_J _ _) -> 6 
  C_B (C_J (C_E _) ((_,_))) C_H -> 7 
  C_B (C_J (C_E _) ((_,_))) C_I -> 8 
  C_B (C_J (C_E _) ((_,_))) (C_J _ _) -> 9 
  C_B (C_J (C_F _ _) ((_,_))) C_I -> 10 
  C_B (C_J (C_F _ _) ((_,_))) (C_J _ _) -> 11 
  C_B (C_J C_G ((_,_))) C_H -> 12 
  C_B (C_J C_G ((_,_))) C_I -> 13 
  C_B (C_J C_G ((_,_))) (C_J _ _) -> 14 
  C_C -> 15 
  C_D (((_,_),C_H)) -> 16 
  C_D (((_,_),C_I)) -> 17 
  C_D (((_,_),C_J _ _)) -> 18 
