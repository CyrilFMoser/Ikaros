module Program_24 () where 

 main = print $ show v_b
data B_B a = C_E B_A B_A
data B_C b = C_F (B_C b) Int | C_G (B_C b) | C_H ((Bool,Bool)) | C_I B_A | C_J
data B_A = C_A (B_B ((Int,Int))) | C_B | C_C | C_D (B_B ((Char,Bool)))

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G (C_F _ _) -> 1 
  C_G (C_G (C_F _ _)) -> 2 
  C_G (C_G (C_G _)) -> 3 
  C_G (C_G (C_H _)) -> 4 
  C_G (C_G (C_I _)) -> 5 
  C_G (C_G (C_J)) -> 6 
  C_G (C_H _) -> 7 
  C_G (C_J) -> 8 
  C_H ((_,_)) -> 9 
  C_I _ -> 10 
  C_J -> 11 
