module Program_7 () where 

main = print $ show v_b
data B_A a b = C_A B_B (B_A b ((Char,Bool))) | C_B
data B_B = C_C B_B ((Int,B_B)) | C_D B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_D _) _ -> 0 
  C_C (C_C (C_C _ _) _) ((_,C_C (C_C _ _) ((_,_)))) -> 1 
  C_C (C_D (C_C _ _)) ((_,C_C (C_D _) _)) -> 2 
  C_C (C_C (C_D _) ((_,C_D _))) _ -> 3 
  C_C (C_D (C_D _)) ((_,C_C (C_C _ _) _)) -> 4 
  C_C (C_C (C_C _ _) ((_,C_D _))) ((_,C_C (C_C _ _) _)) -> 5 
  C_C (C_C (C_D _) ((_,C_D _))) ((_,C_C (C_C _ _) ((_,_)))) -> 6 
  C_C (C_C (C_D _) _) ((_,C_C _ ((_,_)))) -> 7 
  C_C (C_C _ ((_,C_C _ _))) ((_,C_C (C_D _) ((_,_)))) -> 8 
  C_C (C_D _) ((_,C_C (C_D _) _)) -> 9 
  C_C (C_C (C_D _) ((_,C_C _ _))) ((_,C_D _)) -> 10 
  C_C (C_C (C_C _ _) _) ((_,C_C _ ((_,_)))) -> 11 
  C_C _ ((_,C_D (C_D _))) -> 12 
  C_C (C_C (C_D _) _) _ -> 13 
  C_C (C_D (C_C _ _)) ((_,C_D _)) -> 14 
  C_C (C_C _ _) ((_,C_C _ ((_,_)))) -> 15 
  C_C _ ((_,C_D _)) -> 16 
  C_C (C_C _ _) ((_,C_C (C_D _) _)) -> 17 
  C_C (C_D (C_D _)) _ -> 18 
  C_C (C_C (C_D _) ((_,C_C _ _))) ((_,C_D (C_C _ _))) -> 19 
  C_C (C_D (C_C _ _)) ((_,C_D (C_D _))) -> 20 
  C_C (C_C (C_D _) ((_,C_C _ _))) ((_,C_C _ ((_,_)))) -> 21 
  C_C (C_D (C_D _)) ((_,C_D (C_D _))) -> 22 
  C_C _ ((_,C_C (C_D _) ((_,_)))) -> 23 
  C_C (C_D _) ((_,C_C (C_D _) ((_,_)))) -> 24 
  C_D (C_C _ _) -> 25 
  C_D (C_D (C_D _)) -> 26 
  C_D (C_D _) -> 27 
  C_D (C_C (C_D _) ((_,C_D _))) -> 28 
  C_D (C_C (C_D _) ((_,C_C _ _))) -> 29 
  C_D (C_C (C_C _ _) _) -> 30 
