package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Char), b: T_A[Boolean]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)