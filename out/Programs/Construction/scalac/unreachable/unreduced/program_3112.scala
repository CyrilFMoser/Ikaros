package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, (T_A[Boolean, Boolean],T_A[(Boolean,Boolean), Char])]
case class CC_B[D](a: CC_A[D], b: D, c: T_A[D, D]) extends T_A[D, (T_A[Boolean, Boolean],T_A[(Boolean,Boolean), Char])]
case class CC_C[E](a: CC_A[E], b: Byte) extends T_A[E, (T_A[Boolean, Boolean],T_A[(Boolean,Boolean), Char])]

val v_a: T_A[Byte, (T_A[Boolean, Boolean],T_A[(Boolean,Boolean), Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(0, _, _), _, _) => 1 
  case CC_B(CC_A(_, _, _), _, _) => 2 
  case CC_C(_, _) => 3 
}
}