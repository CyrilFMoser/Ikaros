module Program_22 () where 

 main = print $ show v_b
data B_A = C_A ((B_B,B_B)) B_A | C_B Bool
data B_B = C_C B_B | C_D ((B_A,(Char,Char))) | C_E | C_F B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_F (C_D _)) -> 0 
  C_F (C_F (C_C _)) -> 1 
  C_F (C_C C_E) -> 2 
  C_F (C_F _) -> 3 
  C_C (C_F (C_D _)) -> 4 
  C_C (C_F C_E) -> 5 
  C_C _ -> 6 
  C_C C_E -> 7 
  C_D ((C_A _ _,(_,_))) -> 8 
