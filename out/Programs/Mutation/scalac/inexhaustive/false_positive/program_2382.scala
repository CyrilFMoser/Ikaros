package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: (Int,Char)) extends T_A[E, F]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Byte
//      (CC_A Boolean Boolean Boolean Boolean (T_A Boolean Boolean))
//      Wildcard
//      (T_A Byte Byte))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(_), CC_A(_)) at position 1