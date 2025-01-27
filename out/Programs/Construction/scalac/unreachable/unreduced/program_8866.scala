package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Int) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C() extends T_B[T_A[T_A[(Int,Byte)]], (CC_B[Char],T_A[Int])]
case class CC_D(a: (CC_C,T_A[CC_C]), b: Boolean, c: Byte) extends T_B[T_A[T_A[(Int,Byte)]], (CC_B[Char],T_A[Int])]
case class CC_E() extends T_B[T_A[T_A[(Int,Byte)]], (CC_B[Char],T_A[Int])]

val v_a: T_B[T_A[T_A[(Int,Byte)]], (CC_B[Char],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((CC_C(),CC_A(_, _, _)), _, _) => 1 
  case CC_D((CC_C(),CC_B(_)), _, _) => 2 
  case CC_E() => 3 
}
}