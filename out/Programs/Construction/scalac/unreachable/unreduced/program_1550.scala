package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[(Int,Char)]]]
case class CC_B(a: T_B[T_A[CC_A]], b: T_A[T_A[CC_A]]) extends T_A[T_B[T_A[(Int,Char)]]]
case class CC_C[C](a: Char, b: Boolean) extends T_B[C]
case class CC_D() extends T_B[Byte]
case class CC_E[D](a: T_A[D], b: D) extends T_B[D]

val v_a: T_A[T_B[T_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _), _) => 1 
  case CC_B(CC_E(_, _), _) => 2 
}
}