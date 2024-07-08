module Program_17 () where 

 main = print $ show v_b
data B_A a = C_A a Char | C_B (((Int,Int),B_C)) | C_C
data B_C = C_G Bool | C_H Bool | C_I (B_A B_B) B_C
data B_B = C_D (B_A B_B) | C_E ((B_B,(Int,Int))) (B_A B_C) | C_F
data B_D b = C_J | C_K B_C | C_L | C_M (B_A b) ((Char,B_B))

v_a :: B_D Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J -> 0 
  C_K (C_G _) -> 1 
  C_K (C_H _) -> 2 
  C_K (C_I _ _) -> 3 
  C_L -> 4 
  C_M (C_A _ _) ((_,C_D _)) -> 5 
  C_M (C_B _) ((_,C_D _)) -> 6 
  C_M (C_C) ((_,C_D _)) -> 7 
  C_M (C_A _ _) ((_,C_E _ _)) -> 8 
  C_M (C_B _) ((_,C_E _ _)) -> 9 
  C_M (C_C) ((_,C_E _ _)) -> 10 
  C_M (C_A _ _) ((_,C_F)) -> 11 
  C_M (C_C) ((_,C_F)) -> 12 
