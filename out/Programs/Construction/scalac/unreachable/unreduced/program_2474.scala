package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[T_A[D], D]) extends T_A[D]
case class CC_B() extends T_A[CC_A[T_A[Int]]]
case class CC_C(a: T_A[CC_A[CC_B]]) extends T_A[Char]
case class CC_D[E]() extends T_B[CC_A[T_B[CC_C, (Char,Char)]], E]
case class CC_E[F](a: CC_B, b: F) extends T_B[CC_A[T_B[CC_C, (Char,Char)]], F]
case class CC_F[G](a: G, b: G) extends T_B[CC_A[T_B[CC_C, (Char,Char)]], G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_C(CC_A(_, _)), _) => 1 
  case CC_C(_) => 2 
}
}