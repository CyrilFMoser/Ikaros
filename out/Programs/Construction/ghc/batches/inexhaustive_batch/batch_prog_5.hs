module Program_5 () where 

main = print $ show v_b
data B_A = C_A B_A B_A B_A | C_B B_A ((Bool,B_A))
data B_B = C_C B_A Bool B_B | C_D Bool Bool B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_A _ _ _) _ -> 0 
  C_A _ (C_B _ ((_,_))) _ -> 1 
  C_B (C_A (C_A _ _ _) (C_A _ _ _) (C_A _ _ _)) ((_,C_A _ _ _)) -> 2 
  C_B (C_A (C_A _ _ _) (C_A _ _ _) (C_A _ _ _)) ((_,C_B _ _)) -> 3 
  C_B (C_A (C_A _ _ _) (C_B _ _) (C_A _ _ _)) ((_,C_A _ _ _)) -> 4 
  C_B (C_A (C_A _ _ _) (C_B _ _) (C_A _ _ _)) ((_,C_B _ _)) -> 5 
  C_B (C_A (C_B _ _) (C_A _ _ _) (C_A _ _ _)) ((_,C_A _ _ _)) -> 6 
  C_B (C_A (C_B _ _) (C_A _ _ _) (C_A _ _ _)) ((_,C_B _ _)) -> 7 
  C_B (C_A (C_B _ _) (C_B _ _) (C_A _ _ _)) ((_,C_A _ _ _)) -> 8 
  C_B (C_A (C_B _ _) (C_B _ _) (C_A _ _ _)) ((_,C_B _ _)) -> 9 
  C_B (C_A (C_A _ _ _) (C_A _ _ _) (C_B _ _)) ((_,C_A _ _ _)) -> 10 
  C_B (C_A (C_A _ _ _) (C_A _ _ _) (C_B _ _)) ((_,C_B _ _)) -> 11 
  C_B (C_A (C_A _ _ _) (C_B _ _) (C_B _ _)) ((_,C_A _ _ _)) -> 12 
  C_B (C_A (C_A _ _ _) (C_B _ _) (C_B _ _)) ((_,C_B _ _)) -> 13 
  C_B (C_A (C_B _ _) (C_A _ _ _) (C_B _ _)) ((_,C_A _ _ _)) -> 14 
  C_B (C_A (C_B _ _) (C_A _ _ _) (C_B _ _)) ((_,C_B _ _)) -> 15 
  C_B (C_A (C_B _ _) (C_B _ _) (C_B _ _)) ((_,C_A _ _ _)) -> 16 
  C_B (C_A (C_B _ _) (C_B _ _) (C_B _ _)) ((_,C_B _ _)) -> 17 
  C_B (C_B _ _) ((_,C_A _ _ _)) -> 18 

--  This is not matched: C_B (C_B _ _) ((_,C_B _ _))