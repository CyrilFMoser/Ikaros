package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (Int,Byte)) extends T_A[E, D]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants