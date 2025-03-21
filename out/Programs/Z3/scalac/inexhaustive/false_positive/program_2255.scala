package Program_29 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A], b: T_A) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: CC_A, b: T_B[CC_A, T_A]) extends T_A
case class CC_D[D](a: T_B[D, D], b: CC_B[D], c: D) extends T_B[D, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_C(_, _)) => 1 
  case CC_A(_, _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (Tuple (CC_B Wildcard (CC_A Wildcard T_A) Wildcard T_A) Wildcard)
//      T_A)