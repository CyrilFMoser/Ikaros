package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: T_A[D], c: C) extends T_A[C]
case class CC_B[E](a: T_A[E], b: CC_A[Boolean, E], c: T_B[E]) extends T_A[E]
case class CC_C(a: Boolean, b: T_A[Char], c: T_A[CC_A[Int, Int]]) extends T_B[Boolean]
case class CC_D(a: Int, b: Char) extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(true, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_C(true, CC_B(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_C(true, CC_A(_, _, _), CC_B(_, _, _))) => 2 
  case CC_A(_, _, CC_C(true, CC_B(_, _, _), CC_B(_, _, _))) => 3 
  case CC_A(_, _, CC_C(false, CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, _, CC_C(false, CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_A(_, _, CC_C(false, CC_A(_, _, _), CC_B(_, _, _))) => 6 
  case CC_A(_, _, CC_C(false, CC_B(_, _, _), CC_B(_, _, _))) => 7 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 8 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 9 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 10 
}
}