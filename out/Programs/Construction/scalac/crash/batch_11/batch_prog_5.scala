package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Char]]) extends T_A[T_A[(Int,(Boolean,Boolean))]]
case class CC_B[B](a: B, b: CC_A, c: T_A[B]) extends T_A[B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 0 
  case CC_A(_, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 1 
}
}