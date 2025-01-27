package Program_13 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B(a: T_A[Char], b: T_A[Byte], c: CC_A[Int, Int]) extends T_A[(Boolean,Boolean)]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, _) => 0 
}
}
// This is not matched: (CC_B (CC_C Char (T_A Char)) Wildcard Wildcard (T_A (Tuple Boolean Boolean)))
// This is not matched: Pattern match is empty without constants