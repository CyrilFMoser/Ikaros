package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_B], b: CC_A, c: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: CC_A) extends T_B
case class CC_D(a: T_A[T_A[Int]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(CC_C(_, _))) => 1 
  case CC_D(CC_A(CC_D(_))) => 2 
  case CC_D(CC_A(CC_E())) => 3 
  case CC_D(CC_B(_, _, CC_A(_))) => 4 
}
}
// This is not matched: CC_E()