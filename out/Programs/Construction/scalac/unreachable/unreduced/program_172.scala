package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_A[T_B]], c: T_B) extends T_A[(T_A[T_B],(T_B,T_B))]
case class CC_B(a: CC_A, b: Char) extends T_B
case class CC_C(a: CC_A, b: CC_A) extends T_B
case class CC_D(a: Int, b: T_B, c: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_D(12, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _)