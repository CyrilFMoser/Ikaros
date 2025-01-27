package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Char, Char], b: T_A) extends T_A
case class CC_C[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean (T_A Boolean Boolean)))