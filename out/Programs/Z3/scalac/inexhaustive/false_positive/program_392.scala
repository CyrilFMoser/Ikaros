package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_C Byte
//      Int
//      Wildcard
//      (CC_A T_B (T_A T_B Int))
//      (CC_B Int (T_A Int Int))
//      (T_A Int Byte))