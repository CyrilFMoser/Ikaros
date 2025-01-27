package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Boolean, Int], T_A[Char, Int]], (T_A[Int, Byte],T_A[Char, Int])]
case class CC_B[E](a: CC_A, b: E) extends T_A[E, T_B[E, E]]
case class CC_C[F](a: (T_A[CC_A, CC_A],CC_A)) extends T_B[F, CC_B[CC_A]]
case class CC_D[G](a: G) extends T_B[G, CC_B[CC_A]]
case class CC_E[H](a: CC_D[H], b: H) extends T_B[H, CC_B[CC_A]]

val v_a: T_B[Int, CC_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_A())) => 0 
  case CC_D(_) => 1 
  case CC_E(_, 12) => 2 
  case CC_E(_, _) => 3 
}
}