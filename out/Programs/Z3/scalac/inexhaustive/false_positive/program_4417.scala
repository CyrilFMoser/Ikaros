package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Boolean)) extends T_A[Int]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_C T_A)