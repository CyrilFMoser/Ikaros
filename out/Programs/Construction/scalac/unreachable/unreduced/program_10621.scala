package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B[C](a: T_A, b: T_B[C, T_B[C, C]], c: T_A) extends T_B[C, T_B[C, C]]
case class CC_C[D](a: Int, b: T_B[D, D], c: T_B[D, T_B[D, D]]) extends T_B[D, T_B[D, D]]
case class CC_D[E](a: CC_A, b: T_A) extends T_B[E, T_B[E, E]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, CC_B(CC_A(_), _, CC_A(_))) => 1 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 2 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 3 
  case CC_C(_, _, CC_C(_, _, CC_D(_, _))) => 4 
  case CC_D(_, _) => 5 
}
}
// This is not matched: CC_C(_, _, CC_D(CC_A(_), _))