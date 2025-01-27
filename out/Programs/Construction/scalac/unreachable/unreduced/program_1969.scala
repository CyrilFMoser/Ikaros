package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_B[E, E], E]
case class CC_B(a: (T_B[Byte, Int],T_A[Char, Char]), b: CC_A[T_B[Int, Char]], c: CC_A[Boolean]) extends T_A[T_B[Boolean, Boolean], Boolean]
case class CC_C(a: (CC_A[Boolean],CC_B), b: CC_B, c: T_A[CC_A[(Int,Byte)], CC_B]) extends T_A[T_B[Boolean, Boolean], Boolean]
case class CC_D[F](a: T_A[F, F], b: Boolean) extends T_B[F, T_A[F, F]]
case class CC_E(a: (Boolean,(CC_B,CC_C)), b: Byte) extends T_B[T_A[(Char,CC_C), CC_C], T_A[T_A[(Char,CC_C), CC_C], T_A[(Char,CC_C), CC_C]]]
case class CC_F[G](a: CC_B) extends T_B[G, T_A[G, G]]

val v_a: T_B[T_A[(Char,CC_C), CC_C], T_A[T_A[(Char,CC_C), CC_C], T_A[(Char,CC_C), CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E((_,(_,_)), _) => 1 
}
}
// This is not matched: CC_F(CC_B((_,_), CC_A(_), CC_A(_)))