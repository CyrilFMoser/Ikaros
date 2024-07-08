module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_B b) Int | C_C (B_B a) (B_A a a)
data B_B c = C_D c (((Int,Int),(Int,Int))) | C_E (B_A Bool c)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_B (C_E (C_A)) _ -> 1 
  C_B (C_D _ _) _ -> 2 
  C_C (C_E (C_A)) (C_C (C_E _) _) -> 3 
  C_C (C_E (C_A)) (C_C (C_E _) (C_B _ _)) -> 4 
  C_C (C_E (C_C _ _)) (C_C _ _) -> 5 
  C_C _ _ -> 6 
  C_C (C_D _ _) (C_B (C_D _ _) _) -> 7 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_E _) (C_A)) -> 8 
  C_C (C_E (C_B _ _)) (C_C _ (C_B _ _)) -> 9 
  C_C (C_E (C_A)) (C_A) -> 10 
  C_C (C_E _) (C_C (C_D _ _) (C_A)) -> 11 
  C_C (C_D _ (((_,_),(_,_)))) (C_B (C_E _) _) -> 12 
  C_C (C_E (C_C _ _)) (C_C _ (C_C _ _)) -> 13 
