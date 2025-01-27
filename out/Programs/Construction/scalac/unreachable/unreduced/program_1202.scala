package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], C]
case class CC_B() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], (CC_A[Int],T_A[Int, Char])]
case class CC_C(a: T_A[CC_A[CC_B], (CC_B,CC_B)], b: CC_A[T_A[Boolean, CC_B]]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], (CC_A[Int],T_A[Int, Char])]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], (CC_A[Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}