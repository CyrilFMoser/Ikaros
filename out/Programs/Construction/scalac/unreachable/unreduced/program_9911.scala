package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Byte]]) extends T_A[T_A[Boolean]]
case class CC_B(a: Char, b: (Byte,T_B[CC_A, CC_A]), c: T_A[Byte]) extends T_A[T_A[Boolean]]
case class CC_C[D]() extends T_A[D]
case class CC_D[E]() extends T_B[Byte, E]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
  case CC_B(_, (_,_), CC_C()) => 1 
  case CC_C() => 2 
}
}