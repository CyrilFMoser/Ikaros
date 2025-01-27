package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[T_B[(Boolean,Boolean)]]]
case class CC_B() extends T_A[(T_A[Byte, Char],T_A[Char, Char]), T_B[T_B[(Boolean,Boolean)]]]
case class CC_C(a: T_A[T_A[CC_B, Int], CC_B]) extends T_B[T_B[T_A[Byte, CC_B]]]
case class CC_D(a: T_B[(CC_C,CC_B)], b: (T_B[CC_C],CC_B)) extends T_B[T_B[T_A[Byte, CC_B]]]
case class CC_E() extends T_B[T_B[T_A[Byte, CC_B]]]

val v_a: T_B[T_B[T_A[Byte, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, (_,_)) => 1 
  case CC_E() => 2 
}
}