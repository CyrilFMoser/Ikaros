package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[Boolean], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F, G](a: T_A[F], b: F) extends T_B[F, CC_A[CC_B[Boolean]]]
case class CC_D(a: T_A[Int]) extends T_B[CC_A[Int], CC_A[CC_B[Boolean]]]
case class CC_E(a: T_A[CC_A[CC_D]], b: T_A[CC_D], c: T_A[CC_B[(Int,Char)]]) extends T_B[CC_A[Int], CC_A[CC_B[Boolean]]]

val v_a: T_B[CC_A[Int], CC_A[CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _) => 0 
  case CC_C(CC_B(_), _) => 1 
  case CC_D(_) => 2 
  case CC_E(_, _, _) => 3 
}
}