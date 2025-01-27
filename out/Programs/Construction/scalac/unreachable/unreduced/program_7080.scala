package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Byte, Boolean],T_A[Char, Boolean])]
case class CC_B[D]() extends T_A[D, (T_A[Byte, Boolean],T_A[Char, Boolean])]
case class CC_C[E](a: CC_B[CC_A[E]], b: CC_A[E]) extends T_A[E, (T_A[Byte, Boolean],T_A[Char, Boolean])]

val v_a: T_A[Int, (T_A[Byte, Boolean],T_A[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}