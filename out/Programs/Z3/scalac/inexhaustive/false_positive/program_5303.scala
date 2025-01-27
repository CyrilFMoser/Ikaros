package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: Char, c: T_A) extends T_A
case class CC_B(a: T_B[Byte, T_A], b: T_B[T_A, T_A], c: (T_A,T_A)) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: CC_A[D], b: D) extends T_B[(CC_B,(Int,Int)), D]
case class CC_E[E](a: E, b: E, c: Int) extends T_B[(CC_B,(Int,Int)), E]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Char Int (CC_B Int Int Wildcard (T_A Int Int)) (T_A Char Int))