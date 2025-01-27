package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_B(), CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_B T_A)