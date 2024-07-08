module Program_8 () where 

main = print $ show v_b
data B_A a b = C_A (B_B a) (B_B a)
data B_B c = C_B Int | C_C | C_D c ((Int,Bool))

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D _ ((_,_))) (C_D _ ((_,_))) -> 0 
  C_A (C_D _ _) _ -> 1 
