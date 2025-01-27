package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: (Boolean,(Boolean,Char)), b: T_A[D, D]) extends T_A[Int, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,'x')), _) => 0 
}
}
// This is not matched: (CC_C T_B (T_A T_B T_B))