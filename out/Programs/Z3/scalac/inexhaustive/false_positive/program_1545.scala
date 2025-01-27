package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Byte,Byte)) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Int Char Wildcard (T_A Int Char))