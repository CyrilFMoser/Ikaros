package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: Boolean) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]) extends T_A[Byte, T_A[Byte, Byte]]
case class CC_C(a: Int) extends T_A[Byte, T_A[Byte, Byte]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}