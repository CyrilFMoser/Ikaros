package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: T_A) extends T_B[CC_A, C]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants