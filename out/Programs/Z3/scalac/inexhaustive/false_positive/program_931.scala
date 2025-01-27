package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, C], b: T_A[D, D], c: C) extends T_A[C, D]
case class CC_B[F]() extends T_A[F, T_A[Byte, Boolean]]

val v_a: T_A[Int, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 3 
  case CC_A(_, CC_A(_, _, _), 12) => 4 
  case CC_A(CC_A(_, _, _), _, 12) => 5 
}
}
// This is not matched: (CC_A Int
//      (T_A Byte Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int (T_A Byte Boolean)))
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)