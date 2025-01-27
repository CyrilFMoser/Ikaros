package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[((Boolean,Char),T_A)]) extends T_A
case class CC_B(a: Boolean, b: (((Byte,Boolean),CC_A),CC_A), c: T_A) extends T_A
case class CC_C(a: Char, b: T_B[T_A], c: Int) extends T_A
case class CC_D(a: T_B[CC_B]) extends T_B[CC_A]
case class CC_E() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
}
}