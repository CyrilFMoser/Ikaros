module Program_1 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A a a) | C_C | C_D (B_B b)
data B_B c = C_E (B_B c) (B_B c) | C_F ((Char,Char)) c | C_G ((Int,Bool)) | C_H (B_A c c)

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F _ True -> 1 
  C_F _ False -> 2 
  C_G ((_,_)) -> 3 
  C_H (C_A) -> 4 
  C_H (C_B _) -> 5 
  C_H (C_C) -> 6 
  C_H (C_D (C_F _ _)) -> 7 
  C_H (C_D (C_G _)) -> 8 
  C_H (C_D (C_H _)) -> 9 
