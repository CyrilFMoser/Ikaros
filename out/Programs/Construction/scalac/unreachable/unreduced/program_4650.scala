package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, F], b: (Byte,CC_A[Boolean])) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[G, T_B[G, G]], b: Int) extends T_B[T_A[G, T_A[G, G]], G]
case class CC_D() extends T_B[T_A[T_B[Byte, CC_C[Boolean]], T_A[T_B[Byte, CC_C[Boolean]], T_B[Byte, CC_C[Boolean]]]], T_B[Byte, CC_C[Boolean]]]
case class CC_E(a: Boolean, b: T_A[CC_C[CC_D], T_A[CC_D, CC_D]], c: Byte) extends T_B[T_A[T_B[Byte, CC_C[Boolean]], T_A[T_B[Byte, CC_C[Boolean]], T_B[Byte, CC_C[Boolean]]]], T_B[Byte, CC_C[Boolean]]]

val v_a: T_B[T_A[T_B[Byte, CC_C[Boolean]], T_A[T_B[Byte, CC_C[Boolean]], T_B[Byte, CC_C[Boolean]]]], T_B[Byte, CC_C[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D()