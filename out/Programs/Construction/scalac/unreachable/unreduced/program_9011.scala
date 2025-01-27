package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[T_B],T_B)]
case class CC_B(a: (T_B,T_A[CC_A]), b: T_B) extends T_B
case class CC_C(a: (CC_A,CC_B), b: Byte, c: T_B) extends T_B
case class CC_D(a: CC_B, b: CC_A, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _),_), _) => 0 
  case CC_B((CC_D(_, _, _),_), _) => 1 
  case CC_C((CC_A(),CC_B(_, _)), _, _) => 2 
  case CC_D(_, _, _) => 3 
}
}
// This is not matched: CC_B((CC_C(_, _, _),_), _)