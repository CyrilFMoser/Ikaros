package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Char]], c: (T_A[Char],T_A[Char])) extends T_A[Boolean]
case class CC_B[B](a: B) extends T_A[Boolean]
case class CC_C(a: CC_B[CC_B[Boolean]], b: T_A[Char]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, (_,_)), _, (_,_)) => 0 
  case CC_A(CC_B(_), _, (_,_)) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_B(CC_B(_)), _) => 3 
}
}
// This is not matched: CC_A(CC_C(_, _), _, (_,_))