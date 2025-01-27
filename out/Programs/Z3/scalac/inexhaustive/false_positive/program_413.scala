package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Byte]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean (Tuple Boolean (Tuple Int Boolean))))