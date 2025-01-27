package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], D]
case class CC_C() extends T_B
case class CC_D(a: CC_B[T_A[CC_C, T_B]], b: Boolean, c: T_A[CC_B[(Int,Int)], CC_B[(Char,Int)]]) extends T_B
case class CC_E(a: Char, b: T_B) extends T_B

val v_a: T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
  case CC_A(CC_D(_, _, _)) => 1 
  case CC_A(CC_E(_, _)) => 2 
  case CC_B(_) => 3 
}
}