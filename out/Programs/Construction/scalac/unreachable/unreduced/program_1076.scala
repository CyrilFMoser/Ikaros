package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: (Char,T_B[Char]), b: T_B[T_B[Char]], c: Byte) extends T_B[Char]
case class CC_D(a: T_A) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _)) => 1 
}
}
// This is not matched: CC_D(CC_A(_, _, _))