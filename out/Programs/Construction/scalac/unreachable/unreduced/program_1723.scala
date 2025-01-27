package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: (T_B,T_B), c: T_B) extends T_A[D, (T_A[T_B, Boolean],T_A[Int, Boolean])]
case class CC_C(a: T_B, b: T_A[Char, CC_B[T_B]]) extends T_A[T_A[Int, CC_B[T_B]], Int]
case class CC_D(a: (CC_B[CC_C],T_B), b: CC_C, c: CC_A[T_A[CC_C, T_B]]) extends T_B
case class CC_E(a: Boolean, b: Char) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((_,_), CC_C(_, _), _) => 0 
  case CC_E(true, _) => 1 
  case CC_E(false, _) => 2 
  case CC_F() => 3 
}
}