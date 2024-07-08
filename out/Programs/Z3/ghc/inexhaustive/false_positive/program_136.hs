module Program_16 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b b) | C_B b (B_A b b) | C_C ((Int,Int)) (B_A a a) | C_D (B_B a a) b
data B_B c d = C_E c | C_F c (((Char,Char),Int)) | C_G d | C_H ((Bool,Bool)) (B_A c d)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_G _) -> 0 
  C_A (C_H _ (C_A _)) -> 1 
  C_A (C_H ((_,_)) (C_B _ _)) -> 2 
  C_C _ (C_A (C_H _ _)) -> 3 
