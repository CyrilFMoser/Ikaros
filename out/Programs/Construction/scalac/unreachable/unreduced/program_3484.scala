package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), ((Int,Boolean),T_A)], b: ((Int,T_A),T_B[T_A, Byte])) extends T_A
case class CC_B(a: CC_A, b: (Int,CC_A), c: T_B[Char, T_A]) extends T_A
case class CC_C[C]() extends T_B[C, CC_A]
case class CC_D[D](a: CC_B) extends T_B[D, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, (_,_), _)) => 1 
}
}