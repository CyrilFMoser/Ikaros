package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[Int, C]
case class CC_D[D](a: (T_A,Int)) extends T_B[Int, D]
case class CC_E[E](a: T_A, b: T_B[Int, E], c: T_B[E, CC_C[E]]) extends T_B[Int, E]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((CC_A(),_)) => 1 
  case CC_D((CC_B(),_)) => 2 
  case CC_E(CC_A(), CC_C(), _) => 3 
  case CC_E(CC_A(), CC_D(_), _) => 4 
  case CC_E(CC_A(), CC_E(_, _, _), _) => 5 
  case CC_E(CC_B(), CC_C(), _) => 6 
  case CC_E(CC_B(), CC_D(_), _) => 7 
  case CC_E(CC_B(), CC_E(_, _, _), _) => 8 
}
}