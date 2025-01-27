package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_B[Char]], T_A[Boolean, T_B[Char]]]
case class CC_B[D]() extends T_A[D, (T_B[CC_A],T_A[Byte, CC_A])]
case class CC_C(a: T_A[Char, CC_B[CC_A]]) extends T_B[CC_A]
case class CC_D(a: Int, b: CC_C) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}