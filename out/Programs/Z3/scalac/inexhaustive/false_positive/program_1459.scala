package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Byte)) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants