package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Byte,Byte), Char], T_B[T_A, T_A]], b: Boolean, c: T_B[T_B[(Char,Char), Char], T_A]) extends T_A
case class CC_B(a: (T_B[T_A, T_A],Boolean), b: T_B[(CC_A,CC_A), T_A], c: T_B[CC_A, T_A]) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_B[CC_B, T_B[CC_A, T_A]]
case class CC_D[C](a: T_B[CC_B, T_B[CC_A, T_A]]) extends T_B[CC_A, C]
case class CC_E[D](a: T_B[CC_B, T_B[CC_A, T_A]]) extends T_B[CC_A, D]

val v_a: T_B[CC_A, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_A(_, _, _), CC_B(_, _, _))) => 0 
  case CC_D(CC_C(CC_B(_, _, _), CC_B(_, _, _))) => 1 
  case CC_E(_) => 2 
}
}