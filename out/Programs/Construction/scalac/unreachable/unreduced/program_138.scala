package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: Char, c: T_A[T_A[Char]]) extends T_A[(T_B[Char],T_B[Char])]
case class CC_B[C](a: CC_A) extends T_B[C]
case class CC_C[D](a: D, b: T_B[D], c: T_B[D]) extends T_B[D]
case class CC_D[E](a: CC_C[E], b: CC_C[E], c: Char) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(CC_A(_, _, _), CC_B(_), CC_B(_)) => 1 
  case CC_C(CC_A(_, _, _), CC_B(_), CC_C(_, _, _)) => 2 
  case CC_C(CC_A(_, _, _), CC_B(_), CC_D(_, _, _)) => 3 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B(_)) => 4 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _)) => 5 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_D(_, _, _)) => 6 
  case CC_C(CC_A(_, _, _), CC_D(_, _, _), CC_B(_)) => 7 
  case CC_C(CC_A(_, _, _), CC_D(_, _, _), CC_C(_, _, _)) => 8 
  case CC_C(CC_A(_, _, _), CC_D(_, _, _), CC_D(_, _, _)) => 9 
  case CC_D(CC_C(_, _, _), _, _) => 10 
}
}