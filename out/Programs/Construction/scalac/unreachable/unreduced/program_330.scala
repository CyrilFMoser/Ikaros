package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Boolean, c: T_A[B]) extends T_A[(T_A[Char],T_A[Char])]
case class CC_B(a: CC_A[T_A[Boolean]], b: Boolean, c: Int) extends T_A[(T_A[Char],T_A[Char])]
case class CC_C(a: CC_A[CC_A[CC_B]], b: Int, c: CC_B) extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_B(_, true, _) => 0 
  case CC_B(_, false, _) => 1 
  case CC_C(CC_A(_, _, _), 12, _) => 2 
  case CC_C(CC_A(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_A(_, _, _)