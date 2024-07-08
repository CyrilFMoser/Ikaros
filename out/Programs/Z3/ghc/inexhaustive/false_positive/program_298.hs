module Program_18 () where 

 main = print $ show v_b
data B_A a b = C_A ((Char,(Char,Char))) (B_A Int Int) | C_B | C_C ((Bool,Bool)) b | C_D (B_A a Int) (B_A a a)

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((_,(_,_))) (C_C _ _) -> 0 
  C_D (C_D (C_C _ _) (C_B)) (C_D _ _) -> 1 
