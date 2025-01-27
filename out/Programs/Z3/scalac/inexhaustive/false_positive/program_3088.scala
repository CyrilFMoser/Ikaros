package Program_10 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(Int,Char)], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[B, C](a: C) extends T_B[B]
case class CC_E() extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, CC_D(_), _) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: (CC_A (CC_B T_A)
//      (CC_D (Tuple Int Char) Boolean Boolean (T_B (Tuple Int Char)))
//      Wildcard
//      T_A)
// This is not matched: (CC_A T_A Wildcard T_A)