package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: (Boolean,(Byte,Boolean))) extends T_A[C, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(0,_))) => 0 
}
}
// This is not matched: (CC_C T_A)