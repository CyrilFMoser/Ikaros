package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Int,Byte)) extends T_A[C, D]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants