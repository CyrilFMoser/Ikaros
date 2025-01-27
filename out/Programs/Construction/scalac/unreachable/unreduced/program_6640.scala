package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: Byte) extends T_A
case class CC_B[C](a: CC_A, b: T_A, c: C) extends T_B[C, Byte]
case class CC_C[D](a: T_B[D, D], b: D) extends T_B[D, Byte]
case class CC_D[E](a: CC_A, b: Byte) extends T_B[E, Byte]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A((_,_), _), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_A(_, _), _) => 2 
}
}