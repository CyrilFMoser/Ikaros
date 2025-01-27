package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_B[T_A, T_A]), b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, CC_A]) extends T_A
case class CC_C(a: Byte, b: T_A) extends T_A
case class CC_D[C](a: T_A, b: CC_A) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((12,CC_D(_, _)), _) => 0 
  case CC_A((_,CC_D(_, _)), _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _) => 3 
}
}