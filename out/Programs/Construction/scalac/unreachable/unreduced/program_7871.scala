package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, Boolean]) extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_A[T_B, Byte], Byte]]
case class CC_B(a: T_B, b: CC_A, c: Byte) extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_A[T_B, Byte], Byte]]
case class CC_C() extends T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_A[T_B, Byte], Byte]]

val v_a: T_A[T_A[T_A[T_B, T_B], T_B], T_A[T_A[T_B, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C() => 2 
}
}