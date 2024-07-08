module Program_9 () where 

 main = print $ show v_b
data B_B c = C_D Bool (((Bool,Int),Char))
data B_D e f = C_H | C_I | C_J (B_B f) (B_A Char ((Char,Char)))
data B_A a b = C_A ((Char,(Char,Int))) (B_B a) | C_B (B_A b b) (B_B b) | C_C (B_C a) (B_C b)
data B_C d = C_E | C_F (B_A d d) | C_G

v_a :: B_A Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A _ _) (C_D _ _) -> 1 
  C_B (C_B _ _) (C_D _ _) -> 2 
  C_B (C_C (C_E) (C_E)) (C_D _ _) -> 3 
  C_B (C_C (C_F _) (C_E)) (C_D _ _) -> 4 
  C_B (C_C (C_G) (C_E)) (C_D _ _) -> 5 
  C_B (C_C (C_E) (C_F _)) (C_D _ _) -> 6 
  C_B (C_C (C_F _) (C_F _)) (C_D _ _) -> 7 
  C_B (C_C (C_G) (C_F _)) (C_D _ _) -> 8 
  C_B (C_C (C_F _) (C_G)) (C_D _ _) -> 9 
  C_B (C_C (C_G) (C_G)) (C_D _ _) -> 10 
  C_C _ _ -> 11 
