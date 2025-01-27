package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Boolean)) extends T_A[T_A[Byte, Int], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants