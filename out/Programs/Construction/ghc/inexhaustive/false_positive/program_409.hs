module Program_31 () where 

 main = print $ show v_b
data B_A a = C_A a | C_B (B_B a) | C_C a | C_D B_C
data B_C = C_H ((B_C,(Bool,Bool))) B_C | C_I (B_B B_C) B_C | C_J Bool (B_A B_C) | C_K (B_A Int)
data B_B b = C_E b B_C | C_F (B_A ((Bool,Char))) b | C_G (B_B b) b

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_E 'x' _) -> 1 
  C_B (C_E _ _) -> 2 
  C_B (C_F _ _) -> 3 
  C_B (C_G _ _) -> 4 
  C_C _ -> 5 
  C_D (C_H _ _) -> 6 
  C_D (C_I _ _) -> 7 
  C_D (C_J _ (C_A _)) -> 8 
  C_D (C_J _ (C_C _)) -> 9 
  C_D (C_J _ (C_D _)) -> 10 
  C_D (C_K _) -> 11 
