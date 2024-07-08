module Program_26 () where 

 main = print $ show v_b
data B_D = C_J | C_K | C_L (B_A B_C) B_D | C_M B_D | C_N (((Int,Char),B_D)) Int
data B_C = C_I B_C
data B_B b c = C_F B_D b | C_G | C_H
data B_A a = C_A (B_A a) (B_B a a) | C_B B_C | C_C Char ((B_D,(Int,Bool))) | C_D | C_E a

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_F C_J _) -> 0 
  C_A _ (C_F C_K _) -> 1 
  C_A _ (C_F (C_L _ _) _) -> 2 
  C_A _ (C_F (C_M _) _) -> 3 
  C_A _ (C_F (C_N _ _) _) -> 4 
  C_A _ (C_G) -> 5 
  C_A _ (C_H) -> 6 
  C_B (C_I _) -> 7 
  C_C _ ((C_J,(_,_))) -> 8 
  C_C _ ((C_K,(_,_))) -> 9 
  C_C _ ((C_L _ _,(_,_))) -> 10 
  C_C _ ((C_M _,(_,_))) -> 11 
  C_C _ ((C_N _ _,(_,_))) -> 12 
  C_D -> 13 
  C_E _ -> 14 
