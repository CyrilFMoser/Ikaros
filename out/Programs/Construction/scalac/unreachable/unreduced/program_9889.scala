package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, T_B[Char, Byte]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_B(a: T_A[CC_A], b: T_B[(CC_A,CC_A), T_B[(Char,Char), CC_A]], c: T_B[T_A[CC_A], T_A[CC_A]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_C() extends T_A[T_A[T_B[Char, Char]]]
case class CC_D[D, E](a: CC_C) extends T_B[E, D]
case class CC_E[F](a: F) extends T_B[F, T_B[F, F]]
case class CC_F[G](a: CC_B) extends T_B[G, (Boolean,CC_D[CC_C, CC_C])]

val v_a: T_A[T_A[T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_B(_, CC_D(CC_C()), CC_D(CC_C())) => 1 
  case CC_C() => 2 
}
}