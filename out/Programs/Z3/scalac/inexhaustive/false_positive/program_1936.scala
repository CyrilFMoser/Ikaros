package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: T_A[Boolean], c: T_A[Int]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A Boolean Wildcard (T_A Boolean (T_A T_B Int)))
//      Wildcard
//      (T_A Boolean (T_A T_B Int)))