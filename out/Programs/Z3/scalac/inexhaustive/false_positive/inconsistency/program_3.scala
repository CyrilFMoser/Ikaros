package Program_31 

object Test {
sealed trait T_A[B]
case class CC_A[C](a: T_A[C], b: ((Byte,Boolean),Byte)) extends T_A[T_A[C]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((0,_),_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants