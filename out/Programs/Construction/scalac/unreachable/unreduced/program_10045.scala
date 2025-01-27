package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, (Boolean,Char)]) extends T_A[D]
case class CC_B(a: Char, b: T_A[T_A[Int]], c: T_A[CC_A[Byte]]) extends T_B[T_B[T_A[Char], T_A[(Char,Char)]], Byte]
case class CC_C() extends T_B[T_B[T_A[Char], T_A[(Char,Char)]], Byte]
case class CC_D(a: CC_A[Char], b: Byte) extends T_B[T_B[T_A[Char], T_A[(Char,Char)]], Byte]

val v_a: T_B[T_B[T_A[Char], T_A[(Char,Char)]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_, _), _), _) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}