package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Byte,Char), Boolean], T_A[Boolean, Char]], b: T_A[T_A[Char, Char], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], Boolean]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], Boolean]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}