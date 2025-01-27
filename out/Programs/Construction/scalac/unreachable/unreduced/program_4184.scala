package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C(a: ((Char,(Char,Byte)),T_A[Char]), b: CC_B[(Boolean,Char)]) extends T_A[CC_A[T_A[Boolean]]]
case class CC_D[F](a: F, b: Boolean, c: (CC_A[CC_C],T_A[CC_C])) extends T_B[CC_A[CC_A[Int]], F]
case class CC_E[G, H](a: (CC_B[CC_C],T_A[CC_C]), b: CC_D[H], c: CC_A[G]) extends T_B[CC_A[CC_A[Int]], G]
case class CC_F() extends T_B[CC_A[CC_A[Int]], T_A[(Int,CC_C)]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}