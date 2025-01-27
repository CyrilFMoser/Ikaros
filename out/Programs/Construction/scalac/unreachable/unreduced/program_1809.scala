package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Char]], b: CC_A[CC_A[Int]]) extends T_A[CC_B[T_A[Int]]]
case class CC_D[F]() extends T_B[F, CC_C]
case class CC_E[G](a: G, b: CC_D[G], c: T_B[G, CC_C]) extends T_B[G, CC_C]

val v_a: T_A[CC_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_C(CC_A(_), _) => 4 
  case CC_C(CC_B(_), _) => 5 
}
}