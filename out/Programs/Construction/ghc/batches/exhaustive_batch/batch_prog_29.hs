module Program_29 () where 

 main = print $ show v_b
data B_C c d = C_G Char | C_H Char | C_I
data B_D e = C_J (B_A e) | C_K (B_C Int e) (B_A e) | C_L ((Bool,(Char,Char)))
data B_A a = C_A Int (B_D a) | C_B
data B_B b = C_C (B_C b b) | C_D ((Bool,Bool)) b | C_E Int Int | C_F

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_G _) -> 0 
  C_C (C_H _) -> 1 
  C_C (C_I) -> 2 
  C_D _ _ -> 3 
  C_E _ _ -> 4 
  C_F -> 5 
