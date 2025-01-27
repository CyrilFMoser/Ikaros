package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: (T_A,T_A), c: B) extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: Char) extends T_A
case class CC_C(a: CC_A[Boolean]) extends T_B[T_B[Boolean]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}