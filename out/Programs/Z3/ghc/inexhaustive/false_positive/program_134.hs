module Program_14 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b b) | C_B b (B_A b b) | C_C ((Int,Int)) (B_A a a) | C_D (B_B a a) b
data B_B c d = C_E c | C_F c (((Char,Char),Int)) | C_G d | C_H ((Bool,Bool)) (B_A c d)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_H ((_,_)) (C_A _)) _ -> 0 
  C_D (C_H ((_,_)) (C_C _ _)) _ -> 1 
  C_A (C_H ((_,_)) _) -> 2 
  C_A (C_F _ _) -> 3 
  C_A (C_H ((_,_)) (C_A _)) -> 4 
  C_A (C_H _ _) -> 5 
  C_A (C_H _ (C_B _ _)) -> 6 
  C_A (C_H ((_,_)) (C_D _ _)) -> 7 
  C_B _ (C_C ((_,_)) (C_C _ _)) -> 8 
  C_B _ (C_C _ (C_A _)) -> 9 
  C_B _ (C_D (C_H _ _) _) -> 10 
  C_B _ (C_D (C_E _) _) -> 11 
  C_B _ (C_C ((_,_)) (C_B _ _)) -> 12 
  C_B _ (C_C _ (C_D _ _)) -> 13 
  C_B _ (C_C ((_,_)) _) -> 14 
  C_B _ (C_B _ (C_B _ _)) -> 15 
  C_B _ (C_B _ (C_C _ _)) -> 16 
  C_B _ (C_B _ (C_D _ _)) -> 17 
  C_B _ (C_A (C_G _)) -> 18 
  C_C _ (C_B _ (C_B _ _)) -> 19 
  C_C _ (C_C ((_,_)) (C_C _ _)) -> 20 
  C_C ((_,_)) (C_D (C_E _) _) -> 21 
  C_C ((_,_)) (C_C _ _) -> 22 
  C_C ((_,_)) (C_D (C_F _ _) _) -> 23 
  C_C ((_,_)) (C_C _ (C_A _)) -> 24 
  C_C _ (C_D (C_E _) _) -> 25 
  C_C ((_,_)) (C_C ((_,_)) (C_D _ _)) -> 26 
  C_C ((_,_)) (C_A (C_G _)) -> 27 
  C_C ((_,_)) (C_A (C_H _ _)) -> 28 
