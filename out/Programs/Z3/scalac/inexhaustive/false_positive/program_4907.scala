package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: T_A[Boolean, D], b: T_A[Int, D]) extends T_A[Int, D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      Wildcard
//      (CC_A Char
//            Wildcard
//            Wildcard
//            (CC_A Char Wildcard Wildcard Wildcard (T_A Char))
//            (T_A Char))
//      (T_A Char))