package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[Int]]
case class CC_B() extends T_A[T_B[Byte], T_B[Int]]

val v_a: CC_A[T_A[T_B[Byte], T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_A Int Wildcard Wildcard (T_A T_B Int))