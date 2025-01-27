package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Char, Char], Boolean]) extends T_A[T_A[Boolean, T_B[Boolean, Char]], Boolean]
case class CC_B[E]() extends T_B[Int, E]
case class CC_C[F](a: Int, b: CC_A) extends T_B[Int, F]
case class CC_D[G](a: G, b: (Char,Boolean), c: G) extends T_B[Int, G]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_D(_, (_,_), _) => 1 
}
}
// This is not matched: CC_B()