package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(Byte,T_B[Char, Byte])]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[(Byte,T_B[Char, Byte])]
case class CC_C[D](a: CC_A) extends T_B[CC_A, D]

val v_a: T_A[(Byte,T_B[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}