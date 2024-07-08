module Program_6 () where 

main = print $ show v_b
data B_B c = C_B Int | C_C | C_D c ((Int,Bool))
data B_A a b = C_A (B_B a) (B_B a)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_C) (C_B _) -> 0 
  C_A _ (C_B _) -> 1 
  C_A (C_D _ _) (C_D _ _) -> 2 
  C_A (C_D _ ((_,_))) (C_D _ _) -> 3 
  C_A (C_D _ _) (C_B _) -> 4 
  C_A (C_D _ ((_,_))) (C_C) -> 5 
  C_A (C_D _ _) (C_D _ ((_,_))) -> 6 
  C_A (C_C) (C_C) -> 7 
