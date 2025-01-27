package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_B[(Byte,Int), Int],T_B[Char, Boolean])]
case class CC_B[D](a: T_A[D]) extends T_B[Char, D]
case class CC_C[E](a: T_B[Char, E], b: CC_A, c: (T_B[Char, CC_A],T_A[CC_A])) extends T_B[Char, E]
case class CC_D() extends T_B[Char, Boolean]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(), _) => 1 
}
}