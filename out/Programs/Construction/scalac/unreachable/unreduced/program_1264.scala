package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: CC_A[T_A[Byte]]) extends T_A[D]
case class CC_C[E](a: CC_B[E], b: T_A[E]) extends T_A[E]
case class CC_D(a: Char, b: T_A[CC_C[Byte]]) extends T_B[(CC_B[Byte],T_A[(Boolean,Int)])]

val v_a: T_B[(CC_B[Byte],T_A[(Boolean,Int)])] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_)) => 0 
  case CC_D(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_, _))