package Program_29 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: (CC_A (CC_D T_A T_A (T_B T_A T_A))
//      (CC_C T_A)
//      (CC_A Wildcard Wildcard (CC_C T_A) T_A)
//      T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_D(), _, CC_C()) at position 3