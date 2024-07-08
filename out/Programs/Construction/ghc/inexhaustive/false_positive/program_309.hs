module Program_28 () where 

 main = print $ show v_b
data B_A a = C_A Bool a | C_B | C_C
data B_B = C_D B_B B_B | C_E | C_F B_B | C_G | C_H

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E -> 1 
  C_F (C_D _ (C_D _ _)) -> 2 
  C_F (C_D _ C_E) -> 3 
  C_F (C_D _ (C_F _)) -> 4 
  C_F (C_D _ C_G) -> 5 
  C_F (C_D _ C_H) -> 6 
  C_F C_E -> 7 
  C_F (C_F (C_D _ _)) -> 8 
  C_F (C_F C_E) -> 9 
  C_F (C_F (C_F _)) -> 10 
  C_F (C_F C_H) -> 11 
  C_F C_G -> 12 
  C_F C_H -> 13 
  C_G -> 14 
  C_H -> 15 
