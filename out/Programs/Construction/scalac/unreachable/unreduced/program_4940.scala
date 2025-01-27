package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B], c: T_A[T_A[T_B]]) extends T_A[T_A[Char]]
case class CC_B(a: Byte, b: CC_A, c: T_B) extends T_A[T_A[Char]]
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(CC_A(_, _, _))) => 1 
  case CC_D(CC_D(CC_D(_))) => 2 
  case CC_D(CC_D(CC_E(_))) => 3 
  case CC_D(CC_E(CC_D(_))) => 4 
  case CC_E(_) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_C(_)))