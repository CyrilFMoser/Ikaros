package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: (T_A[T_B, T_B],Int), b: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], c: CC_A[CC_A[(Char,Int)]]) extends T_B
case class CC_C(a: T_A[T_A[(Boolean,Boolean), CC_B], Char], b: T_A[(CC_B,Int), Char]) extends T_B
case class CC_D(a: T_A[Byte, Int], b: T_A[T_B, CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)