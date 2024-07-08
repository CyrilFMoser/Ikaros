module Program_20 () where 

 main = print $ show v_b
data B_A = C_A (B_D B_A ((Bool,Bool))) | C_B Bool (B_D Char B_A) | C_C (B_B B_A) | C_D ((Bool,Bool))
data B_B a = C_E a | C_F (B_C B_A a) B_A | C_G Int
data B_C b c = C_H B_A B_A | C_I (B_C b b) | C_J ((B_A,Int)) | C_K b c | C_L ((B_A,(Int,Bool))) b
data B_D d e = C_M B_A | C_N (B_D d e) | C_O (B_B d)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_C (C_E _) -> 2 
  C_C (C_F _ (C_A _)) -> 3 
  C_C (C_F _ (C_B _ _)) -> 4 
  C_C (C_F _ (C_C _)) -> 5 
  C_C (C_G _) -> 6 
  C_D ((_,_)) -> 7 
