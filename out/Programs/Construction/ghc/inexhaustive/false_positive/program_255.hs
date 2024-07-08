module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A (B_B b) | C_B | C_C B_C
data B_D d = C_K | C_L (B_D d) (B_D ((Char,Bool))) | C_M (B_B d) | C_N ((B_C,Int)) (B_A ((Bool,Bool)) d) | C_O Bool
data B_B c = C_D | C_E c
data B_C = C_F (B_B B_C) Int | C_G (B_A ((Char,Bool)) B_C) | C_H | C_I (B_D B_C) | C_J ((B_C,B_C))

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G (C_A _) -> 1 
  C_G (C_C _) -> 2 
  C_H -> 3 
  C_I _ -> 4 
  C_J _ -> 5 
