package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: (T_A,Char)) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, (CC_B(),_)) => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)