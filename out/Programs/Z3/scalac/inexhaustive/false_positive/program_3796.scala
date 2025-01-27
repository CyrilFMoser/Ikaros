package Program_15 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_B T_B (T_A T_B))
// This is not matched: (CC_A Wildcard (T_A (T_A (Tuple Char Byte))))