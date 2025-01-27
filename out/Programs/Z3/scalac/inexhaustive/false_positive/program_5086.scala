package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Byte,(Int,Int))) extends T_A[D, C]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_D Int (T_B Int))