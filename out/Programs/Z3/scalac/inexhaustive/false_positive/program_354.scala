package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Int), b: T_A[Byte]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: (CC_C (CC_A Boolean (T_A Byte)) (T_A Byte))