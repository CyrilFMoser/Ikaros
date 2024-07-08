module Program_2 () where 

 main = print $ show v_b
data B_C e f = C_C | C_D e e | C_E (B_D Int) | C_F (B_B Char f) | C_G
data B_A a b = C_A Bool a
data B_D g = C_H (B_A g g) | C_I | C_J g | C_K ((Bool,Int)) ((Int,Int))
data B_B c d = C_B d (B_B c c)

v_a :: B_C Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D _ _ -> 1 
  C_E (C_H _) -> 2 
  C_E (C_I) -> 3 
  C_E (C_J 12) -> 4 
  C_E (C_J _) -> 5 
  C_E (C_K ((_,_)) _) -> 6 
  C_F _ -> 7 
