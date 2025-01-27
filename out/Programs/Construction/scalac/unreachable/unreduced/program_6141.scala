package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, D], c: D) extends T_A[D, Boolean]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}