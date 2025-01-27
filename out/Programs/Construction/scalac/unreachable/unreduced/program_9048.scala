package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E], c: Char) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: Byte, b: CC_A[F]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[G, G], b: T_A[Char, G], c: (CC_A[(Byte,Char)],Byte)) extends T_A[G, T_B[G, G]]
case class CC_D[H, I](a: (T_B[Char, Byte],(Byte,Byte))) extends T_B[H, T_A[H, T_B[H, H]]]
case class CC_E[K, J](a: (CC_D[Char, Boolean],((Int,Byte),Char)), b: T_A[K, T_B[K, K]], c: CC_C[K]) extends T_B[K, J]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, (CC_A(_, _, _),_)) => 2 
}
}