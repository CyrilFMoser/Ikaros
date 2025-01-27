package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[Char]]
case class CC_B(a: Int, b: Boolean) extends T_A[T_A[Char]]
case class CC_C(a: T_A[Char], b: CC_B) extends T_A[T_A[Char]]
case class CC_D(a: CC_A, b: CC_A, c: T_A[T_A[CC_B]]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _)) => 0 
  case CC_A(CC_E()) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, CC_B(_, _)) => 3 
}
}