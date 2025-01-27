package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Boolean, (Int,Boolean)], C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_D T_B) Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(_, CC_E(_, _), CC_A()) at position 1