package Program_31 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte Boolean))
// Mutation information: 
// Deleted Pattern CC_C(_, ((_,_),_), CC_C(_, _, _)) at position 2