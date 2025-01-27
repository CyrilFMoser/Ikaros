package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Int) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]], T_A[T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]], T_A[CC_B[Byte], T_A[CC_B[Byte], CC_B[Byte]]]]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}