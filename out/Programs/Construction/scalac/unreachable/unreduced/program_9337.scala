package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], C]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: (CC_B[Boolean],CC_A[Boolean]), b: Char, c: CC_A[T_A[Byte, (Int,Boolean)]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], T_A[Int, Byte]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Byte]], T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C((CC_B(),CC_A(_, _)), _, _) => 1 
}
}