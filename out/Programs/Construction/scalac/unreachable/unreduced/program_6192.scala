package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, E], b: T_B[E, F], c: F) extends T_A[E, T_A[E, E]]
case class CC_B[G](a: T_A[G, T_A[G, G]], b: T_A[G, G]) extends T_A[G, T_A[G, G]]
case class CC_C[I, H](a: (Byte,T_A[(Boolean,Char), Boolean])) extends T_B[H, I]
case class CC_D[K, J](a: J) extends T_B[K, J]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C((_,_))