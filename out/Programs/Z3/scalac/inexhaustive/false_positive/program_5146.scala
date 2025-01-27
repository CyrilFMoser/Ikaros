package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, (Boolean,Char)]) extends T_A[C, D]
case class CC_C[G, F]() extends T_A[G, F]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Boolean
//      Wildcard
//      Char
//      (Tuple Boolean Boolean)
//      (T_B Boolean Boolean))