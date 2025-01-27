package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Byte, Int], b: T_B[T_B[Boolean]], c: T_A[T_A[Boolean, Int], Int]) extends T_A[T_B[T_B[Boolean]], Char]
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]]) extends T_A[Char, ((Boolean,CC_A),T_A[CC_A, Int])]
case class CC_C() extends T_A[T_B[T_B[Boolean]], Char]
case class CC_D(a: T_A[(Boolean,(Char,Int)), (CC_B,CC_C)], b: T_B[Boolean]) extends T_B[T_B[T_B[CC_C]]]
case class CC_E() extends T_B[T_B[T_B[CC_C]]]
case class CC_F[D]() extends T_B[D]

val v_a: T_B[T_B[T_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_F()) => 0 
  case CC_E() => 1 
  case CC_F() => 2 
}
}