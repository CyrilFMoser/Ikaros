package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: (T_B,T_B)) extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: T_A[(Boolean,Int)], b: CC_A, c: (Char,T_B)) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C(a: T_A[(Byte,Int)]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_D[B](a: CC_B, b: CC_B) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,CC_E(_))) => 0 
  case CC_B(_, _, ('x',CC_E(_))) => 1 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (Tuple Char (CC_D T_B Wildcard Wildcard T_B))
//      (T_A (T_A (Tuple Boolean Byte))))
// This is not matched: (CC_B Int Int (T_A Int Int))