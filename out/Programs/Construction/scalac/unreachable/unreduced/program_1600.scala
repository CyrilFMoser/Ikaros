package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char]) extends T_A[Boolean]
case class CC_B(a: CC_A) extends T_A[Boolean]
case class CC_C(a: (T_A[CC_A],CC_B), b: T_B[Byte]) extends T_A[Boolean]
case class CC_D[C](a: (T_B[CC_B],CC_C), b: CC_B, c: CC_C) extends T_B[C]
case class CC_E[D]() extends T_B[D]
case class CC_F(a: T_B[CC_A]) extends T_B[CC_D[T_A[Boolean]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
  case CC_B(_) => 1 
  case CC_C((_,_), CC_D(_, _, _)) => 2 
  case CC_C((_,_), CC_E()) => 3 
}
}
// This is not matched: CC_A(CC_D(_, _, _))