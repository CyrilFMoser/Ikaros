package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Int Int (T_A Int Int))