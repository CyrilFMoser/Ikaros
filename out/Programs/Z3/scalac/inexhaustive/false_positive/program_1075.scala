package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[Boolean, C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char))