package Program_10 

object Test {
sealed trait T_B[B, C]
case class CC_B[E](a: T_B[E, E], b: (Byte,Boolean)) extends T_B[Int, E]

val v_a: T_B[Int, T_B[Int, ((Boolean,Boolean),Int)]] = null
val v_b: Int = v_a match{
  case CC_B(_, (0,_)) => 0 
}
}
// This is not matched: (CC_B (CC_C Boolean Boolean) Wildcard (T_A (CC_C Boolean Boolean)))