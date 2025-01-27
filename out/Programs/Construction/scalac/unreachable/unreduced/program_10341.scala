package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Boolean,Char), Char]]
case class CC_B(a: T_B[CC_A, T_A[CC_A]], b: (Int,T_B[CC_A, CC_A])) extends T_A[T_B[(Boolean,Char), Char]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_B[(Boolean,Char), Char]]
case class CC_D() extends T_B[CC_B, (Char,Int)]

val v_a: T_A[T_B[(Boolean,Char), Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()