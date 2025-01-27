package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_A[E], c: CC_A[E]) extends T_A[E]
case class CC_C(a: (T_A[Byte],T_A[Boolean])) extends T_A[T_A[T_B[Int, Int]]]
case class CC_D[F](a: CC_C, b: Char, c: F) extends T_B[F, T_B[T_A[CC_C], CC_A[Int]]]
case class CC_E[G]() extends T_B[G, T_B[T_A[CC_C], CC_A[Int]]]
case class CC_F[H](a: H, b: T_A[H], c: (T_B[CC_C, CC_C],CC_C)) extends T_B[H, T_B[T_A[CC_C], CC_A[Int]]]

val v_a: T_B[T_A[T_A[T_B[Int, Int]]], T_B[T_A[CC_C], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C((_,_)), _, _) => 0 
  case CC_E() => 1 
  case CC_F(CC_A(_), _, (_,CC_C(_))) => 2 
  case CC_F(CC_B(_, _, _), _, (_,CC_C(_))) => 3 
  case CC_F(CC_C((_,_)), _, (_,CC_C(_))) => 4 
}
}