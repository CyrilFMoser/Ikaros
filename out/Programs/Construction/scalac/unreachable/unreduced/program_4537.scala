package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Char,Char), T_B[Int, (Int,Byte)]]]
case class CC_B(a: Byte, b: CC_A, c: T_A[T_A[(Char,Boolean)]]) extends T_A[T_B[(Char,Char), T_B[Int, (Int,Byte)]]]
case class CC_C[D, E](a: D, b: Int) extends T_B[D, E]
case class CC_D[F, G]() extends T_B[F, G]

val v_a: T_A[T_B[(Char,Char), T_B[Int, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}