module Program_15 () where 

 main = print $ show v_b
data B_A = C_A ((B_A,Bool)) (B_B B_C)
data B_C = C_D | C_E (B_B ((Char,Bool))) | C_F B_C (((Bool,Int),B_C)) | C_G B_C
data B_B a = C_B | C_C B_A

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E _ -> 1 
  C_F _ (((_,_),C_D)) -> 2 
  C_F _ (((_,_),C_F _ _)) -> 3 
  C_F _ (((_,_),C_G _)) -> 4 
  C_G C_D -> 5 
  C_G (C_E (C_B)) -> 6 
  C_G (C_E (C_C _)) -> 7 
  C_G (C_F C_D _) -> 8 
  C_G (C_F (C_E _) _) -> 9 
  C_G (C_F (C_F _ _) _) -> 10 
  C_G (C_F (C_G _) _) -> 11 
  C_G (C_G C_D) -> 12 
  C_G (C_G (C_E _)) -> 13 
  C_G (C_G (C_F _ _)) -> 14 
  C_G (C_G (C_G _)) -> 15 
