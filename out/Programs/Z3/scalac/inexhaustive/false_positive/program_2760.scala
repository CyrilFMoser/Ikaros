package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Int,Byte)) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants