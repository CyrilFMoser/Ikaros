module Program_15 () where 

 main = print $ show v_b
data B_A a b = C_A ((Char,(Char,Char))) (B_A Int Int) | C_B | C_C ((Bool,Bool)) b | C_D (B_A a Int) (B_A a a)

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((_,(_,_))) (C_A ((_,(_,_))) _) -> 0 
  C_A ((_,(_,_))) (C_D (C_C _ _) (C_D _ _)) -> 1 
  C_D (C_A ((_,(_,_))) (C_A _ _)) (C_D (C_A _ _) (C_B)) -> 2 
  C_D (C_D (C_B) (C_C _ _)) (C_D (C_C _ _) (C_D _ _)) -> 3 
