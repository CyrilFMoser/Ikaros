module Program_26 () where 

 main = print $ show v_b
data B_C d = C_I ((Bool,Int))
data B_A a = C_A Char (B_C a) | C_B a (((Int,Int),Bool)) | C_C | C_D Char
data B_B b c = C_E (B_A c) | C_F Int b | C_G ((Int,Char)) (B_B Bool Bool) | C_H

v_a :: B_B Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_A _ (C_I _)) -> 0 
  C_E (C_B _ ((_,_))) -> 1 
  C_E (C_C) -> 2 
  C_F 12 _ -> 3 
  C_F _ _ -> 4 
  C_G _ (C_E _) -> 5 
  C_G _ (C_F _ _) -> 6 
  C_G _ (C_G _ _) -> 7 
  C_G _ (C_H) -> 8 
  C_H -> 9 
