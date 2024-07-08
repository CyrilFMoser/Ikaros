module Program_21 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B b (B_A ((Int,Bool)) ((Int,Bool))) | C_C b | C_D (B_A ((Int,Char)) a) (B_A b b)
data B_B c = C_E

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D (C_C _) (C_D _ _)) (C_D (C_C _) (C_B _ _)) -> 0 
  C_D (C_D _ (C_D _ _)) (C_D (C_D _ _) (C_B _ _)) -> 1 
  C_D (C_D (C_B _ _) (C_B _ _)) (C_D (C_A) (C_A)) -> 2 
  C_D (C_D (C_B _ _) (C_B _ _)) (C_B _ (C_C _)) -> 3 
  C_D (C_D (C_A) (C_A)) (C_D (C_C _) (C_B _ _)) -> 4 
  C_D (C_D (C_B _ _) (C_A)) (C_D (C_A) (C_D _ _)) -> 5 
  C_D (C_D _ (C_A)) (C_D (C_A) (C_A)) -> 6 
  C_D (C_D (C_A) (C_D _ _)) (C_B _ (C_C _)) -> 7 
  C_D (C_D (C_A) (C_C _)) (C_D (C_A) (C_C _)) -> 8 
  C_D (C_B _ (C_D _ _)) _ -> 9 
  C_D (C_D (C_A) (C_D _ _)) (C_D (C_D _ _) (C_C _)) -> 10 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_D (C_A) _) -> 11 
  C_D (C_B _ (C_B _ _)) (C_D (C_A) (C_A)) -> 12 
  C_D (C_D (C_D _ _) (C_B _ _)) (C_D (C_C _) _) -> 13 
  C_D (C_D (C_A) (C_C _)) (C_B _ (C_C _)) -> 14 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D _ (C_B _ _)) -> 15 
  C_D (C_D (C_D _ _) (C_C _)) (C_D (C_C _) (C_C _)) -> 16 
  C_D (C_D _ _) (C_B _ _) -> 17 
  C_D (C_D _ (C_B _ _)) (C_D (C_C _) (C_D _ _)) -> 18 
  C_D (C_D (C_A) (C_D _ _)) (C_D (C_D _ _) (C_D _ _)) -> 19 
  C_D (C_D _ _) (C_C _) -> 20 
  C_D (C_D (C_B _ _) _) (C_D (C_B _ _) (C_A)) -> 21 
  C_D (C_D (C_A) (C_A)) (C_D _ _) -> 22 
  C_D (C_D (C_C _) (C_D _ _)) (C_D _ (C_B _ _)) -> 23 
  C_D (C_B _ _) (C_D (C_B _ _) (C_D _ _)) -> 24 
  C_D (C_D (C_C _) _) (C_D (C_A) _) -> 25 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_D (C_A) (C_D _ _)) -> 26 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_B _ (C_C _)) -> 27 
  C_D (C_D _ (C_C _)) (C_D (C_B _ _) (C_D _ _)) -> 28 
  C_D (C_D _ _) (C_D (C_A) (C_D _ _)) -> 29 
  C_D (C_D _ _) _ -> 30 
  C_D (C_D (C_A) (C_B _ _)) (C_D _ _) -> 31 
  C_D (C_D (C_B _ _) _) (C_D (C_D _ _) (C_D _ _)) -> 32 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_A) -> 33 
  C_D (C_A) (C_D (C_D _ _) (C_D _ _)) -> 34 
  C_D (C_D _ (C_A)) (C_D _ _) -> 35 
  C_D (C_D (C_C _) (C_D _ _)) (C_D (C_C _) (C_D _ _)) -> 36 
  C_D (C_C _) (C_D _ (C_D _ _)) -> 37 
  C_D (C_D (C_A) (C_C _)) (C_B _ _) -> 38 
  C_D (C_D (C_A) _) (C_D (C_D _ _) (C_A)) -> 39 
  C_D (C_D (C_B _ _) (C_A)) (C_D (C_C _) (C_D _ _)) -> 40 
  C_D (C_D (C_B _ _) (C_C _)) (C_D (C_C _) _) -> 41 
  C_D (C_D (C_A) (C_A)) (C_D (C_B _ _) (C_C _)) -> 42 
  C_D (C_A) (C_D (C_A) (C_A)) -> 43 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_D (C_B _ _) (C_B _ _)) -> 44 
  C_D (C_A) (C_D (C_C _) (C_B _ _)) -> 45 
  C_D (C_D (C_A) (C_A)) (C_D (C_A) _) -> 46 
  C_D (C_D (C_B _ _) (C_C _)) (C_B _ (C_A)) -> 47 
  C_D (C_B _ (C_D _ _)) (C_C _) -> 48 
  C_D (C_D _ (C_B _ _)) (C_D (C_A) _) -> 49 
  C_D (C_D _ (C_A)) (C_D (C_B _ _) (C_B _ _)) -> 50 
  C_D (C_D (C_A) _) (C_D _ (C_A)) -> 51 
  C_D (C_D _ (C_B _ _)) (C_D (C_B _ _) _) -> 52 
  C_D (C_D (C_B _ _) (C_B _ _)) (C_C _) -> 53 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_D (C_B _ _) (C_C _)) -> 54 
