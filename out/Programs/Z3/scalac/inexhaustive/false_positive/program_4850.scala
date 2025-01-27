package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B(a: (Int,Int)) extends T_A[T_A[Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants