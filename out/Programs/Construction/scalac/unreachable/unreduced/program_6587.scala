package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[T_A[(T_B,T_B)]]
case class CC_B(a: T_A[CC_A[T_B]], b: Byte, c: T_B) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_B, b: CC_A[Int], c: T_B) extends T_B

val v_a: T_A[T_A[(T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_D(_, CC_A(_), CC_B(_, _, _))) => 1 
  case CC_A(CC_D(_, CC_A(_), CC_C(_))) => 2 
  case CC_A(CC_D(_, CC_A(_), CC_D(_, _, _))) => 3 
}
}
// This is not matched: CC_A(CC_C(CC_B(_, _, _)))