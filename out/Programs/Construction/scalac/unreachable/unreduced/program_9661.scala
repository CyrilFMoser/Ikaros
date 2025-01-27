package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[Int, C]
case class CC_B(a: (CC_A[Boolean],T_A[Int, Boolean]), b: Byte) extends T_A[Int, T_A[Int, T_A[Boolean, Char]]]

val v_a: T_A[Int, T_A[Int, T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, _) => 1 
}
}