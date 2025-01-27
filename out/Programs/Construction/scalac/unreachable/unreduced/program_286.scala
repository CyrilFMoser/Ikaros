package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Boolean) extends T_A[D, T_A[D, D]]
case class CC_C(a: Char, b: T_A[T_A[Byte, Byte], CC_A[Byte]], c: T_A[T_A[(Int,Char), Boolean], T_A[T_A[(Int,Char), Boolean], T_A[(Int,Char), Boolean]]]) extends T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]]

val v_a: T_A[CC_A[CC_A[Byte]], T_A[CC_A[CC_A[Byte]], CC_A[CC_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, CC_A()) => 1 
  case CC_C(_, _, CC_B(_)) => 2 
}
}
// This is not matched: CC_B(_)