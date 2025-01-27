package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Int) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: Int, b: CC_A[F], c: F) extends T_B[F]
case class CC_D[G](a: T_A[G, G], b: T_B[G], c: Int) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, CC_B(), _) => 2 
  case CC_D(_, CC_C(_, CC_A(_, _), _), _) => 3 
  case CC_D(_, CC_D(_, CC_B(), _), _) => 4 
  case CC_D(_, CC_D(_, CC_C(_, _, _), _), _) => 5 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_D(_, _, _), _), _)