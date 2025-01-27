package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_A[C, C], c: T_B) extends T_A[T_B, C]
case class CC_B[D](a: D, b: T_A[T_B, D], c: T_B) extends T_A[T_B, D]

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), _) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _, _), _), _) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
}
}
// This is not matched: CC_A(_, _, _)