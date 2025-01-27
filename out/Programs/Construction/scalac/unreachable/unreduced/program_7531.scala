package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C(a: Byte, b: CC_B[CC_B[T_B]]) extends T_B
case class CC_D(a: T_A[T_A[Int, T_B], T_B], b: T_A[(CC_C,(Byte,Int)), T_B]) extends T_B
case class CC_E(a: CC_C, b: T_A[CC_D, T_A[(Int,Char), T_B]], c: T_A[CC_B[(Int,Boolean)], T_B]) extends T_B

val v_a: T_A[CC_E, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}