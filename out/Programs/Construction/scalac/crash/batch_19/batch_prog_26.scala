package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D, b: (T_A[Int, Int],T_A[Boolean, Int])) extends T_A[D, C]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
}
}