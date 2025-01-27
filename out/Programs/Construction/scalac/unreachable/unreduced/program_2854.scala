package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[CC_A[CC_A[Boolean]], D]
case class CC_C[E](a: T_A[E, (Char,Byte)], b: CC_A[E], c: T_A[E, T_A[E, E]]) extends T_A[CC_A[CC_A[Boolean]], E]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}