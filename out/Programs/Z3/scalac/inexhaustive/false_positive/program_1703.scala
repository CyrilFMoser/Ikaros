package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Int), b: T_A[Char]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))