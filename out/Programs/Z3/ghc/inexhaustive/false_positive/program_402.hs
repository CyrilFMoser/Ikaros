module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A (B_A b b) (((Char,Bool),Int)) | C_B | C_C (B_A a a) Char | C_D Int a

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_C _ _) (((_,_),_))) (((_,_),_)) -> 0 
