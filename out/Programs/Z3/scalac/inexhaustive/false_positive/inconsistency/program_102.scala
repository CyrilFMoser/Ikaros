package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B
case class CC_A(a: (Int,T_B)) extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[T_B]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A((12,_)), _) => 1 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A Int Char) (CC_A Byte Boolean Boolean Boolean)))