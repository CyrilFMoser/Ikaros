package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: (Byte,Char)) extends T_A[E, F]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A Int T_A) T_B)