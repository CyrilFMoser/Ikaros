package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: D) extends T_A[D]
case class CC_B() extends T_A[(CC_A[(Boolean,Boolean)],T_A[Char])]
case class CC_C(a: Boolean) extends T_A[(CC_A[(Boolean,Boolean)],T_A[Char])]
case class CC_D[E](a: Char, b: CC_A[E], c: E) extends T_B[E, CC_C]
case class CC_E[F](a: T_B[F, CC_C], b: T_B[F, F]) extends T_B[F, CC_C]
case class CC_F[G](a: T_B[G, CC_C]) extends T_B[G, CC_C]

val v_a: T_A[(CC_A[(Boolean,Boolean)],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}