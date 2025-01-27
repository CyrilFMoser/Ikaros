package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_B) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_B, b: T_A[T_B], c: Int) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[CC_D], b: T_B, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, _) => 0 
  case CC_C(CC_D(_), _, _) => 1 
  case CC_D(CC_C(_, _, _)) => 2 
  case CC_D(CC_D(CC_C(_, _, _))) => 3 
  case CC_D(CC_D(CC_D(_))) => 4 
  case CC_D(CC_D(CC_E(_, _, _))) => 5 
  case CC_D(CC_E(_, _, CC_C(_, _, _))) => 6 
  case CC_E(_, _, _) => 7 
}
}
// This is not matched: CC_C(CC_E(_, _, CC_C(_, _, _)), _, _)