module Program_7 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_B b) Int | C_C (B_B a) (B_A a a)
data B_B c = C_D c (((Int,Int),(Int,Int))) | C_E (B_A Bool c)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_E (C_B _ _)) _ -> 1 
  C_B (C_E (C_C _ _)) _ -> 2 
  C_C (C_D _ _) (C_C (C_E _) _) -> 3 
  C_C (C_E _) (C_B (C_D _ _) _) -> 4 
  C_C (C_E (C_C _ _)) (C_C (C_D _ _) (C_C _ _)) -> 5 
  C_C (C_D _ _) (C_C _ (C_A)) -> 6 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_D _ _) (C_B _ _)) -> 7 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_E _) _) -> 8 
  C_C (C_E _) (C_B _ _) -> 9 
  C_C (C_E (C_A)) _ -> 10 
  C_C (C_E (C_B _ _)) (C_C (C_E _) (C_A)) -> 11 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_E _) (C_B _ _)) -> 12 
  C_C (C_E (C_C _ _)) (C_C _ (C_B _ _)) -> 13 
  C_C (C_D _ _) (C_C (C_D _ _) (C_B _ _)) -> 14 
  C_C (C_E _) _ -> 15 
  C_C (C_E (C_B _ _)) (C_B (C_D _ _) _) -> 16 
  C_C (C_D _ (((_,_),(_,_)))) (C_C _ (C_A)) -> 17 
  C_C (C_E _) (C_C _ (C_A)) -> 18 
  C_C (C_D _ _) (C_C _ _) -> 19 
  C_C _ (C_C _ (C_B _ _)) -> 20 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_D _ _) (C_A)) -> 21 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_D _ _) (C_C _ _)) -> 22 
  C_C (C_E (C_B _ _)) (C_C (C_D _ _) (C_C _ _)) -> 23 
  C_C (C_E (C_B _ _)) (C_C (C_E _) _) -> 24 
  C_C (C_D _ _) (C_C (C_E _) (C_A)) -> 25 
  C_C (C_D _ _) _ -> 26 
  C_C _ (C_C _ (C_C _ _)) -> 27 
  C_C (C_D _ (((_,_),(_,_)))) (C_B (C_D _ _) _) -> 28 
  C_C (C_E (C_A)) (C_C _ (C_A)) -> 29 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_D _ _) _) -> 30 
  C_C (C_E (C_B _ _)) (C_C (C_D _ _) (C_A)) -> 31 
  C_C _ (C_B _ _) -> 32 
  C_C (C_D _ (((_,_),(_,_)))) (C_C _ (C_B _ _)) -> 33 
  C_C (C_D _ (((_,_),(_,_)))) (C_C _ (C_C _ _)) -> 34 
  C_C (C_E (C_A)) (C_C (C_E _) (C_C _ _)) -> 35 
  C_C (C_E (C_B _ _)) (C_C (C_E _) (C_C _ _)) -> 36 
  C_C (C_E (C_C _ _)) (C_B _ _) -> 37 
  C_C _ (C_B (C_E _) _) -> 38 
  C_C (C_E _) (C_C (C_E _) _) -> 39 
  C_C (C_E (C_B _ _)) (C_C (C_D _ _) _) -> 40 
  C_C (C_E (C_C _ _)) (C_C (C_E _) _) -> 41 
  C_C (C_D _ _) (C_A) -> 42 
  C_C (C_E _) (C_B (C_E _) _) -> 43 
  C_C (C_D _ (((_,_),(_,_)))) _ -> 44 
  C_C (C_E (C_B _ _)) (C_C _ (C_A)) -> 45 
  C_C _ (C_C (C_D _ _) (C_A)) -> 46 
  C_C (C_E (C_C _ _)) (C_B (C_E _) _) -> 47 
  C_C (C_E (C_C _ _)) _ -> 48 
  C_C (C_E _) (C_A) -> 49 
  C_C (C_E (C_A)) (C_C _ (C_B _ _)) -> 50 
  C_C (C_E (C_B _ _)) _ -> 51 
  C_C (C_E _) (C_C (C_E _) (C_C _ _)) -> 52 
  C_C (C_E (C_B _ _)) (C_C _ _) -> 53 
  C_C (C_E _) (C_C (C_D _ _) (C_B _ _)) -> 54 
  C_C (C_E (C_B _ _)) (C_C _ (C_C _ _)) -> 55 
  C_C (C_E (C_C _ _)) (C_C (C_D _ _) (C_A)) -> 56 
  C_C (C_D _ _) (C_C (C_E _) (C_C _ _)) -> 57 
  C_C _ (C_C (C_E _) (C_C _ _)) -> 58 
  C_C _ (C_C _ _) -> 59 
  C_C (C_E (C_A)) (C_C (C_D _ _) (C_C _ _)) -> 60 
  C_C (C_E _) (C_C (C_E _) (C_A)) -> 61 
  C_C (C_D _ (((_,_),(_,_)))) (C_C (C_E _) (C_C _ _)) -> 62 
  C_C (C_D _ _) (C_C (C_D _ _) _) -> 63 
  C_C (C_E (C_A)) (C_B _ _) -> 64 
  C_C _ (C_C (C_D _ _) _) -> 65 
  C_C _ (C_A) -> 66 
  C_C (C_E (C_A)) (C_B (C_D _ _) _) -> 67 
  C_C (C_D _ _) (C_B (C_E _) _) -> 68 
  C_C (C_E _) (C_C (C_D _ _) _) -> 69 
  C_C (C_E (C_A)) (C_C _ (C_C _ _)) -> 70 
  C_C (C_E (C_A)) (C_C (C_E _) (C_A)) -> 71 
  C_C (C_E (C_A)) (C_B (C_E _) _) -> 72 
  C_C (C_D _ (((_,_),(_,_)))) (C_A) -> 73 
  C_C (C_D _ _) (C_C (C_D _ _) (C_A)) -> 74 
  C_C (C_E _) (C_C (C_E _) (C_B _ _)) -> 75 
  C_C (C_E (C_C _ _)) (C_B (C_D _ _) _) -> 76 
