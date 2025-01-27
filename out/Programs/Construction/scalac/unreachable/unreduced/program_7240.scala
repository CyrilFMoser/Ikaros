package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[E, E]) extends T_A[D, E]
case class CC_B(a: Byte) extends T_A[CC_A[T_A[(Int,Char), Boolean], CC_A[Int, Boolean]], (T_B[Int],T_A[Byte, Int])]
case class CC_C(a: T_B[T_A[CC_B, CC_B]], b: CC_B) extends T_A[CC_A[T_A[(Int,Char), Boolean], CC_A[Int, Boolean]], (T_B[Int],T_A[Byte, Int])]
case class CC_D(a: CC_C, b: T_B[T_A[CC_C, Byte]]) extends T_B[CC_B]

val v_a: T_A[CC_A[T_A[(Int,Char), Boolean], CC_A[Int, Boolean]], (T_B[Int],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0) => 1 
  case CC_C(_, CC_B(_)) => 2 
}
}
// This is not matched: CC_B(_)