module Program_3 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((B_B,B_B)) (B_C B_B B_B) | C_C (B_C ((Bool,Int)) B_B) | C_D
data B_B = C_E | C_F (B_C B_B B_A)
data B_C a b = C_G (((Bool,Bool),B_A)) (((Bool,Int),B_A)) | C_H | C_I (B_C a a) (B_C a a)

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F (C_G ((_,_)) ((_,_))) -> 1 
  C_F (C_H) -> 2 
  C_F (C_I (C_G _ _) (C_G _ _)) -> 3 
  C_F (C_I (C_H) (C_G _ _)) -> 4 
  C_F (C_I (C_I _ _) (C_G _ _)) -> 5 
  C_F (C_I (C_G _ _) (C_H)) -> 6 
  C_F (C_I (C_H) (C_H)) -> 7 
  C_F (C_I (C_I _ _) (C_H)) -> 8 
  C_F (C_I (C_H) (C_I _ _)) -> 9 
  C_F (C_I (C_I _ _) (C_I _ _)) -> 10 
