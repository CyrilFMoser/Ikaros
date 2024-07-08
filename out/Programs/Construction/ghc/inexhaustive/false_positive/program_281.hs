module Program_31 () where 

 main = print $ show v_b
data B_C = C_G ((Bool,B_C)) B_C | C_H B_C | C_I (B_D B_C) (B_D B_C) | C_J ((B_C,B_C)) B_C
data B_D c = C_K (((Char,Char),(Bool,Char))) | C_L (B_A c) ((B_C,(Bool,Char)))
data B_A a = C_A a
data B_B b = C_B (((Bool,Int),Int)) | C_C | C_D | C_E ((B_C,B_C)) (B_B b) | C_F (B_B b) (B_B b)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H (C_G _ _) -> 1 
  C_H (C_H (C_G _ _)) -> 2 
  C_H (C_H (C_H _)) -> 3 
  C_H (C_H (C_I _ _)) -> 4 
  C_H (C_H (C_J _ _)) -> 5 
  C_H (C_I _ _) -> 6 
  C_H (C_J _ (C_G _ _)) -> 7 
  C_H (C_J _ (C_H _)) -> 8 
  C_H (C_J _ (C_I _ _)) -> 9 
  C_H (C_J _ (C_J _ _)) -> 10 
  C_I (C_K ((_,_))) _ -> 11 
  C_I (C_L (C_A _) _) _ -> 12 
  C_J ((C_G _ _,C_G _ _)) _ -> 13 
  C_J ((C_G _ _,C_H _)) _ -> 14 
  C_J ((C_G _ _,C_I _ _)) _ -> 15 
  C_J ((C_G _ _,C_J _ _)) _ -> 16 
  C_J ((C_H _,C_G _ _)) _ -> 17 
  C_J ((C_H _,C_H _)) _ -> 18 
  C_J ((C_H _,C_J _ _)) _ -> 19 
  C_J ((C_I _ _,C_G _ _)) _ -> 20 
  C_J ((C_I _ _,C_H _)) _ -> 21 
  C_J ((C_I _ _,C_I _ _)) _ -> 22 
  C_J ((C_I _ _,C_J _ _)) _ -> 23 
  C_J ((C_J _ _,C_G _ _)) _ -> 24 
  C_J ((C_J _ _,C_H _)) _ -> 25 
  C_J ((C_J _ _,C_I _ _)) _ -> 26 
  C_J ((C_J _ _,C_J _ _)) _ -> 27 
