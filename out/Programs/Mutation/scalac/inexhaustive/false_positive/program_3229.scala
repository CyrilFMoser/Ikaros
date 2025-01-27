package Program_24 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Int), b: Int, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte Boolean))
// Mutation information: 
// Deleted Pattern CC_C(_, ((_,_),_), CC_C(_, _, _)) at position 2