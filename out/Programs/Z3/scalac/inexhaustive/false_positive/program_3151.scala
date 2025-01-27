package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Int], b: (Byte,Boolean)) extends T_A[T_A[(Boolean,Boolean), Int], ((Char,Int),Byte)]

val v_a: T_A[T_A[(Boolean,Boolean), Int], ((Char,Int),Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants