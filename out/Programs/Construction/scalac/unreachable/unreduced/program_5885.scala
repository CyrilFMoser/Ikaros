package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_A[(Char,Int)],T_A[Boolean])]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[(T_A[(Char,Int)],T_A[Boolean])]
case class CC_C[D](a: T_B[D, D], b: T_A[D], c: D) extends T_A[(T_A[(Char,Int)],T_A[Boolean])]
case class CC_D(a: T_A[T_B[CC_A, CC_A]], b: T_A[Int], c: (T_A[CC_B],CC_A)) extends T_B[CC_B, CC_C[CC_B]]
case class CC_E[E, F](a: Byte, b: (CC_B,Int), c: F) extends T_B[F, E]

val v_a: T_A[(T_A[(Char,Int)],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}