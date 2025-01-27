package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: CC_A[CC_B]) extends T_A[T_B]
case class CC_D(a: Char, b: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, CC_A(_, _))) => 2 
  case CC_C(CC_A(_, CC_B())) => 3 
}
}
// This is not matched: CC_C(CC_A(_, CC_C(_)))