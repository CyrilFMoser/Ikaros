package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Byte)) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants