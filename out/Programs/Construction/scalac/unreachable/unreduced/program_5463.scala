package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[C, Int]) extends T_A[C, Int]
case class CC_B[D](a: CC_A[D], b: T_A[D, Int]) extends T_A[D, Int]
case class CC_C[E](a: E, b: Boolean) extends T_A[E, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _), _)) => 1 
  case CC_A(_, _, CC_C(_, _)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_, _) => 4 
}
}