module Program_18 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b b) | C_B b (B_A b b) | C_C ((Int,Int)) (B_A a a) | C_D (B_B a a) b
data B_B c d = C_E c | C_F c (((Char,Char),Int)) | C_G d | C_H ((Bool,Bool)) (B_A c d)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((_,_)) (C_B _ (C_A _)) -> 0 
