package Program_55 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: ((Byte,Byte),Byte)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,0),_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_A(_, ((_,0),0)) at position 1