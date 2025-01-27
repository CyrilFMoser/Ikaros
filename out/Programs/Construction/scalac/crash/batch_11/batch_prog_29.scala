package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte) extends T_A[B]
case class CC_B[C](a: T_A[C], b: Int, c: (T_A[Char],CC_A[Boolean])) extends T_A[C]
case class CC_C(a: T_A[T_A[Char]]) extends T_A[Boolean]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}