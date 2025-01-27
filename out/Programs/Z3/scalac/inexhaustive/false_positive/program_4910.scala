package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Byte)) extends T_A[T_A[Int, Int], C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A Char)))