module Program_31 () where 

 main = print $ show v_b
data B_D = C_K B_D (B_C B_D B_D)
data B_B c = C_B (((Int,Int),Bool)) | C_C ((B_D,B_D)) | C_D (B_C c c) ((B_D,(Int,Char))) | C_E | C_F (B_C c c) (B_A c c)
data B_C d e = C_G | C_H (B_A e e) d | C_I | C_J d (B_A e d)
data B_A a b = C_A a

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C _ -> 1 
  C_D (C_H _ _) ((C_K _ _,(_,_))) -> 2 
  C_D (C_I) ((C_K _ _,(_,_))) -> 3 
  C_D (C_J _ _) ((C_K _ _,(_,_))) -> 4 
  C_E -> 5 
  C_F _ _ -> 6 
