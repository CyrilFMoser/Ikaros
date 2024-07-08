module Program_4 () where 

 main = print $ show v_b
data B_C e = C_G (B_C e) (((Char,Bool),(Bool,Int))) | C_H | C_I Bool | C_J Char ((Bool,Bool))
data B_A a b = C_A | C_B (B_D b) | C_C (B_B b b)
data B_D f = C_K (((Int,Bool),Char)) (B_B f f) | C_L | C_M | C_N
data B_B c d = C_D Char d | C_E ((Bool,Char)) (B_C c) | C_F (B_D d)

v_a :: B_A Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
  C_C (C_D _ _) -> 2 
  C_C (C_E _ (C_G _ _)) -> 3 
  C_C (C_E _ (C_H)) -> 4 
  C_C (C_E _ (C_I _)) -> 5 
  C_C (C_E _ (C_J _ _)) -> 6 
  C_C (C_F (C_K _ _)) -> 7 
  C_C (C_F (C_M)) -> 8 
  C_C (C_F (C_N)) -> 9 
