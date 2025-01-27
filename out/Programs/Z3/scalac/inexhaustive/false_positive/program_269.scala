package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_D (Tuple (CC_B (CC_A T_A T_A) Wildcard (CC_A T_A T_A) T_A)
//             (CC_B (CC_A T_A T_A) Byte (CC_A (T_B T_A) T_A) T_A))
//      Wildcard
//      Wildcard
//      (T_B (T_B T_A)))