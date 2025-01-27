package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[(Char,Int), D], c: T_A[E, E]) extends T_A[E, D]
case class CC_B[F](a: Byte) extends T_A[F, (CC_A[Boolean, Int],Byte)]
case class CC_C[G](a: T_A[G, G], b: CC_B[G]) extends T_A[G, (CC_A[Boolean, Int],Byte)]
case class CC_D[H](a: T_A[H, H], b: T_B[H], c: T_A[H, H]) extends T_B[CC_B[T_A[Byte, Boolean]]]
case class CC_E(a: T_A[(Byte,Byte), T_B[(Boolean,Boolean)]]) extends T_B[CC_C[(Int,Char)]]

val v_a: T_A[T_B[CC_B[T_A[Byte, Boolean]]], (CC_A[Boolean, Int],Byte)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, _))