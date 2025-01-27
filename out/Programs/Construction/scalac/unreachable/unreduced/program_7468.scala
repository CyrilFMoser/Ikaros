package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Byte,Int), T_B[Byte, Byte]], b: Byte, c: Char) extends T_A[T_B[T_B[(Char,Boolean), Boolean], T_B[(Int,Char), Int]]]
case class CC_B[D](a: D, b: CC_A) extends T_B[(Byte,T_B[Byte, CC_A]), D]
case class CC_C[E]() extends T_B[(Byte,T_B[Byte, CC_A]), E]
case class CC_D[F](a: CC_C[T_B[CC_A, F]]) extends T_B[(Byte,T_B[Byte, CC_A]), F]

val v_a: T_B[(Byte,T_B[Byte, CC_A]), Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, 'x')) => 0 
  case CC_C() => 1 
  case CC_D(CC_C()) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _))