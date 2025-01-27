package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[Byte, Byte],T_A[Byte, Char]), b: Int) extends T_A[Byte, T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A], b: T_B[CC_A, CC_A]) extends T_A[Byte, T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]]]
case class CC_C(a: Boolean, b: CC_A) extends T_A[Byte, T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]]]

val v_a: T_A[Byte, T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)