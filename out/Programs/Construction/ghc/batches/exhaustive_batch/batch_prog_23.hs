module Program_23 () where 

 main = print $ show v_b
data B_B = C_D Char | C_E (B_A B_B) (B_C B_B) | C_F | C_G
data B_A a = C_A (((Bool,Int),(Bool,Char))) Bool | C_B | C_C (((Bool,Bool),B_B))
data B_C b = C_H (B_C b) B_B | C_I B_B | C_J B_B (B_A B_B) | C_K b (B_A b)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C (((_,_),C_D _)) -> 2 
  C_C (((_,_),C_E _ _)) -> 3 
  C_C (((_,_),C_F)) -> 4 
  C_C (((_,_),C_G)) -> 5 
