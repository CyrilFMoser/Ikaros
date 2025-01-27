package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_A[T_B, T_B], T_B]) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B], b: T_A[T_A[Byte, CC_A], Boolean], c: T_B) extends T_A[T_B, T_B]
case class CC_C(a: CC_A, b: T_B) extends T_A[T_B, T_B]
case class CC_D(a: (((Boolean,Boolean),CC_A),Int), b: Int, c: T_A[T_B, T_B]) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}