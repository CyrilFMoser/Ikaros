package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: (T_A[Char, Byte],T_A[Boolean, Char])) extends T_A[CC_A[(Boolean,Int)], T_A[CC_A[(Boolean,Int)], CC_A[(Boolean,Int)]]]

val v_a: T_A[CC_A[(Boolean,Int)], T_A[CC_A[(Boolean,Int)], CC_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A((_,_))) => 0 
  case CC_B(CC_A(CC_A(_)), (_,_)) => 1 
}
}