package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[(Byte,Boolean)],T_B[(Boolean,Char)])) extends T_A[T_B[T_A[Byte]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: CC_B[D], b: D, c: T_B[T_A[D]]) extends T_B[D]
case class CC_D[E](a: E, b: Byte, c: T_B[E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_), CC_B()) => 1 
  case CC_C(_, CC_A(_), CC_C(_, _, _)) => 2 
  case CC_C(_, CC_A(_), CC_D(_, _, _)) => 3 
  case CC_D(_, _, _) => 4 
}
}