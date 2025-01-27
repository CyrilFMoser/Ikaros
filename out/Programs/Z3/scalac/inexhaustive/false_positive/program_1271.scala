package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Byte,Boolean)) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Byte Wildcard (T_A Byte Boolean))