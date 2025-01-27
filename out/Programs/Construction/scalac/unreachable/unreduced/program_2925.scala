package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_A[D, D]], b: Char) extends T_A[T_A[D, D], D]
case class CC_B[E](a: E) extends T_A[T_A[E, E], E]
case class CC_C(a: CC_A[CC_A[(Int,Byte)]]) extends T_A[T_A[T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]]
case class CC_D(a: CC_B[CC_B[CC_C]], b: CC_B[T_B[CC_C]]) extends T_B[Char]
case class CC_E(a: (CC_A[CC_D],Char), b: CC_B[(Byte,CC_D)]) extends T_B[Char]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}