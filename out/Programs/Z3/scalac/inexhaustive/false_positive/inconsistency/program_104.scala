package Program_31 

object Test {
sealed trait T_B[B]
case class CC_B(a: T_B[Byte], b: ((Char,Char),(Boolean,Char))) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, ((_,'x'),_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants