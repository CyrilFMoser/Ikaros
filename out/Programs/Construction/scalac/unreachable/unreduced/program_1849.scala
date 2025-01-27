package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte]) extends T_A
case class CC_B(a: (T_A,Int), b: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[T_A], b: CC_A, c: Byte) extends T_B[(T_A,Byte)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}
// This is not matched: CC_C(CC_A(_))