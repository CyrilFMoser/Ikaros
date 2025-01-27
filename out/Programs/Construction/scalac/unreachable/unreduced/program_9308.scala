package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Char]], b: Byte, c: Int) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_B() extends T_A[T_B[Char, T_A[CC_A]]]
case class CC_C(a: T_A[CC_B], b: T_A[T_B[CC_B, CC_A]], c: (CC_B,Byte)) extends T_A[T_B[Char, T_A[CC_A]]]
case class CC_D[D, E](a: D) extends T_B[E, D]
case class CC_E[F, G](a: CC_D[G, F], b: T_B[G, G]) extends T_B[F, G]
case class CC_F[I, H]() extends T_B[I, H]

val v_a: T_A[T_B[Char, T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, (CC_B(),_)) => 1 
}
}