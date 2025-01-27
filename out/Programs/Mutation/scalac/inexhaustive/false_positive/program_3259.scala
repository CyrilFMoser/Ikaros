package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, Int]]
case class CC_B(a: (Int,Int)) extends T_A[CC_A[Int], T_A[CC_A[Int], Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants