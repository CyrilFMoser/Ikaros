package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, T_B[C, C]], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[D]() extends T_B[D, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, CC_A(_, _))