package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Int], T_B[Boolean, Boolean]]]
case class CC_B[D]() extends T_B[CC_A, D]
case class CC_C[E, F](a: T_B[E, F], b: T_B[CC_A, E], c: F) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B(), _) => 1 
  case CC_C(_, CC_C(_, CC_B(), _), _) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 3 
}
}