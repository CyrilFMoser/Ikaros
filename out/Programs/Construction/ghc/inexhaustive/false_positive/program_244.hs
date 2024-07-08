module Program_27 () where 

 main = print $ show v_b
data B_A = C_A B_C (((Bool,Char),B_C)) | C_B (B_B B_C) | C_C Int (B_B ((Char,Int))) | C_D
data B_B a = C_E (B_B a) | C_F
data B_C = C_G ((B_C,Int)) ((B_C,B_C)) | C_H ((Bool,B_A)) (B_B B_C)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_G _ _) (((_,_),C_G _ _)) -> 0 
  C_A (C_G _ _) (((_,_),C_H _ _)) -> 1 
  C_A (C_H _ _) (((_,_),C_G _ _)) -> 2 
  C_A (C_H _ _) (((_,_),C_H _ _)) -> 3 
  C_B _ -> 4 
  C_D -> 5 
