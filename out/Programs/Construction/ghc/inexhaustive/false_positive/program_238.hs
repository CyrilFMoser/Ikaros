module Program_21 () where 

 main = print $ show v_b
data B_B b c = C_B (B_B c c) | C_C (B_B c c) | C_D (B_B b b) Bool | C_E Int | C_F c ((Bool,Char))
data B_A a = C_A

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C (C_B (C_B _)) -> 1 
  C_C (C_B (C_C _)) -> 2 
  C_C (C_B (C_D _ _)) -> 3 
  C_C (C_B (C_E _)) -> 4 
  C_C (C_B (C_F _ _)) -> 5 
  C_C (C_C _) -> 6 
  C_C (C_D (C_B _) _) -> 7 
  C_C (C_D (C_C _) _) -> 8 
  C_C (C_D (C_D _ _) _) -> 9 
  C_C (C_D (C_E _) _) -> 10 
  C_C (C_D (C_F _ _) _) -> 11 
  C_C (C_E _) -> 12 
  C_C (C_F _ ((_,_))) -> 13 
  C_D (C_B (C_B _)) _ -> 14 
  C_D (C_B (C_C _)) _ -> 15 
  C_D (C_B (C_D _ _)) _ -> 16 
  C_D (C_B (C_E _)) _ -> 17 
  C_D (C_B (C_F _ _)) _ -> 18 
  C_D (C_D _ _) _ -> 19 
  C_D (C_E _) _ -> 20 
  C_D (C_F _ ((_,_))) _ -> 21 
  C_E _ -> 22 
  C_F True _ -> 23 
  C_F False _ -> 24 
