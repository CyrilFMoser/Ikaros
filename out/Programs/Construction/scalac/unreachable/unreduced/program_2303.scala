package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C[B](a: T_A[B]) extends T_A[T_B]
case class CC_D(a: (CC_A,CC_B), b: CC_B) extends T_B
case class CC_E(a: T_B, b: CC_A, c: (T_A[T_B],((Boolean,Boolean),(Char,Int)))) extends T_B
case class CC_F(a: CC_E, b: T_B, c: CC_C[CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_A(),CC_B()), CC_B()) => 0 
  case CC_E(CC_D((_,_), CC_B()), _, _) => 1 
  case CC_E(CC_F(CC_E(_, _, _), _, _), _, _) => 2 
  case CC_F(CC_E(_, _, _), _, CC_C(_)) => 3 
}
}
// This is not matched: CC_E(CC_E(_, _, _), _, _)