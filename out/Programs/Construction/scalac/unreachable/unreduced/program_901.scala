package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[(T_A[Byte, (Byte,Boolean)],(Char,Byte)), D]
case class CC_B[E](a: Boolean, b: Int, c: Byte) extends T_A[(T_A[Byte, (Byte,Boolean)],(Char,Byte)), E]
case class CC_C[F](a: T_A[Boolean, F]) extends T_A[(T_A[Byte, (Byte,Boolean)],(Char,Byte)), F]
case class CC_D(a: CC_A[T_A[Boolean, Char]]) extends T_B[T_A[T_A[Char, Char], (Int,Byte)]]
case class CC_E(a: CC_B[T_A[CC_D, Byte]]) extends T_B[T_A[T_A[Char, Char], (Int,Byte)]]

val v_a: T_A[(T_A[Byte, (Byte,Boolean)],(Char,Byte)), CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12, 0) => 1 
  case CC_B(_, _, 0) => 2 
  case CC_B(_, 12, _) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: CC_B(_, _, _)