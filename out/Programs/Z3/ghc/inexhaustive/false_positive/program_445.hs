module Program_3 () where 

main = print $ show v_b
data B_B a = C_C ((B_A,B_A)) B_A | C_D (B_B a) | C_E Int | C_F
data B_A = C_A (B_B B_A) (B_B Bool) | C_B

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((C_A (C_F) (C_D _),C_A (C_D _) (C_D _))) (C_A (C_C _ _) _) -> 0 
