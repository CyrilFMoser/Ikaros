package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Char, Int],T_A[Char, Byte])) extends T_A[E, T_A[E, E]]
case class CC_B() extends T_A[T_B[CC_A[Byte], T_A[Boolean, Byte]], T_A[T_B[CC_A[Byte], T_A[Boolean, Byte]], T_B[CC_A[Byte], T_A[Boolean, Byte]]]]
case class CC_C[F](a: CC_A[F]) extends T_B[T_A[T_A[CC_B, CC_B], T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]], F]
case class CC_D[G, H](a: T_A[H, H]) extends T_B[G, H]
case class CC_E[I](a: Byte, b: CC_C[I], c: (CC_D[CC_B, Char],Boolean)) extends T_B[T_A[T_A[CC_B, CC_B], T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]], I]

val v_a: T_A[T_B[CC_A[Byte], T_A[Boolean, Byte]], T_A[T_B[CC_A[Byte], T_A[Boolean, Byte]], T_B[CC_A[Byte], T_A[Boolean, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_),_)) => 0 
  case CC_B() => 1 
}
}