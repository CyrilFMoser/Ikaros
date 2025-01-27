package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], T_A[T_A[Byte, Byte], Byte]]
case class CC_B(a: Char) extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], T_A[T_A[Byte, Byte], Byte]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: CC_A()