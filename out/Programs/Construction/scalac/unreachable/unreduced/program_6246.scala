package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F]) extends T_A[E, F]
case class CC_B[G]() extends T_A[G, T_B[G, G]]
case class CC_C[H](a: T_B[H, H], b: CC_B[H], c: T_A[(Byte,(Byte,Int)), H]) extends T_B[Byte, H]
case class CC_D[I](a: (T_B[Byte, Int],Int), b: Boolean) extends T_B[Byte, I]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D((CC_C(_, _, _),_), _) => 0 
  case CC_D((CC_D(_, _),_), _) => 1 
}
}