package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: Byte, b: (Byte,Boolean), c: T_A[(Boolean,Byte)]) extends T_A[CC_A[Char, Int]]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean Boolean)
//      Boolean
//      (T_A (CC_B Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_A Int
//      Boolean
//      Wildcard
//      (CC_A Int Int Int (CC_B Int Int Wildcard (T_A Int Int)) (T_A Int Int))
//      (T_A Int Boolean))