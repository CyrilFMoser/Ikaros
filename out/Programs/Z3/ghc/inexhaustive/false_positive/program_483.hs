module Program_7 () where 

main = print $ show v_b
data B_A a b = C_A (B_B a) (B_B a)
data B_B c = C_B Int | C_C | C_D c ((Int,Bool))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D _ ((_,_))) _ -> 0 
  C_A (C_D _ _) (C_C) -> 1 
  C_A _ (C_D _ ((_,_))) -> 2 
  C_A _ (C_D _ _) -> 3 
  C_A (C_D _ ((_,_))) (C_B _) -> 4 
  C_A (C_B _) (C_C) -> 5 
  C_A (C_B _) _ -> 6 
